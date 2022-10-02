package Lesson_5_4_LinkedList;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<String>();
        // Добавление стран
        countries.add("Germany");
        System.out.println(countries);
        countries.add("France");
        System.out.println(countries);
        countries.addLast("Great Britain"); // в конец очереди
        System.out.println(countries);
        countries.addFirst("Spain"); // в самое начало
        System.out.println(countries);
        countries.add(1, "Italy"); // добавление на место по индексу 1
        System.out.println(countries);

        System.out.println("-----------------------");
        System.out.printf("List size: %d \n", countries.size());
        System.out.println("-----------------------\n");

        // получаем элементы
        System.out.printf("1 индекс: %s \n", countries.get(1));
        countries.set(1, "Portugal");
        System.out.printf("1 индекс: %s \n", countries.get(1));
        for (String country : countries) {
            System.out.println(country);
        }

        System.out.println("-----------------------\n");

        // Проверка на наличие элемента в списке
        if (countries.contains("Germany")){
            System.out.println("List contains Germany");
        }

        countries.remove("Germany");
        countries.removeFirst(); // удаляем первый элемент
        countries.removeLast(); // удаляем последний элемент

        for (String country : countries)
            System.out.println(country);
        System.out.println("-----------------------\n");

        // список из объектов
        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        people.remove(1); // удаление 2го элемента

        for (Person pers : people) {
            System.out.println(pers.getName());
        }
        Person first = people.getFirst();
        System.out.println(first.getName()); // вывод первого элемента
    }
}
