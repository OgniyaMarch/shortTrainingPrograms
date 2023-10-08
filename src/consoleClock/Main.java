package consoleClock;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт для представлення поточної дати та часу
        Date currentDate = new Date();
        System.out.println(currentDate);

        // Створюємо об'єкт SimpleDateFormat для форматування дати та часу
        //HH - 24 hours
        //hh - 12 hours
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

        // Використовуємо SimpleDateFormat для форматування поточної дати та часу
        String formattedDate = dateFormat.format(currentDate);

        System.out.println("Current time: " + formattedDate);
    }
}
