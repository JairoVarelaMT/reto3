package co.edu.reto3.reto3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.reto3.reto3.model.Message;
import co.edu.reto3.reto3.repository.crud.MessageCrudRepositorio;


@Repository
public class MessageRepositorio {
    @Autowired
    private MessageCrudRepositorio messageCrudRepositorio;
//METODO GET TODAS LOS mensajes
    public List<Message> getAll(){
        return (List<Message>)messageCrudRepositorio.findAll();
    }
//METODO GET SOLO 1 MENSAJE POR ID O PRIMARY KEY
    public Optional<Message> getMessage(int id) {
        return messageCrudRepositorio.findById(id);
    }
//METODO POST GUARDA 1 MENSAJE EN LA BD
    public Message save(Message mensaje){
        return messageCrudRepositorio.save(mensaje);
    }
}
