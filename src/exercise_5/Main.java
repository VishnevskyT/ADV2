package exercise_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Завдання 5
 * Вводити з клавіатури рядки, доки користувач не введе рядок 'end':
 * 1. Створити перелік рядків.
 * 2. Ввести рядки з клавіатури та додати їх до списку.
 * 3. Вводити з клавіатури рядки, доки користувач не введе рядок "end". "end" не враховувати.
 * 4. Вивести рядки на екран, кожен з нового рядка.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Вводіть рядки, поки не надоїсть. В іншому випадку напишіть \"end\": _");

            while (true) {
                if (list.contains("end")) {
                    list.remove("end");
                    break;
                }
            list.add(br.readLine());
        }

        for (String temp : list) {
            if (temp.equals("end")) {
                list.remove("end");
            }
            System.err.println(temp);
        }

    }
}
