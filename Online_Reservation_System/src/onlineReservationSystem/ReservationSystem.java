package onlineReservationSystem;
import java.util.*;

class ReservationSystem {
    private List<Reservation> reservations = new ArrayList<>();
    private int nextId = 1;
    
    //used to make new reservation and store it in reservations list by taking inputs from the ReservationSystemUI class

    public Reservation makeReservation(String name, String date, int numberOfGuests) {
        Reservation reservation = new Reservation(nextId++, name, date, numberOfGuests);
        reservations.add(reservation);
        return reservation;
    }

    //used to return all the reservations
    public List<Reservation> getReservations() {
        return reservations;
    }

    //used to get the reservation details based on Id
    public Reservation getReservationById(int id) {
        for (Reservation reservation : reservations) {
            if (reservation.getId() == id) {
                return reservation;
            }
        }
        return null;
    }

    //used to cancel the reservation by taking id from the ReservationSystemUI class
    public boolean cancelReservation(int id) {
        Reservation reservation = getReservationById(id);
        if (reservation != null) {
            reservations.remove(reservation);
            return true;
        }
        return false;
    }
}
