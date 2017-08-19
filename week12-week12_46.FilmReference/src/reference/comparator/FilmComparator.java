package reference.comparator;

import reference.domain.Film;
import reference.domain.Rating;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Dawid on 19.08.2017.
 */
public class FilmComparator implements Comparator<Film> {

    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    @Override
    public int compare(Film o1, Film o2) {
        return average(o2) - average(o1);
    }

    private int average(Film film) {

        int sum = 0;

        Iterator<Rating> iterator = this.ratings.get(film).iterator();

        while (iterator.hasNext()) {
            sum += iterator.next().getValue();
        }

        return sum / this.ratings.get(film).size();

    }
}
