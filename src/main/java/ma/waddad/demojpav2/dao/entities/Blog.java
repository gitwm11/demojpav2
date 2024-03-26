package ma.waddad.demojpav2.dao.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@ToString
@Table(name = "blogs")
@AllArgsConstructor @NoArgsConstructor
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String category;

    private String content;

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", content='" + content + '\'' +
                ", owner=" + owner +
                '}';
    }

    @ManyToOne
    private Owner owner;
}
