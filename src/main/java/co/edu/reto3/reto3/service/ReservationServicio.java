package co.edu.reto3.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.reto3.reto3.model.Reservation;
import co.edu.reto3.reto3.repository.ReservationRepositorio;

@Service
public class ReservationServicio {
    @Autowired
    private ReservationRepositorio reservationRepositorio;

    public List<Reservation>getAll(){
        return reservationRepositorio.getAll();
    }

    public Optional<Reservation>getReservation(int id){
        return reservationRepositorio.getReservation(id);
    }

    public Reservation save(Reservation reserva){
        //Verificamos si la categoria es nuevo y de ser así se guarda
        if (reserva.getIdReservation()==null) {
            return reservationRepositorio.save(reserva);            
        }else{ //Si el objeto viene con un Id verificamos si existe o no
            Optional<Reservation> consulta=reservationRepositorio.getReservation(reserva.getIdReservation());
            if (consulta.isEmpty()) {
                return reservationRepositorio.save(reserva);                
            } else {
                return reserva;                
            }
        }
    }
}
