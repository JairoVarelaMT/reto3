package co.edu.reto3.reto3.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import co.edu.reto3.reto3.model.Computer;
import co.edu.reto3.reto3.service.ComputerServicio;


@RestController
@RequestMapping("/api/Computer")
@CrossOrigin(origins="*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

public class ComputerControlador {
    @Autowired
    private ComputerServicio computerServicio;

    @GetMapping("/all")
    public List<Computer> getComputers(){
        return computerServicio.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Computer> getComputer(@PathVariable("id") int id){
        return computerServicio.getComputer(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Computer save(@RequestBody Computer computador){
        return computerServicio.save(computador);
    }

}
