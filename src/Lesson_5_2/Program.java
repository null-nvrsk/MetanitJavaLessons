package Lesson_5_2;

import java.io.PrintStream;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
//        ArrayList<String> people = new ArrayList<String>();
        ArrayList<String> people = new ArrayList<String>(20);

        // добавим в список ряд элементов
        people.add("John");
        people.add("Mary");
        people.add("Kate");
        people.add(1, "Nataly"); // добавляем элемент по индексу 1
        System.out.println(people.toString());

        System.out.println(people.get(1));
        people.set(1, "Rob");
        System.out.println(people.get(1));

        System.out.printf("ArrayList has %d elements \n", people.size());
        for (String person : people) {
            System.out.println(person);
        }

        people.ensureCapacity(30);

        // проверяем наличие элемента
        if (people.contains("Kate"))
            System.out.println("ArrayList contains Kate");

        // удалим несколько объектов
        // удаление конкретного элемента
        people.remove("Rob");
        // Удаление по индексу
        people.remove(0);

        Object[] peopleArray = people.toArray();
        for (Object person : peopleArray) {
            System.out.println(person);
        }
    }
}
