package co.edu.reto3.reto3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.reto3.reto3.model.Reservation;
import co.edu.reto3.reto3.repository.crud.ReservationCrudRepositorio;


@Repository
public class ReservationRepositorio {
    @Autowired
    private ReservationCrudRepositorio reservationCrudRepositorio;
//METODO GET TODAS LAS RESERVACIONES
    public List<Reservation> getAll(){
        return (List<Reservation>)reservationCrudRepositorio.findAll();
    }
//METODO GET SOLO 1 RESERVACION POR ID O PRIMARY KEY
    public Optional<Reservation> getReservation(int id) {
        return reservationCrudRepositorio.findById(id);
    }
//METODO POST GUARDA 1 RESERVACION EN LA BD
    public Reservation save(Reservation reservacion){
        return reservationCrudRepositorio.save(reservacion);
    }
}
