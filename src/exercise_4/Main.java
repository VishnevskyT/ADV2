package exercise_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Завдання 4
 * Програма визначає, яка сім'я (прізвище) живе у місті:
 * Приклад введення:
 * · Краків
 * · Іваненки
 * · Київ
 * · Петрики
 * · Лондон
 * · Гуляйполе
 * Приклад введення:
 * · Лондон
 * Приклад виведення:
 * · Гуляйполе
 */
public class Main {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Іваненки", "Краків");
        map.put("Петрики", "Київ");
        map.put("Гуляйполе", "Лондон");
        map.put("Кобейни", "Вальгалла");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.err.print("Введіть назву міста для пошуку сім'ї: _");
            String input = br.readLine();
            boolean found = false;
            Set<Map.Entry<String, String>> set = map.entrySet();
            for (Map.Entry <String,String> temp : set) {
                if (input.equalsIgnoreCase(temp.getValue())) {
                    System.out.println("Вітаємо!\nМи знайшли: " + temp.getKey());
                    found = true;
                }
            }
            if (!found) {
                System.out.println("За Вашим запитом нічого не знайдено. Спробуйте ще раз.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
