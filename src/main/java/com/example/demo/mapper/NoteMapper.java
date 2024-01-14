package com.example.demo.mapper;

import com.example.demo.dto.note.NoteResponse;
import com.example.demo.entities.Note;

import java.util.List;


public interface NoteMapper {
    NoteResponse toDto(Note note);
    List<NoteResponse> toDtoS(List<Note> all);


}
