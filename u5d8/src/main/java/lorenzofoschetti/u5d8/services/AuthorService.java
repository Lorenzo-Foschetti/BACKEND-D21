package lorenzofoschetti.u5d8.services;

import lorenzofoschetti.u5d8.entities.Author;
import lorenzofoschetti.u5d8.exceptions.BadRequestException;
import lorenzofoschetti.u5d8.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author saveAuthor(Author body) {

        this.authorRepository.findByEmail(body.getEmail()).ifPresent(
                // 1.1 Se lo è triggero un errore
                user -> {
                    throw new BadRequestException("L'email " + body.getEmail() + " è già in uso!");
                }
        );
        body.setAvatar("https://ui-avatars.com/api/?name=" + body.getName() + body.getSurname());

        return authorRepository.save(body);
    }

    public Page<Author> getAuthorsList(int pageNumber, int pageSize, String sortBy) {
        if (pageSize > 20) pageSize = 20;
        Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by(sortBy));
        return authorRepository.findAll(pageable);
    }
}
