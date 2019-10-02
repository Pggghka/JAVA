package vartanian.summer.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.Date;

public class Films {
    // @Autowired
    // @Qualifier("Films")
    private Film film;

    private int rating;
    private String description;
    private int minutes;

    // @Autowired
    public Films(int rating, String description, int minutes) {
        this.rating = rating;
        this.description = description;
        this.minutes = minutes;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    //IoC
    //@Autowired
    public Films(Film film){
        this.film = film;
    }

    public Films(){}

    public void setFilm(Film film) {
        this.film = film;
    }

    public void playFilm(){
        System.out.println("Playing film:" + film.getFilm());
    }
}
