package com.popovich.training.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Note {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "text")
    private String text;

    @OneToMany
    private List<NoteComment> comments = new ArrayList<>();

    public Note (String name, String text) {
        this.name = name;
        this.text = text;
    }
}
