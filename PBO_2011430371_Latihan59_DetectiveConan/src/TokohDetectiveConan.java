public class TokohDetectiveConan {
    protected String nama;
    protected String sifat;

    public TokohDetectiveConan() {
        this.nama = " ";
        this.sifat = " ";
    }

    public void daftarKategoriTokoh() {
        System.out.println("===PILTER - Pilih Karakter===");
        System.out.println("1. Tokoh Utama \n2. Tokoh Pendukung");
    }

    public void siapaKamu() {
        System.out.println("Saya adalah salah satu tokoh dari film Detective Conan");
    }

    public void kemampuanKamu() {
        System.out.println("Kemampuan saya adalah masuk dalam film Detective Conan");
    }

    public void kelemahanKamu() {
        System.out.println("Tidak bisa masuk ke bioskop Metro TV");
    }

    public void tampilDataTokoh() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Nama : "+nama);
        System.out.println("Sifat : "+sifat);
        siapaKamu();
        kemampuanKamu();
        kelemahanKamu();
    }

}
