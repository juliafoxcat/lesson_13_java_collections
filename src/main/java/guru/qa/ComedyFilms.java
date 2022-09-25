package guru.qa;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ComedyFilms {
    private Set<String> comedies = new HashSet<>();

    public void addComedy(String film) {
        comedies.add(film);
    }

    public void printAll() {
        Iterator<String> itFilm = comedies.iterator();
        while (itFilm.hasNext()) {
            System.out.println(itFilm.next());
        }
    }

    public void removeElement(String film) {
            if (comedies.contains(film)) {
                comedies.remove(film);
            }
    }

    public boolean isExist (String film) {
        return comedies.contains(film);
    }
}

