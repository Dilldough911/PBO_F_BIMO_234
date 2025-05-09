package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        Buku fiksi = new Fiksi("The Lord Of The Ring", "JRR Tolkien");
        Buku nonFiksi = new NonFiksi("Harry Potter", "Joanne Rowling");

        fiksi.displayInfo();
        System.out.println();
        nonFiksi.displayInfo();
        System.out.println();

        Anggota anggota1 = new Anggota("Bimo", "234");
        Anggota anggota2 = new Anggota("Rifadz", "268");

        anggota1.pinjamBuku("The Lord Of The Ring");
        anggota2.pinjamBuku("Harry Potter", 7);

        anggota1.kembalikanBuku("The Lord Of The Ring");
    }
}
