package co.edu.reto3.reto3.model;
import java.util.Date;

import javax.persistence.*;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="reservation")
public class Reservation {
//Campo llave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    private Date starDate;
    private Date devolutionDate;
    
    // RELACION ENTRE COMPUTER Y RESERVATION
   /*  @ManyToOne
    @JoinColumn(name="id")//idComputer
    @JsonIgnoreProperties("reservation")
    private Computer computer;

    // RELACION ENTRE CLIENT Y RESERVATION
    @ManyToOne
    @JoinColumn(name="idClient")
    @JsonIgnoreProperties("reservation")
    private Client client;
 */
//GETTERS AND SETTERS
    public Integer getIdReservation() {
        return idReservation;
    }
    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }
    public Date getStarDate() {
        return starDate;
    }
    public void setStarDate(Date starDate) {
        this.starDate = starDate;
    }
    public Date getDevolutionDate() {
        return devolutionDate;
    }
    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }
    
}
