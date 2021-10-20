package co.edu.reto3.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.reto3.reto3.model.Category;
import co.edu.reto3.reto3.repository.CategoryRepositorio;


@Service
public class CategoryServicio {
    @Autowired
    private CategoryRepositorio categoryRepositorio;

    public List<Category>getAll(){
        return categoryRepositorio.getAll();
    }

    public Optional<Category>getCategory(int id){
        return categoryRepositorio.getCategory(id);
    }

    public Category save(Category categoria){
        //Verificamos si la categoria es nuevo y de ser así se guarda
        if (categoria.getId()==null) {
            return categoryRepositorio.save(categoria);            
        }else{ //Si el objeto viene con un Id verificamos si existe o no
            Optional<Category> consulta=categoryRepositorio.getCategory(categoria.getId());
            if (consulta.isEmpty()) {
                return categoryRepositorio.save(categoria);                
            } else {
                return categoria;                
            }
        }
    }
}
