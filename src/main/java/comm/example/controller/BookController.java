package comm.example.controller;

import comm.example.dao.BookRepository;
import comm.example.dao.PageRepository;
import comm.example.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@EnableTransactionManagement
@EnableAutoConfiguration
public class BookController {
    private BookRepository bookRepository;
    private PageRepository pageRepository;

    @Autowired
    public BookController(BookRepository bookRepository, PageRepository pageRepository) {
        this.bookRepository = bookRepository;
        this.pageRepository = pageRepository;
    }

    @PostMapping("/books")
    @Transactional
    public ResponseEntity<Book> createBook(@RequestBody Book book) {

        return ResponseEntity.status(HttpStatus.CREATED).body(bookRepository.save(book));

    }
}
