import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dikdörtgenin uzunluğunu girin: ");
        double uzunluk = scanner.nextDouble();
        System.out.print("Dikdörtgenin genişliğini girin: ");
        double genislik = scanner.nextDouble();

        Hesaplama hesaplama = new Hesaplama(uzunluk, genislik);

        double alan = hesaplama.alanHesapla();
        double cevre = hesaplama.cevreHesapla();

        System.out.println("Dikdörtgenin Alanı: " + alan);
        System.out.println("Dikdörtgenin Çevresi: " + cevre);
    }
}
