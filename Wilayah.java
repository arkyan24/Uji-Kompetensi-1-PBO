public class Wilayah {
    private String nama;
    private int populasi;

    public Wilayah(String nama, int populasi) {
        this.nama = nama;
        this.populasi = populasi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPopulasi() {
        return populasi;
    }

    public void setPopulasi(int populasi) {
        this.populasi = populasi;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Populasi: " + populasi);
    }

    public void tampilkanInfo(String tambahan) {
        System.out.println("Nama: " + nama + ", Populasi: " + populasi + ", " + tambahan);
    }
}
