package com.example.demo.dto.note;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoteResponse {
    private String task;
    private String description;
    private String deadline;
}

