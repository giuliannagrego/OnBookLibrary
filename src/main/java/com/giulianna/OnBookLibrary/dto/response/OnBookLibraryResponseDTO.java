package com.giulianna.OnBookLibrary.dto.response;

import java.awt.print.Book;

public class OnBookLibraryResponseDTO {
    private Long id;

    private String title;

    private Integer isbn;

    private String author;

    public OnBookLibraryResponseDTO(Book book) {
        this.id = book.getId();
        this.title = book.getTitle();
        this.isbn = book.getIsbn();
        this.author = book.getAuthor();

    }
}
