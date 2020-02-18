package com.github.pagram1975.autowiremagic.autowired;

import com.github.pagram1975.autowiremagic.AuthorService;
import com.github.pagram1975.autowiremagic.model.web.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/")
    public List<Author> getAllAuthors() {
        List<Author> list = authorService.getAllAuthors().stream().collect(Collectors.toList());
        return list;
    }
}