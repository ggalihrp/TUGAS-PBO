public class KogoroMouri extends TokohUtama {

    public KogoroMouri() {
        this.nama  = "Kogoro Mouri";
        this.sifat = "Menyukai sake, judi, dan gadis";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah Detektif Swasta di Kota Beika. Ia dikenal sebagai Kogoro " +
                "\nTidur karena ia menundukan kepala seolah tidur ditengah analisisnya. Ia dikenal   " +
                "\nsebagai orang yang disegani banyak orang. Ia juga adalah mantan Perwira Polisi. " +
                "\nIa merupakan bapak dari Ran Mouri. ");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : Ahli Judo ");
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
