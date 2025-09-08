import java.util.Scanner;

public class Tutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matkulIF = {"Matematika Diskrit", "Dasar-dasar pemrograman", "Pemrograman berorientasi objek"};
        String[] matkulCE = {"Riset Operasi", "Jaringan Komputer", "Aljabar Linear"};
        String[] matkulIS = {"Sistem Database", "Administrasi Database"};

        System.out.println("Pilih kategori mata kuliah: ");
        System.out.println("1. Informatika");
        System.out.println("2. Computer Engineering");
        System.out.println("3. Informative System");
        System.out.print("Pilih: ");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("Daftar Mata Kuliah : ");
                show(matkulIF);
                break;
            case 2:
                System.out.println("Daftar Mata Kuliah : ");
                show(matkulCE);
                break;
            case 3:
                System.out.println("Daftar Mata Kuliah : ");
                show(matkulIS);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }

    public static void show(String[] matkul) {
        for (int i = 0; i < matkul.length; i++) {
            System.out.println("- " + matkul[i]);
        }
    }
}
