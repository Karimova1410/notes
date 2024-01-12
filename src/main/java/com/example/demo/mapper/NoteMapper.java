package com.example.demo.mapper;

import com.example.demo.dto.note.NoteResponse;
import com.example.demo.entities.Note;


public interface NoteMapper {
    NoteResponse toDto(Note note);

}
