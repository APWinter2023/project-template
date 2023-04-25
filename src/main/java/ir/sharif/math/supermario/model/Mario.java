package ir.sharif.math.supermario.model;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

//@Singleton
@ApplicationScoped
public class Mario {

    int speed = 10;

    @Inject
    Place place;

    public Mario() {
        System.out.println("in constructoe of  mario class");

    }

    public void print() {
        System.out.println("in print method of mario class");
    }


}