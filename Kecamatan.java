public class Kecamatan extends Wilayah {
    private String camat;

    public Kecamatan(String nama, int populasi, String camat) {
        super(nama, populasi);
        this.camat = camat;
    }

    public String getCamat() {
        return camat;
    }

    public void setCamat(String camat) {
        this.camat = camat;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Camat: " + camat);
    }
}
