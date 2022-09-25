package guru.qa;

import java.util.ArrayList;
import java.util.List;

public class ThrillerFilms {

    List<String> thrillers = new ArrayList<>();

    public void addThriller(String film) {
        thrillers.add(film);
    }

    public void printAll() {
        for (var i = 0; i < thrillers.size(); i++) {
            System.out.println(thrillers.get(i));
        }
    }

    //выводим номер элемента, если нет то -1
    public int isExists(String param) {
        for (var i = 0; i < thrillers.size(); i++) {
            if (thrillers.get(i).equals(param)) {
                return i;
            }
        }
        return -1;
    }

    //удаляем элемент, если удалили, то выводим true
    public boolean removeElement(String param) {
        int index = isExists(param);
        if (index > -1) {
            thrillers.remove(index);
            return true;
        }
        return false;
    }


}



