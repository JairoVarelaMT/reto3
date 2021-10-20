package co.edu.reto3.reto3.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import co.edu.reto3.reto3.model.Category;
import co.edu.reto3.reto3.service.CategoryServicio;


@RestController
@RequestMapping("/api/Category")
@CrossOrigin(origins="*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class CategoryControlador {
    @Autowired
    private CategoryServicio categoryServicio;

    @GetMapping("/all")
    public List<Category> getCategories(){
        return categoryServicio.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Category> getCategory(@PathVariable("id") int id){
        return categoryServicio.getCategory(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category categoria){
        return categoryServicio.save(categoria);
    }

}
