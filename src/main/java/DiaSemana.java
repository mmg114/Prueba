import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DiaSemana {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.NOVEMBER, 30);

        Date fecha = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");

        System.out.println("El 30 de noviembre de 2023 es un " + sdf.format(fecha) + ".");
    }
}
