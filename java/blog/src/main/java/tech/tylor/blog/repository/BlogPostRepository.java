package tech.tylor.blog.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tech.tylor.blog.model.BlogPost;


@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {


}
