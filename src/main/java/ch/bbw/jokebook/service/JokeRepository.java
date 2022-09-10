package ch.bbw.jokebook.service;

import ch.bbw.jokebook.model.Joke;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//@Repository
public interface JokeRepository extends CrudRepository<Joke, Long> {
	/*
    <S extends T> S save(S entity);
    
    T findOne(ID primaryKey);
    
    Iterable<T> findAll();
    
    Long count();
    
    void delete(T entity);
    
    boolean exists(ID primaryKey);
    
    ... more functionality omitted.
    
     */

}
