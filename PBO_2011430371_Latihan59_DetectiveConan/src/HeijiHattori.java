public class HeijiHattori extends TokohUtama {

    public HeijiHattori() {
        this.nama  = "HeijiHattori";
        this.sifat = "Pandai menganalisis";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah seorang detektif SMU dari Osaka. Ayahnya, " +
                "\n Heizo Hattoriadalah Inspektur kepolisian Osaka. Ia bercita-cita " +
                "\nmenjadi Detektif.  Heiji sering disebut Detektif Besar dari Barat, " +
                "\nsedangkan Shinichi disebut Detektif Agung dari Timur.");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : mengusut kasus-kasus yang rumit dan sulit.");
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
