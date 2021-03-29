public class Deidara extends Akatsuki {
    private String partnerKerja;

    public Deidara() {
        this.nama = "Deidara";
        this.asalNegara = "Iwagakure";
        this.elemen = "Tanah dan ledakan";
        this.jutsu = "-";
        this.partnerKerja = "Sasori kemudian dengan Tobi(Obito)";
    }

    @Override
    public void jabatan() {
        System.out.println("**" + nama + " adalah Ninja Pelarian dari " + asalNegara);
    }

    public String getPartnerKerja() {
        return partnerKerja;
    }


}
