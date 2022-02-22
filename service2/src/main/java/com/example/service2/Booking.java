package com.example.service2;
public class Booking {
    private final int id;
    private final int bookingId;
    private final int price;
    private final String typeOfSeat;
    private final int noOfSeats;

    public Booking(final int id, final int bookingId, final int price, final String typeOfSeat, final int noOfSeats) {
        this.id = id;
        this.bookingId = bookingId;
        this.price = price;
        this.typeOfSeat = typeOfSeat;
        this.noOfSeats = noOfSeats;
    }

    public int getId() {
        return id;
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getTypeOfSeat() {
        return name;
    }
}
