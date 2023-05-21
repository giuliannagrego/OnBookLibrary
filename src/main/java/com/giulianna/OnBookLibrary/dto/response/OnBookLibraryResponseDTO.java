package com.giulianna.OnBookLibrary.dto.response;

import com.giulianna.OnBookLibrary.entity.OnBookLibrary;
import lombok.Getter;

import java.awt.print.Book;
@Getter
public class OnBookLibraryResponseDTO {
    private Long id;

    private String title;

    private Integer isbn;

    private String author;

    public OnBookLibraryResponseDTO(OnBookLibrary onBookLibrary) {
        this.id = onBookLibrary.getId();
        this.title = onBookLibrary.getTitle();
        this.isbn = onBookLibrary.getIsbn();
        this.author = onBookLibrary.getAuthor();

    }
}
