package co.edu.reto3.reto3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.reto3.reto3.model.Category;
import co.edu.reto3.reto3.repository.crud.CategoryCrudRepositorio;


@Repository
public class CategoryRepositorio  {
    
    @Autowired
    private CategoryCrudRepositorio categoryCrudRepositorio;
//METODO GET TODAS LAS CATEGORIAS
    public List<Category> getAll(){
        return (List<Category>)categoryCrudRepositorio.findAll();
    }
//METODO GET SOLO 1 CATEGORIA POR ID O PRIMARY KEY
    public Optional<Category> getCategory(int id) {
        return categoryCrudRepositorio.findById(id);
    }
//METODO POST GUARDA 1 CATEGORIA EN LA BD
    public Category save(Category categoria){
        return categoryCrudRepositorio.save(categoria);
    }
}
