package com.example.demo.dto.note;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoteRequest {
    private String deadline;
    private String task;
    private String description;
}
