package com.pluralsight.blog.data;



//@Component
//public class AuthorRepository {
//    public List<Author> findAll() {
//        return new ArrayList<>();
//    }
//
//    public List<Author> saveAll(List<Author> authors) {
//        return new ArrayList<>();
//    }
//}

import com.pluralsight.blog.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface AuthorRepository extends JpaRepository<Author, Long> {

}