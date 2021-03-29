public class KazuhaToyama extends TokohUtama {

    public KazuhaToyama() {
        this.nama  = "Kazuha Toyama";
        this.sifat = "Baik hati dan suka menolong";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" Anak dariDetektif Toyama ini adalah teman sejak " +
                "\nkecilHeiji Hattori. Ia tinggal di Osaka dan ayahnya adalah seorang Polisi di Osaka. " +
                "\n Ia pernah secara tidak sengaja memborgol tangannya bersama dengan Heiji. " +
                "\nSehingga kemana-mana mereka terus bersama. ");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : Aikido.");
    }

    @Override
    public void kelemahanKamu() {
        System.out.println("Kelemahan : Hantu");
    }

    @Override
    public void tampilDataTokoh() {
        super.tampilDataTokoh();
    }
}
