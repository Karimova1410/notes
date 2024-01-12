package com.example.demo.mapper.impl;

import com.example.demo.dto.note.NoteResponse;
import com.example.demo.entities.Note;
import com.example.demo.mapper.NoteMapper;
import org.springframework.stereotype.Component;



@Component
public class NoteMapperImpl implements NoteMapper {
    @Override
    public NoteResponse toDto(Note note){
        NoteResponse noteResponse = new NoteResponse();
        noteResponse.setDeadline(note.getDeadline());
        noteResponse.setTask(note.getTask());
        noteResponse.setDescription(note.getDescription());
        return noteResponse;
    }

}
