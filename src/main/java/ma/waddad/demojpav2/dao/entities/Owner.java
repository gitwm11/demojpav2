package ma.waddad.demojpav2.dao.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Entity
@Getter @Setter
@ToString
@Table(name = "owners")
@AllArgsConstructor @NoArgsConstructor
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String email;

    @OneToMany(mappedBy = "owner" ,fetch = FetchType.LAZY)
    private Collection<Blog> blogs;

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", blogs=" + blogs +
                '}';
    }
}
