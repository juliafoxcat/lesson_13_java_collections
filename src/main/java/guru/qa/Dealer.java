package guru.qa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Dealer {

    Set<String> storedAutos = new HashSet<>();

    void addNewAuto(String auto) {
        storedAutos.add(auto);
    }

    void printAllAutos() {
        for (String storedAuto : storedAutos) {
            System.out.println("Сохраненное значение: " + storedAuto);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dealer dealer = (Dealer) o;
        return (this.storedAutos.size() == ((Dealer) o).storedAutos.size()) &&
                (this.storedAutos.containsAll(((Dealer) o).storedAutos));
    }

    @Override
    public int hashCode() {
        return Objects.hash(storedAutos);
    }
}
