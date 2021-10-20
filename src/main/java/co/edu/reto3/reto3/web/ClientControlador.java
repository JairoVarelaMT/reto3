package co.edu.reto3.reto3.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import co.edu.reto3.reto3.model.Client;
import co.edu.reto3.reto3.service.ClientServicio;

@RestController
@RequestMapping("/api/Client")
@CrossOrigin(origins="*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

public class ClientControlador {
    @Autowired
    private ClientServicio clientServicio;

    @GetMapping("/all")
    public List<Client> getClients(){
        return clientServicio.getAll();
    }

    @GetMapping("/{idClient}")
    public Optional<Client> getClient(@PathVariable("idClient") int id){
        return clientServicio.getClient(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client save(@RequestBody Client cliente){
        return clientServicio.save(cliente);
    }
}
