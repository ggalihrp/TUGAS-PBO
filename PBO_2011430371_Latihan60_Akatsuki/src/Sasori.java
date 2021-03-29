public class Sasori extends Akatsuki {
    private String partnerKerja;

    public Sasori() {
        this.nama = "Sasori";
        this.asalNegara = "Sunagakure";
        this.elemen = "-";
        this.jutsu = "Kugutsu";
        this.partnerKerja = "Orochimaru setelah itu Deidara";
    }

    @Override
    public void jabatan() {
        System.out.println("**" + nama + " dikenal sebagai \"Sasori si Pasir merah\"");
    }

    public String getPartnerKerja() {
        return partnerKerja;
    }


}
