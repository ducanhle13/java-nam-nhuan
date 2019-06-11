import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhap nam: ");
        year = scanner.nextInt();
        boolean namnhuan = false;

        boolean chiahet4 = year % 4 == 0;
        if (chiahet4) {
            boolean chiahet100 = year % 100 == 0;
            if (chiahet100) {
                boolean chiahet400 = year % 400 == 0;
                if (chiahet400) {
                    namnhuan = true;
                }
            } else {
                namnhuan = true;
            }
        }

        if (namnhuan) {
            System.out.printf("%d la nam nhuan" , year);
        } else {
            System.out.printf("%d khong la nam nhuan" , year);
        }
    }
}
