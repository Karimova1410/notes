package com.example.demo.mapper.impl;

import com.example.demo.dto.note.NoteResponse;
import com.example.demo.entities.Note;
import com.example.demo.mapper.NoteMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class NoteMapperImpl implements NoteMapper {
    @Override
    public NoteResponse toDto(Note note){
        NoteResponse noteResponse = new NoteResponse();
        noteResponse.setId(note.getId());
        noteResponse.setDeadline(note.getDeadline());
        noteResponse.setTask(note.getTask());
        noteResponse.setDescription(note.getDescription());
        return noteResponse;
    }

    @Override
    public List<NoteResponse> toDtoS(List<Note> all) {
        List<NoteResponse> noteResponses = new ArrayList<>();
        for(Note note : all){
            noteResponses.add(toDto(note));
        }
        return noteResponses;
    }

}
