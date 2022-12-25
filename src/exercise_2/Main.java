package exercise_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Завдання 2
 * Використовуючи колекцію, підвійте слово:
 * 1. Введіть із клавіатури 5 слів до списку рядків.
 * 2. Метод doubleValues повинен підвоювати слова за принципом a, b, c -> a, a, b, b, c, c.
 * 3. Використовуючи цикл for виведіть результат на екран, кожне значення нового рядка.
 */

public class Main {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            for (int i = 0; i < 5; i++) {
                System.err.print("Введіть " + (i + 1) + "-е слово у список: _");
                list1.add(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Вихідний список:");
        for (String temp : list1) System.out.println(list1.indexOf(temp) + " - " + temp);

        List<String> list2 = doubleValues(list1);

        System.out.println("Подвоєний список:");

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(i + " - " + list2.get(i));
        }

    }

    public static List<String> doubleValues(List<String> list) {
        int size = list.size();

        for (int i = 0; i < size; i++) {
            list.add(i + i + 1, list.get(i+i));
        }
        return list;
    }

}
