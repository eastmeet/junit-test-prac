package com.prac.junitpjt.entity;

import com.prac.junitpjt.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class BookRepositoryTest {
    @Autowired
    private BookRepository bookRepository;

    @Test
    public void 책등록_test() {
        System.out.println("책등록_test 실행");
    }

    // 1. 책 등록

    // 2. 책 목록보기

    // 3. 책 한건보기
}
