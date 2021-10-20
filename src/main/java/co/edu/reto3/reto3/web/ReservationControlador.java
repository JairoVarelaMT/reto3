package co.edu.reto3.reto3.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import co.edu.reto3.reto3.model.Reservation;
import co.edu.reto3.reto3.service.ReservationServicio;


@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins="*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

public class ReservationControlador {
    @Autowired
    private ReservationServicio reservationServicio;

    @GetMapping("/all")
    public List<Reservation> getReservations(){
        return reservationServicio.getAll();
    }

    @GetMapping("/{idReservation}")
    public Optional<Reservation> getReservation(@PathVariable("idReservation") int id){
        return reservationServicio.getReservation(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation reservacion){
        return reservationServicio.save(reservacion);
    }
}
