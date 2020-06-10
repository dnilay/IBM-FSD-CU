package comm.example.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "page_number")
    private int pageNumber;
    private String content;

}
