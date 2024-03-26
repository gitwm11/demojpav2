package ma.waddad.demojpav2.service;

import jakarta.transaction.Transactional;
import ma.waddad.demojpav2.dao.entities.Blog;
import ma.waddad.demojpav2.dao.repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BlogService implements BlogManager{

    @Autowired
    private BlogRepository blogRepository;
    @Override
    public Blog addBlog(Blog blog) {
        try {
            return blogRepository.save(blog);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            return null;
        }

    }

    @Override
    public Blog updateBlog(Blog blog) {

        try {
            return blogRepository.save(blog);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            return null;
        }
    }

    @Override
    public boolean deleteBlog(Blog blog) {
        try {
            blogRepository.delete(blog);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            return false;
        }
        return false;
    }

    @Override
    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }
}
