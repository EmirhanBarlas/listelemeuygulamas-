import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListelemeUygulamasi {

    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Eleman Ekle");
            System.out.println("2 - Listeyi Görüntüle");
            System.out.println("3 - Çıkış");
            System.out.print("Seçiminizi yapın: ");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Eklemek istediğiniz elemanı girin: ");
                    String eleman = scanner.next();
                    liste.add(eleman);
                    System.out.println("Eleman eklendi.");
                    break;

                case 2:
                    if (liste.isEmpty()) {
                        System.out.println("Liste boş.");
                    } else {
                        System.out.println("Liste:");
                        for (String item : liste) {
                            System.out.println(item);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Programdan çıkılıyor...");
                    System.exit(0);

                default:
                    System.out.println("Geçersiz seçim. Tekrar deneyin.");
            }
        }
    }
}
