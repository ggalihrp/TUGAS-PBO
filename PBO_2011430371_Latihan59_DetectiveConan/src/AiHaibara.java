public class AiHaibara extends TokohUtama {

    public AiHaibara() {
        this.nama  = "Ai Haibara / Shiho Miyano";
        this.sifat = "Baik dan bisa diandalkan";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah mantan Apoteker dari Organisasi Hitam yang telah " +
                "\n kabur dari ruang gas organisasi. Ia juga tahu identitas Conan sebenarnya." +
                "\nSebenarnya, ia menaruh hati pada Conan. Arti Shiho Miyano sendiri adalah " +
                "\n\"Pemuda Cantik dan Abadi\". ");
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
