package dz_2_sem_2;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
/*
 * 1. Дана json строка { { "фамилия":"Иванов","оценка":"5","предмет":"Математика"},
 * {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
 * {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}} 
 * Задача написать метод(ы), который распарсить строку и выдаст ответ вида: 
 * Студент Иванов получил 5 по предмету Математика. 
 * Студент Петрова получил 4 по предмету Информатика. 
 * Студент Краснов получил 5 по предмету Физика. 
 * Используйте StringBuilder для подготовки ответа
 * 2. Создать метод, который запишет результат работы в файл Обработайте исключения и запишите ошибки в лог файл
 * 3. *Получить исходную json строку из файла, используя FileReader или Scanner
 */
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Example {
    public static void main(String[] args) {
        String pathFile = "dz_2_sem_2/file.json";
        String jsonStr = readFile(pathFile);
        String[][] data = ParseFile(jsonStr);
        String answer = CreateAnswer(data);
        System.out.println(answer);
        String pathNewFile = "dz_2_sem_2/answer.txt";
        WriteAnswerToFile(answer, pathNewFile);
    }

    static String readFile(String path) {
        String str = "";
        try (FileReader fileReader = new FileReader(path);
                Scanner scanner = new Scanner(fileReader);) {
            str = scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    static String[][] ParseFile(String str) {
        String s = str.replaceAll("\\},\\{", ";")
                .replaceAll("[\\[\\]\\{\\}\"]", "")
                .replaceAll("фамилия:", "")
                .replaceAll("оценка:", "")
                .replaceAll("предмет:", "");
        String[] students = s.split(";");
        String[][] dataStudents = new String[students.length][];
        for (int i = 0; i < students.length; i++) {
            dataStudents[i] = students[i].split(",");
        }
        return dataStudents;
    }

    static String CreateAnswer(String[][] data) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            stringBuilder.append("Студент ").append(data[i][0])
                    .append(" получил ").append(data[i][1])
                    .append(" по предмету ").append(data[i][2]);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    static void WriteAnswerToFile(String data, String path) {
        Logger logger = Logger.getAnonymousLogger();
        try {
            FileHandler fileHandler = new FileHandler("dz_2_sem_2/log.txt");
            logger.addHandler(fileHandler);
            SimpleFormatter sFormatter = new SimpleFormatter();
            fileHandler.setFormatter(sFormatter);
            try (FileWriter writer = new FileWriter(path, false)) {
                writer.write(data);
                writer.flush();
                logger.info("Файл записан");
            } catch (Exception e) {
                logger.warning(e.getMessage());
                e.printStackTrace();
            }
            fileHandler.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}