package co.edu.reto3.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.reto3.reto3.model.Message;
import co.edu.reto3.reto3.repository.MessageRepositorio;

@Service
public class MessageServicio {
    @Autowired
    private MessageRepositorio messageRepositorio;

    public List<Message>getAll(){
        return messageRepositorio.getAll();
    }

    public Optional<Message>getMessage(int id){
        return messageRepositorio.getMessage(id);
    }

    public Message save(Message mensaje){
        //Verificamos si la categoria es nuevo y de ser así se guarda
        if (mensaje.getIdMessage()==null) {
            return messageRepositorio.save(mensaje);            
        }else{ //Si el objeto viene con un Id verificamos si existe o no
            Optional<Message> consulta=messageRepositorio.getMessage(mensaje.getIdMessage());
            if (consulta.isEmpty()) {
                return messageRepositorio.save(mensaje);                
            } else {
                return mensaje;                
            }
        }
    }
}
