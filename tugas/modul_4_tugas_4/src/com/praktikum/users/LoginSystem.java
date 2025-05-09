package com.praktikum.main;

import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin("Admin", "0001", "admin123", "pass1234");
        Mahasiswa mahasiswa = new Mahasiswa("Budidojo", "2024001");

        System.out.println("Pilih login sebagai: 1. Admin  2. Mahasiswa");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline

        User user = null;

        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (admin.login(username, password)) {
                user = admin;
                System.out.println("Admin login sukses: " + admin.getNama());
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (mahasiswa.login(nama, nim)) {
                user = mahasiswa;
                System.out.println("Mahasiswa login sukses: " + mahasiswa.getNama());
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        if (user != null) {
            user.displayAppMenu(); // Polymorphism
        }

        scanner.close();
    }
}
