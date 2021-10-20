package co.edu.reto3.reto3.repository.crud;

import org.springframework.data.repository.CrudRepository;

import co.edu.reto3.reto3.model.Message;


public interface MessageCrudRepositorio extends CrudRepository<Message,Integer> {
    
}
