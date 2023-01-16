import java.util.Arrays;
import java.util.SortedMap;

       // ИСПОЛЬЗОВАННА ВЕРСИЯ JAVA JDK 11 - ВЕРСИЯ 11
       // СБОРЩИК - INTELIJE IDEA - РЕДАКТОР КОДА
       // БИБЛИОТЕКИ НЕ ИСПОЛЬЗОВАНЫ!
public class Main {
    public static void main(String[] args) {
        int[] mas1 = new int[] {1, 3, 7, 15, 45, 70, 80, 150, 500, 620, 700, 1000};
        int[] mas2 = new int[] {5, 10, 30, 60, 70, 100, 300, 600, 800, 1100, 1500, 2000};
        int[] mas3 = new int[mas1.length + mas2.length];

        int i = 0;
        int j = 0;
        for (int k=0; k<mas3.length; k++) {
            if (i > mas1.length - 1) {
                int a = mas2[j];
                mas3[k] = a;
                j++;
            } else if (j > mas2.length - 1) {
                int a = mas1[i];
                mas3[k] = a;
                i++;
            } else if (mas1[i] < mas2[j]) {
                int a = mas1[i];
                mas3[k] = a;
                i++;
            } else {
                int b = mas2[j];
                mas3[k] = b;
                j++;
            }
        }
        System.out.println(Arrays.toString(mas3));
    }
}