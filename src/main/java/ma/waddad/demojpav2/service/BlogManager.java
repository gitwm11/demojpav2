package ma.waddad.demojpav2.service;

import ma.waddad.demojpav2.dao.entities.Blog;

import java.util.List;

public interface BlogManager {
    public Blog addBlog(Blog blog);
    public Blog updateBlog(Blog blog);
    public boolean deleteBlog(Blog blog);
    public List<Blog> getAllBlogs();
}
