package Lesson_5_3;

import java.util.ArrayDeque;

public class Program {
    public static void main(String[] args) {

        ArrayDeque<String> countries = new ArrayDeque<String>();
        // Добавление стран
        countries.add("Germany");
        System.out.println(countries);
        countries.addFirst("France"); // в самое начало
        System.out.println(countries);
        countries.push("Great Britain"); // в самое начало
        System.out.println(countries);
        countries.addLast("Spain"); // в конец очереди
        System.out.println(countries);
        countries.add("Italy");
        System.out.println(countries);

        System.out.println("-----------------------");
        System.out.printf("Queue size: %d \n", countries.size());
        System.out.println("-----------------------\n");

        // получаем элементы
        String strFirst = countries.getFirst();
        System.out.printf("первый элемент без удаления: %s \n", strFirst);
        String strList = countries.getLast();
        System.out.printf("Последний элемент без удаления: %s \n", strList);
        System.out.println("-----------------------\n");

        // перебор коллекции
        while (countries.peek() != null){
            // извлекаем с начала
            System.out.println(countries.pop());
        }
        System.out.println("-----------------------\n");

        // очередь из объектов
        ArrayDeque<Person> people = new ArrayDeque<Person>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        // перебор без извлечения
        for (Person pers : people) {
            System.out.println(pers.getName());
        }
    }
}
