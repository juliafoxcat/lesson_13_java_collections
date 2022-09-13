package guru.qa;

import java.util.HashMap;
import java.util.Map;

public class First {

    public static void main(String[] args) {
//        Person teacher = new Person(33, "Дима");
//        teacher .increaseAge(35);
//        teacher.goToPension();
//        teacher.sayName();

        String[] autos = new String[]{"volkswagen", "skoda", "audi"};
        String[] emptyAutos = new String[3];

        Dealer multiDealer = new Dealer();
        multiDealer.addNewAuto("Porsche");
        multiDealer.addNewAuto("Audi");

        Dealer multiDealerAnother = new Dealer();
        multiDealer.addNewAuto("Porsche");
        multiDealer.addNewAuto("Audi");

        System.out.println(multiDealer.equals(multiDealerAnother));

        multiDealer.printAllAutos();


    }


    public static void hashMapDemo() {
        Map<Integer, Person> persons = new HashMap<>();

        Person dima = new Person(33, "Дима");
        Person stas = new Person(30, "Стас");

        persons.put(123456, dima);
        persons.put(873233, stas);


        Person person = persons.get(123456);

        for (Integer integer : persons.keySet()) {

        }

        for (Map.Entry<Integer, Person> entry : persons.entrySet()) {
            if (entry.getKey().equals(123456)) {
                entry.getValue().sayName();
            }
        }
    }
}
