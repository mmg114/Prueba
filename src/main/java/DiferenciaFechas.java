import java.util.Calendar;
import java.util.Date;

public class DiferenciaFechas {
    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();

        cal1.set(2023, Calendar.NOVEMBER, 30);
        cal2.set(2023, Calendar.DECEMBER, 15);

        long diferenciaMillis = cal2.getTimeInMillis() - cal1.getTimeInMillis();
        long diasDiferencia = diferenciaMillis / (24 * 60 * 60 * 1000);

        System.out.println("La diferencia entre las fechas es de " + diasDiferencia + " días.");
    }
}
