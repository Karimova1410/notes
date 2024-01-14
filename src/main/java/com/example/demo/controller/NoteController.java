package com.example.demo.controller;

import com.example.demo.dto.note.NoteRequest;
import com.example.demo.dto.note.NoteResponse;

import com.example.demo.entities.User;
import com.example.demo.mapper.NoteMapper;
import com.example.demo.repositories.NoteRepository;
import com.example.demo.service.NoteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@AllArgsConstructor
@RequestMapping("/note")
public class NoteController {
    private final NoteService noteService;
    private final NoteRepository noteRepository;
    private final NoteMapper noteMapper;


    @GetMapping("/{id}")
    public NoteResponse getById(@PathVariable Long id){
        return noteService.getById(id);
    }

    @PostMapping("/add")
    public void addNote(@RequestBody NoteRequest noteRequest){
        noteService.addNote(noteRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        noteService.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public void updateById(@PathVariable Long id, @RequestBody NoteRequest noteRequest){
        noteService.updateById(id,noteRequest);
    }
    @GetMapping("/getAllCategories")
    public List<NoteResponse> noteResponses(){
        return noteService.getAll();
    }

    @GetMapping("/getUserNotes/{userId}")
    public List<NoteResponse> userNotes(@PathVariable Long userId){
        return noteService.getUserNotes(userId);
    }

    @PostMapping("/addNoteToUser/{userId}")
    public void addNoteToUser(@PathVariable Long userId, @RequestBody NoteRequest noteRequest) {
        noteService.addNoteToUser(userId, noteRequest);
    }



}
