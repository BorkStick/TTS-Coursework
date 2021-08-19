package tech.tylor.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import tech.tylor.blog.model.BlogPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import tech.tylor.blog.repository.BlogPostRepository;

@Controller
public class BlogPostController {

    @Autowired
    private BlogPostRepository blogPostRepository;


    @GetMapping("/")
    public String index(BlogPost blogPost) {
        return "blogpost/index";
    }

    @PostMapping("/")
    public String addNewBlogPost(BlogPost blogPost, Model model) {
        blogPostRepository.save(blogPost);
        model.addAttribute("title", blogPost.getTitle());
        model.addAttribute("author", blogPost.getAuthor());
        model.addAttribute("blogEntry", blogPost.getBlogEntry());
        return "blogpost/result";
    }
}
