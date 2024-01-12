package com.example.demo.controller;

import com.example.demo.dto.note.NoteRequest;
import com.example.demo.dto.note.NoteResponse;

import com.example.demo.service.NoteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;



@RestController
@AllArgsConstructor
@RequestMapping("/note")
public class NoteController {
    private final NoteService noteService;


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


}
