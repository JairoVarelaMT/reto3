package co.edu.reto3.reto3.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import co.edu.reto3.reto3.model.Message;
import co.edu.reto3.reto3.service.MessageServicio;


@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins="*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

public class MessageControlador {
    @Autowired
    private MessageServicio messageServicio;

    @GetMapping("/all")
    public List<Message> getMessages(){
        return messageServicio.getAll();
    }

    @GetMapping("/{idMessage}")
    public Optional<Message> getMessage(@PathVariable("idMessage") int id){
        return messageServicio.getMessage(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message save(@RequestBody Message mensaje){
        return messageServicio.save(mensaje);
    }
}
