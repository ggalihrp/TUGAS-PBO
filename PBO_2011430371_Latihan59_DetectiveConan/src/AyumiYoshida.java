public class AyumiYoshida extends TokohUtama {

    public AyumiYoshida() {
        this.nama  = "Ayumi Yoshida";
        this.sifat = "Baik hati dan murah senyum";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah teman Conan yang ceria dan selalu menggunakan kata " +
                "\nyang membuat suasana tenang. ");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : - ");
    }

    @Override
    public void kelemahanKamu() {
        System.out.println("Kelemahan : - ");
    }

    @Override
    public void tampilDataTokoh() {
        super.tampilDataTokoh();
    }
}
