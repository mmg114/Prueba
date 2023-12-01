import java.util.Calendar;

public class Calendario {
    public static void main(String[] args) {
        int year = 2023;
        int month = Calendar.NOVEMBER; // Calendar.NOVEMBER es 10 porque los meses en Java comienzan desde 0

        Calendar cal = Calendar.getInstance();
        cal.set(year, month, 1);


        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("Calendario de Noviembre de 2023:");

        for (int i = 1; i <= daysInMonth; i++) {
            System.out.print(i + " ");
            if (i % 7 == 0) {
                System.out.println(); // Salto de línea después de cada semana
            }
        }
    }
}
