package tech.tylor.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tech.tylor.blog.model.BlogPost;
import org.springframework.stereotype.Controller;
import tech.tylor.blog.repository.BlogPostRepository;

@Controller
public class BlogPostController {

    @Autowired
    private BlogPostRepository blogPostRepository;
    //private static List<BlogPost> posts = new ArrayList<>();




    @GetMapping("/")
    public String index(BlogPost blogPost, Model model) {
        model.addAttribute("posts", blogPostRepository.findAll());
        return "blogpost/index";
    }

    @PostMapping("/blogposts")
    public String addNewBlogPost(BlogPost blogPost, Model model) {
        blogPostRepository.save(blogPost);
        //posts.add(blogPost);
        model.addAttribute("title", blogPost.getTitle());
        model.addAttribute("author", blogPost.getAuthor());
        model.addAttribute("blogEntry", blogPost.getBlogEntry());
        return "blogpost/result";
    }

    @GetMapping(value = "/blogposts/new")
    public String newBlog (BlogPost blogPost) {
        return "blogpost/new";
    }

    // TODO: edit blogpost method
    @GetMapping("/blogposts/{id}")
    public String editPostById (@PathVariable Long id, BlogPost blogPost, Model model) {
        model.addAttribute("blogPost", blogPostRepository.findById(id).orElseThrow());
        return "blogpost/edit";

    }

    @PostMapping("/blogposts/update/{id}")
    public String updateExistingPost (@PathVariable Long id, BlogPost blogPost, Model model) {
        var actualPost = blogPostRepository.findById(id).orElseThrow();
        actualPost.setTitle(blogPost.getTitle());
        actualPost.setAuthor(blogPost.getAuthor());
        actualPost.setBlogEntry(blogPost.getBlogEntry());
        blogPostRepository.save(actualPost);
        model.addAttribute("blogPost", actualPost);
        return "blogpost/result";

    }



    @RequestMapping("/blogposts/delete/{id}")
    public String deletePostById(@PathVariable Long id, BlogPost blogPost) {
        blogPostRepository.deleteById(id);
        return "blogpost/delete";
    }
}
