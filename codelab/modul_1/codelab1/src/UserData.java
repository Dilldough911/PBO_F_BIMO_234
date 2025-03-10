
import java.time.LocalDate;
import java.util.Scanner;

public class UserData {
    public UserData() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;
        String gender;
        if (jenisKelamin != 'L' && jenisKelamin != 'l') {
            if (jenisKelamin != 'P' && jenisKelamin != 'p') {
                gender = "Tidak Diketahui";
            } else {
                gender = "Perempuan";
            }
        } else {
            gender = "Laki-Laki";
        }

        System.out.println("\nData Diri:");
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + gender);
        System.out.println("Umur           : " + umur + " tahun");
        System.out.println("\nProcess finished with exit code 0");
        scanner.close();
    }
}
