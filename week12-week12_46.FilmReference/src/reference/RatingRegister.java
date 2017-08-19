package reference;

import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.*;

/**
 * Created by Dawid on 19.08.2017.
 */
public class RatingRegister {

    private Map<Film, List<Rating>> filmRatings;
    private Map<Person, Map<Film, Rating>> personRatings;

    public RatingRegister() {
        this.filmRatings = new HashMap<Film, List<Rating>>();
        this.personRatings = new HashMap<>();
    }

    public void addRating(Film film, Rating rating) {
        if (!this.filmRatings.containsKey(film))
            this.filmRatings.put(film, new ArrayList<Rating>());
        this.filmRatings.get(film).add(rating);
    }

    public List<Rating> getRatings(Film film) {
        return this.filmRatings.get(film);
    }

    public Map<Film, List<Rating>> filmRatings() {
        return this.filmRatings;
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!this.personRatings.containsKey(person))
            this.personRatings.put(person, new HashMap<>());
        this.personRatings.get(person).put(film, rating);
        addRating(film, rating);
    }

    public Rating getRating(Person person, Film film) {
        if (!this.personRatings.get(person).containsKey(film))
            return Rating.NOT_WATCHED;
        return this.personRatings.get(person).get(film);
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {

        if (!this.personRatings.containsKey(person))
            this.personRatings.put(person, new HashMap<>());

        return this.personRatings.get(person);
    }

    public List<Person> reviewers() {
        List<Person> reviewers = new ArrayList<>(this.personRatings.keySet());
        return reviewers;
    }
}
