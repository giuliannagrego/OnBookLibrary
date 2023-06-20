package com.giulianna.OnBookLibrary.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_books")
@NoArgsConstructor
@Getter
@Setter
public class OnBookLibrary {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name = "title", nullable = false, unique = true)
    private String title;

    @Column(name = "isbn", nullable = false, unique = true)
    private String isbn;

    @Column(name = "author", nullable = false)
    private String author;

    @Builder
    public OnBookLibrary(String title, Integer isbn, String author){
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }
}
