import java.util.Scanner;

// Kelas Admin
class Admin {
    private final String username = "admin";
    private final String password = "admin123";

    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}

// Kelas Mahasiswa
class Mahasiswa {
    private final String nama = "Rey masterio";
    private final String nim = "123451";

    public boolean login(String inputNama, String inputNim) {
        return inputNama.equalsIgnoreCase(nama) && inputNim.equals(nim);
    }

    public void displayInfo() {
        System.out.println("Login berhasil! Informasi Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

// Kelas LoginSystem (kelas utama)
public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("Pilih jenis login: (1) Admin, (2) Mahasiswa");
        while (!scanner.hasNextInt()) {
            System.out.println("Harap masukkan angka 1 atau 2.");
            scanner.next();
        }
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // konsumsi newline

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
        }

        scanner.close();
    }
}
