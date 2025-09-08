package week02.eldo.id.ac.umn;
import java.util.Scanner;

class Tutor {
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

class HitungHari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bulan (1-12): ");
        int bulan = scanner.nextInt();

        switch (bulan) {
            case 1:
                System.out.println("Bulan Januari memiliki 31 hari");
                break;
            case 2:
                System.out.println("Bulan Februari memiliki 28 atau 29 hari (kabisat)");
                break;
            case 3:
                System.out.println("Bulan Maret memiliki 31 hari");
                break;
            case 4:
                System.out.println("Bulan April memiliki 30 hari");
                break;
            case 5:
                System.out.println("Bulan Mei memiliki 31 hari");
                break;
            case 6:
                System.out.println("Bulan Juni memiliki 30 hari");
                break;
            case 7:
                System.out.println("Bulan Juli memiliki 31 hari");
                break;
            case 8:
                System.out.println("Bulan Agustus memiliki 31 hari");
                break;
            case 9:
                System.out.println("Bulan September memiliki 30 hari");
                break;
            case 10:
                System.out.println("Bulan Oktober memiliki 31 hari");
                break;
            case 11:
                System.out.println("Bulan November memiliki 30 hari");
                break;
            case 12:
                System.out.println("Bulan Desember memiliki 31 hari");
                break;
            default:
                System.out.println("Input tidak valid! Harus antara 1 sampai 12.");
        }
    }
}

class CekPrima {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();

        if (angka <= 1) {
            System.out.println(angka + " bukan bilangan prima");
        } else {
            boolean prima = true;
            for (int i = 2; i <= angka / 2; i++) {
                if (angka % i == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.println(angka + " adalah bilangan prima");
            } else {
                System.out.println(angka + " bukan bilangan prima");
            }
        }
    }
}
