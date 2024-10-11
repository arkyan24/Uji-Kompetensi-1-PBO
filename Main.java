public class Main {
    public static void main(String[] args) {
        
        Provinsi provinsi = new Provinsi("Jawa Tengah", 50000000, "Ganjar Pranowo");
        Kabupaten kabupaten = new Kabupaten("Magelang", 3500000, "Zaenal Arifin");
        Kecamatan kecamatan = new Kecamatan("Muntilan", 50000, "Riyadi");

        System.out.println("Informasi Provinsi:");
        provinsi.tampilkanInfo();

        System.out.println("\nInformasi Kabupaten:");
        kabupaten.tampilkanInfo();

        System.out.println("\nInformasi Kecamatan:");
        kecamatan.tampilkanInfo();

        provinsi.tampilkanInfo("Provinsi Terbesar di Indonesia");
    }
}
