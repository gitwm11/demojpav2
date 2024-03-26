package ma.waddad.demojpav2;

import ma.waddad.demojpav2.dao.entities.Blog;
import ma.waddad.demojpav2.dao.entities.Owner;
import ma.waddad.demojpav2.service.BlogManager;
import ma.waddad.demojpav2.service.OwnerManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SpringBootApplication
public class Demojpav2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demojpav2Application.class, args);
    }

    @Bean
    public CommandLineRunner start(OwnerManager ownerManager, BlogManager blogManager){

        return args -> {
            Blog blog1 = new Blog();
            Blog blog2 = new Blog(null,"blog2","cs","jee",null);


            blogManager.addBlog(blog1);
            blogManager.addBlog(blog2);

            Owner owner1 = new Owner(null,"owner1","owner1@gmail.com", List.of(blog1));

            ownerManager.addOwner(owner1);

            Owner owner2 = new Owner();
            owner2.setName("owner2");
            owner2.setEmail("owner2@gmail.com");
            owner2.setBlogs(List.of(blog2));


            ownerManager.addOwner(owner2);

            Owner owner3 = new Owner();
            owner3.setId(owner2.getId());
            owner3.setName("owner3");
            owner3.setEmail("owner3@gmail.com");
            owner3.setBlogs(List.of(blog2));

            ownerManager.updateOwner(owner3);

            Blog blog3 = new Blog(null,"blog3","cs","py",owner3);
            blogManager.addBlog(blog3);

            Owner owner4 = new Owner(null,"owner1","owner1@gmail.com", List.of(blog3));

            ownerManager.addOwner(owner4);



            //System.out.println(ownerManager.getAllOwners());

            ownerManager.deleteOwner(owner1);


            Blog blog4 = new Blog();
            blog4.setId(blog2.getId());
            blog4.setTitle("blog4");
            blog4.setCategory("ai");
            blog4.setContent("ml");
            blog4.setOwner(owner4);

            blogManager.updateBlog(blog4);

            blogManager.deleteBlog(blog1);




            //System.out.println(blogManager.getAllBlogs());






        };
    }

}
