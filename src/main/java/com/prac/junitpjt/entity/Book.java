package com.prac.junitpjt.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String title;
    @Column(length = 20, nullable = false)
    private String author;


}
