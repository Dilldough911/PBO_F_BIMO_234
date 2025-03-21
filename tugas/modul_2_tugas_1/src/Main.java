import java.util.Scanner;

class Admin {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin123";

    public boolean login(String inputUser, String inputPass) {
        return USERNAME.equals(inputUser) && PASSWORD.equals(inputPass);
    }
}

class Mahasiswa {
    private static final String NAMA = "Budi";
    private static final String NIM = "123456";

    public boolean login(String inputNama, String inputNim) {
        return NAMA.equals(inputNama) && NIM.equals(inputNim);
    }

    public void displayInfo() {
        System.out.println("Login berhasil! Informasi Mahasiswa:");
        System.out.println("Nama: " + NAMA);
        System.out.println("NIM: " + NIM);
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("Pilih jenis login: 1. Admin  2. Mahasiswa");
        if (!scanner.hasNextInt()) {
            System.out.println("Input tidak valid!");
            scanner.close();
            return;
        }
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan username: ");
                String username = scanner.nextLine().trim();
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine().trim();

                if (admin.login(username, password)) {
                    System.out.println("Login Admin berhasil!");
                } else {
                    System.out.println("Login gagal! Username atau password salah.");
                }
                break;
            case 2:
                System.out.print("Masukkan nama: ");
                String nama = scanner.nextLine().trim();
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine().trim();

                if (mahasiswa.login(nama, nim)) {
                    mahasiswa.displayInfo();
                } else {
                    System.out.println("Login gagal! Nama atau NIM salah.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }

        scanner.close();
    }
}
