package lorenzofoschetti.u5d8.services;

import lorenzofoschetti.u5d8.repositories.BlogpostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogpostService {

    @Autowired
    private BlogpostRepository blogpostRepository;

//
//    public Page<Blogpost> getBlogPostList(int pageNumber, int pageSize, String sortBy) {
//        if (pageSize > 20) pageSize = 20;
//        Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by(sortBy));
//        return blogpostRepository.findAll(pageable);
//    }
//
//    public Blogpost saveBlogPost(Blogpost body) {
//
//        return blogpostRepository.save(body);
//    }
}
