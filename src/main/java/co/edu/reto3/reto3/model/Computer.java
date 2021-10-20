package co.edu.reto3.reto3.model;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="computer")
public class Computer implements Serializable {
//campo llave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idComputer;
    private String name;
    private String brand;
    private String description;
    private Integer year;

//RELACION ENTRE COMPUTER Y CATEGORY
    @ManyToOne
    @JoinColumn(name="idCategory")
    @JsonIgnoreProperties("computer")
    private Category category;

//RELACION ENTRE COMPUTER Y MESSAGE
    @OneToMany(cascade={CascadeType.PERSIST}, mappedBy = "computer")
    @JsonIgnoreProperties("computer")
    private List<Message> message;
    
//RELACION ENTRE COMPUTER Y RESERVATION
    @OneToMany(cascade={CascadeType.PERSIST}, mappedBy = "computer")
    @JsonIgnoreProperties("computer")
    private List<Reservation> reservation;

//GETTER AND SETTERS
    public Integer getIdComputer() {
        return idComputer;
    }
    public void setId(Integer id) {
        this.idComputer = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    
}
