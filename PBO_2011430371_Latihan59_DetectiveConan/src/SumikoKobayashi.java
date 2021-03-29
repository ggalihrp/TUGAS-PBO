public class SumikoKobayashi extends TokohUtama {

    public SumikoKobayashi() {
        this.nama  = "Sumiko Kobayashi";
        this.sifat = "Pemalu dan Sensitif";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah wali kelasConan. ia sangat sayang pada " +
                "\n anak-anak. Ia juga suka novel misteri, terutama karya Edogawa Rampo.");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : Mengajar ");
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
