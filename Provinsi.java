public class Provinsi extends Wilayah {
    private String gubernur;

    public Provinsi(String nama, int populasi, String gubernur) {
        super(nama, populasi);
        this.gubernur = gubernur;
    }

    public String getGubernur() {
        return gubernur;
    }

    public void setGubernur(String gubernur) {
        this.gubernur = gubernur;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Gubernur: " + gubernur);
    }
}
