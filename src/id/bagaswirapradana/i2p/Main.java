package id.bagaswirapradana.i2p;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.print("Masukkan nilai (0 - 100): ");
        if (!masukan.hasNextInt()) {
            System.out.println("Data yang dimasukkan hanya bisa berupa bilangan bulat saja");
            masukan.close();
            return;
        }
        int nilai = masukan.nextInt();
        if (nilai >= 0 && nilai <= 100) {
            System.out.println(nilai > 75 ? "Lulus" : "Tidak Lulus");
        } else {
            System.out.println("Data yang dimasukkan hanya bisa berupa bilangan bulat saja dan harus dalam rentang 0 sampai 100");
        }
        masukan.close();
    }
}
