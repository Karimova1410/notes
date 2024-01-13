package com.example.demo.service;

import com.example.demo.dto.note.NoteRequest;
import com.example.demo.dto.note.NoteResponse;

import java.util.List;

public interface NoteService {
    NoteResponse getById(Long id);

    void addNote(NoteRequest noteRequest);

    void deleteById(Long id);

    void updateById(Long id, NoteRequest noteRequest);


    List<NoteResponse> getAll();
}
