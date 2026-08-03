package com.anass.book.book;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookResponse {

    private Integer id;
    private String title;
    private String author;
    private String isbn;
    private String synopsis;
    private String owner;
    private byte[] cover;
    private boolean archived;
    private boolean shareable;
    private double rate;
}
