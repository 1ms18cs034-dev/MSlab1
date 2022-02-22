package com.example.service2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.List;
@RequestMapping("/bookings")
@RestController
public class BookingController {
    private final List<Booking> Bookings = Arrays.asList(
            new Booking(1, 1, 100, "A", 1),
            new Booking(2, 1, 200, "B", 2),
            new Booking(3, 2, 300, "C", 3),
            new Booking(4, 1, 400, "D", 4),
            new Booking(5, 2, 500, "E", 5));

    @GetMapping
    public List<Booking> getAllBookings() {
        return Bookings;
    }

    @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable int id) {
        return Bookings.stream()
                     .filter(Booking -> Booking.getId() == id)
                     .findFirst()
                     .orElseThrow(IllegalArgumentException::new);
    }
}
