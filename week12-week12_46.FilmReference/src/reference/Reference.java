package reference;

import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.*;

/**
 * Created by Dawid on 19.08.2017.
 */
public class Reference {

    private RatingRegister ratingRegister;

    public Reference(RatingRegister ratingRegister) {
        this.ratingRegister = ratingRegister;
    }

    public Film recommendFilm(Person person) {
        if (this.ratingRegister.getPersonalRatings(person).isEmpty()) {

            Map<Film, List<Rating>> filmRatings = this.ratingRegister.filmRatings();

            Iterator<Film> iterator = filmRatings.keySet().iterator();

            Film bestFilm = iterator.next();

            FilmComparator fc = new FilmComparator(filmRatings);

            while (iterator.hasNext()) {
                Film current = iterator.next();
                if (fc.compare(bestFilm, current) > 0)
                    bestFilm = current;
            }

            return bestFilm;
        } else {

            List<Person> personList = new ArrayList<>(this.ratingRegister.reviewers());
            personList.remove(person);
            Map<Film, Rating> personWatched = this.ratingRegister.getPersonalRatings(person);
            int bestSimilarity = -999;
            Person bestCompared = personList.get(0);
            for (Person compared : personList) {
                int similarity = 0;
                Map<Film, Rating> comparedWatched = this.ratingRegister.getPersonalRatings(compared);
                for (Film item : comparedWatched.keySet()) {
                    if (personWatched.containsKey(item)) {
                        similarity += personWatched.get(item).getValue() * comparedWatched.get(item).getValue();

                    }
                }


                if (similarity > bestSimilarity) {
                    bestCompared = compared;
                    bestSimilarity = similarity;
                }
            }
            Rating bestRating = Rating.BAD;
            Film bestFilm = this.ratingRegister.getPersonalRatings(bestCompared).keySet().iterator().next();
            for (Film item : this.ratingRegister.getPersonalRatings(bestCompared).keySet()) {
                if (this.ratingRegister.getRating(bestCompared, item).getValue() > bestRating.getValue() && this.ratingRegister.getRating(person, item) == Rating.NOT_WATCHED) {
                    bestFilm = item;
                    bestRating = this.ratingRegister.getRating(bestCompared, item);
                }
            }

            if (this.ratingRegister.getRating(bestCompared, bestFilm).getValue() > 1)
                return bestFilm;
            else
                return null;
        }


    }

}
