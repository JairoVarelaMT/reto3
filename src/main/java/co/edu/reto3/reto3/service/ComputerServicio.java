package co.edu.reto3.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.reto3.reto3.model.Computer;
import co.edu.reto3.reto3.repository.ComputerRepositorio;

@Service
public class ComputerServicio {
    @Autowired
    private ComputerRepositorio computerRepositorio;

    public List<Computer>getAll(){
        return computerRepositorio.getAll();
    }

    public Optional<Computer>getComputer(int id){
        return computerRepositorio.getComputer(id);
    }

    public Computer save(Computer computador){
        //Verificamos si la categoria es nuevo y de ser así se guarda
        if (computador.getIdComputer()==null) {
            return computerRepositorio.save(computador);            
        }else{ //Si el objeto viene con un Id verificamos si existe o no
            Optional<Computer> consulta=computerRepositorio.getComputer(computador.getIdComputer());
            if (consulta.isEmpty()) {
                return computerRepositorio.save(computador);                
            } else {
                return computador;                
            }
        }
    }
    
}
