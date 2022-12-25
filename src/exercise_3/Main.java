package exercise_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Завдання 3
 * Мінімальне з N чисел (використовувати LinkedList):
 * 1. Введіть із клавіатури число N.
 * 2. Вважати N цілих чисел і заповнити ними список - метод getIntegerList.
 * 3. Знайти мінімальне число серед елементів списку – метод getMinimum.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Введіть розмірність списку N: _");
        List<Integer> list = getIntegerList(scanner.nextInt());
        System.out.println(list);
        System.out.println("Найменше число серед елементів списку = " + getMinimum(list));
    }

    public static List<Integer> getIntegerList(int size) {
        List<Integer> list = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            while (list.size() < size) {
                System.out.print("Введіть " + (list.size() + 1) + "-е ціле число з " + size + ": _");
                list.add(Integer.parseInt(br.readLine()));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public static Integer getMinimum (List<Integer> list){
        Collections.sort(list);
        return list.get(0);
    }

}
