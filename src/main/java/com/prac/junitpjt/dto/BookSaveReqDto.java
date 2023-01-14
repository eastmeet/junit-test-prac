package com.prac.junitpjt.dto;

import lombok.Builder;
import lombok.Setter;

@Setter
@Builder
public class BookSaveReqDto {
    private String title;
    private String author;

/*    public Book toEntity() {
        return Book.builder()
                .title(title)
                .author(author)
                .build();
    }*/
}
