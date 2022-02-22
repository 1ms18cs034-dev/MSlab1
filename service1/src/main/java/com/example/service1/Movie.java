package com.example.service1;
public class Movie {
    private final int id;
    private final String name;
    private final String hName;
    private final String heName;
    private final int review;

    public Movie(final int id,  final String name, final String hName, final String heName, final int review) {
        this.id = id;
        this.name = name;
        this.hName = hName;
        this.heName = heName;
        this.review = review;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
