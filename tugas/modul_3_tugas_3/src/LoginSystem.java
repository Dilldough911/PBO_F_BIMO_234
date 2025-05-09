import java.util.Scanner;

// Superclass User
class User {
    private String nama;
    private String nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public boolean login(String nama, String nim) {
        return false; // Akan dioverride oleh subclass
    }

    public void displayInfo() {
        System.out.println("User Info: " + nama + " (NIM: " + nim + ")");
    }
}

// Subclass Admin
class Admin extends User {
    private String username;
    private String password;

    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin login sukses: " + getNama());
    }
}

// Subclass Mahasiswa
class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String nama, String nim) {
        return this.getNama().equals(nama) && this.getNim().equals(nim);
    }

    @Override
    public void displayInfo() {
        System.out.println("Mahasiswa login sukses: " + getNama() + " (NIM: " + getNim() + ")");
    }
}

// Kelas utama LoginSystem
public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin("Admin", "0001", "admin123", "pass1234");
        Mahasiswa mahasiswa = new Mahasiswa("Budidojo", "2024001");

        System.out.println("Pilih login sebagai: 1. Admin  2. Mahasiswa");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline

        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (admin.login(username, password)) {
                admin.displayInfo();
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (mahasiswa.login(nama, nim)) {
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}