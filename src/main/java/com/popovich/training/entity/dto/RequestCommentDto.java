package com.popovich.training.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestCommentDto {
    private String name;
    private String text;
    private String noteName;
}
