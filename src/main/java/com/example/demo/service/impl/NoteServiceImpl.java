package com.example.demo.service.impl;

import com.example.demo.dto.note.NoteRequest;
import com.example.demo.dto.note.NoteResponse;
import com.example.demo.dto.user.UserResponse;
import com.example.demo.entities.Note;
import com.example.demo.exception.NotFoundException;
import com.example.demo.mapper.NoteMapper;
import com.example.demo.repositories.NoteRepository;
import com.example.demo.service.NoteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class NoteServiceImpl implements NoteService {
    private final NoteRepository noteRepository;
    private final NoteMapper noteMapper;

    @Override
    public NoteResponse getById(Long id){
        Optional<Note> note = noteRepository.findById(id);
        if(note.isEmpty())
            throw new NotFoundException("user not found with id:"+id+"!", HttpStatus.BAD_REQUEST);

        return noteMapper.toDto(note.get());
    }

    @Override
    public void addNote(NoteRequest noteRequest) {
        Note note = new Note();
        note.setDeadline(noteRequest.getDeadline());
        note.setTask(noteRequest.getTask());
        note.setDescription(noteRequest.getDescription());
        noteRepository.save(note);
    }

    @Override
    public void deleteById(Long id) {
        if(noteRepository.findById(id).isEmpty())
            throw new NotFoundException("user not found with id:"+id+"!", HttpStatus.BAD_REQUEST);
        noteRepository.deleteById(id);

    }

    @Override
    public void updateById(Long id, NoteRequest noteRequest) {
        Optional<Note> note = noteRepository.findById(id);
        if(note.isEmpty())
            throw new NotFoundException("user not found with id:"+id+"!", HttpStatus.BAD_REQUEST);
        note.get().setDescription(noteRequest.getDescription());
        note.get().setTask(noteRequest.getTask());
        note.get().setDeadline(noteRequest.getDeadline());
        noteRepository.save(note.get());

    }

    @Override
    public List<NoteResponse> getAll() {
        return noteMapper.toDtoS(noteRepository.findAll());
    }


}
