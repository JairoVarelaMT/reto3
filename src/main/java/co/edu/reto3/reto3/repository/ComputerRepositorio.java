package co.edu.reto3.reto3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.reto3.reto3.model.Computer;
import co.edu.reto3.reto3.repository.crud.ComputerCrudRepositorio;


@Repository
public class ComputerRepositorio {
    @Autowired
    private ComputerCrudRepositorio computerCrudRepositorio;
//METODO GET TODAS LOS COMPUTADORES
    public List<Computer> getAll(){
        return (List<Computer>)computerCrudRepositorio.findAll();
    }
//METODO GET SOLO 1 COMPUTADOR POR ID O PRIMARY KEY
    public Optional<Computer> getComputer(int id) {
        return computerCrudRepositorio.findById(id);
    }
//METODO POST GUARDA 1 COMPUTADOR EN LA BD
    public Computer save(Computer computador){
        return computerCrudRepositorio.save(computador);
    }
}
