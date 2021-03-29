public class Hidan extends Akatsuki {
    private String partnerKerja;

    public Hidan() {
        this.nama = "Hidan";
        this.asalNegara = "Yugakure";
        this.elemen = "-";
        this.jutsu = "Ritual Jashin";
        this.partnerKerja = "Kakuzu";
    }

    @Override
    public void jabatan() {
        System.out.println("**" + nama + " adalah seorang penganut agama bernama 'Jashin', sebuah kepercayaan yang menyembah " +
                "\nDewa Jashin. Dia Tidak bisa dibunuh, dan bisa melukai lawannya dengan cara melukai dirinya " +
                "\nsendiri setelah meminum darah lawannya.");
    }

    public String getPartnerKerja() {
        return partnerKerja;
    }


}
