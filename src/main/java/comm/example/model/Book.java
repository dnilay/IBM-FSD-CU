package comm.example.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private int bookId;
    @Column(name = "book_name")
    private String bookName;
    @Column(name = "book_type")
    private String bookType;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private List<Page> pages;
}
