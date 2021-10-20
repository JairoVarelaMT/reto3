package co.edu.reto3.reto3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.reto3.reto3.model.Client;
import co.edu.reto3.reto3.repository.crud.ClientCrudRepositorio;



@Repository
public class ClientRepositorio {
    @Autowired
    private ClientCrudRepositorio clientCrudRepositorio;
//METODO GET TODAS LOS CLIENTES
    public List<Client> getAll(){
        return (List<Client>)clientCrudRepositorio.findAll();
    }
//METODO GET SOLO 1 CLIENTE POR ID O PRIMARY KEY
    public Optional<Client> getClient(int id) {
        return clientCrudRepositorio.findById(id);
    }
//METODO POST GUARDA 1 CLIENTE EN LA BD
    public Client save(Client cliente){
        return clientCrudRepositorio.save(cliente);
    }
}
