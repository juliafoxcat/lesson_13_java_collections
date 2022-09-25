package guru.qa;

import java.lang.*;

public class VideoShop {
    public static void main(String[] args) {

        ThrillerFilms thFilms = new ThrillerFilms();

        thFilms.addThriller("Code Da Vinchi");
        thFilms.addThriller("Pulp Fiction");
        thFilms.addThriller("Scream");
        thFilms.addThriller("The ring");
        System.out.println(thFilms.isExists("The ring"));
        System.out.println(thFilms.removeElement("Scream"));
        thFilms.printAll();

        DramaFilms drFilms = new DramaFilms();

        drFilms.addDrama("Titanic", "Cameron");
        drFilms.addDrama("Hatiko", "Hallstrom");
        drFilms.removeElement("Titanic");
        drFilms.printAll();
        System.out.println(drFilms.isExist("Hatiko", "Hallstrom"));

        ComedyFilms comFilms = new ComedyFilms();

        comFilms.addComedy("EuroTrip");
        comFilms.addComedy("Fakers");
        comFilms.addComedy("Snatch");
        comFilms.removeElement("EuroTrip");
        comFilms.printAll();
        System.out.println(comFilms.isExist("Fakers"));
    }
}