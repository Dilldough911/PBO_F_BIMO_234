class Hewan {
    String nama;
    String jenis;
    String suara;

    // Constructor
    Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    // Metode untuk menampilkan informasi hewan
    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek hewan
        Hewan hewan1 = new Hewan("ogye", "Mamalia", "Nyann");
        Hewan hewan2 = new Hewan("Ishowspeed", "Mamalia", "Woof Woof woof!!!");

        // Memanggil metode tampilkanInfo
        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}
