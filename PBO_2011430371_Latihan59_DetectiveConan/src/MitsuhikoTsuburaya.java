public class MitsuhikoTsuburaya extends TokohUtama {

    public MitsuhikoTsuburaya() {
        this.nama  = "Mitsuhiko Tsuburaya";
        this.sifat = "Dewasa, suka bekerja sama, dan pandai";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah anggota grup detektif cilik. " +
                "\nCara bicaranya yang sopan adalah karena kedua orang tuanya adalah guru." +
                "\nDiam-diam, ia cemburu terhadap kedekatan Conan dan Ai. ");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : Wawasan Tinggi ");
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
