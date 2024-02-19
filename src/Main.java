import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dizinin Boyutunu Giriniz!!");
        n = scanner.nextInt();

        int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz!!");

        for (int i = 0; i<list.length; i++){
            System.out.println((i+1) + ". eleman :");
            list[i] = scanner.nextInt();
        }

        Arrays.sort(list);

        System.out.println(Arrays.toString(list));
    }
}