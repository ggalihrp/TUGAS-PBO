public class Kakuzu extends Akatsuki {
    private String partnerKerja;

    public Kakuzu() {
        this.nama = "Kakuzu";
        this.asalNegara = "Takigakure";
        this.elemen = "Tanah, Angin, Air, Petir, Api";
        this.jutsu = "-";
        this.partnerKerja = "Hidan";
    }

    @Override
    public void jabatan() {
        System.out.println("**" + nama + " adalah anggota akatsuki yang suka menabung dengan cara berburu buronan " +
                "\nlalu menebusnya dengan uang. Dia dapat memperpanjang hidupnya dengan cara mengambil jantung manusia. " +
                "\nKakuzu pernah melaksanakan misi dari negaranya untuk membunuh Hokage pertama (Hashirama) namun gagal " +
                "\ndan membuatnya dihukum berat. Hal tersebut membuatnya melarikan diri kemudian bergabung dengan Akatsuki.");
    }

    public String getPartnerKerja() {
        return partnerKerja;
    }


}
