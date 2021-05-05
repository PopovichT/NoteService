package com.popovich.training.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class NoteComment {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "text")
    private String text;

    @ManyToOne
    @JoinColumn(name = "note_id")
    private Note note;

    public NoteComment (String name, String text, Note note){
        this.name = name;
        this.text = text;
        this.note = note;
    }

}
