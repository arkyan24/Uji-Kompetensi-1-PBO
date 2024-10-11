public class Kabupaten extends Wilayah {
    private String bupati;

    public Kabupaten(String nama, int populasi, String bupati) {
        super(nama, populasi);
        this.bupati = bupati;
    }

    public String getBupati() {
        return bupati;
    }

    public void setBupati(String bupati) {
        this.bupati = bupati;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bupati: " + bupati);
    }
}
