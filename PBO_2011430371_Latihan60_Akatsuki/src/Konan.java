public class Konan extends Akatsuki {
    private String partnerKerja;

    public Konan() {
        this.nama = "Konan";
        this.asalNegara = "Amegakure";
        this.elemen = "Kertas";
        this.jutsu = "Tenshi no Fukuin";
        this.partnerKerja = "Pain";
    }

    @Override
    public void jabatan() {
        System.out.println("**" + nama + " adalah rekan Pain, dan memiliki jurus origami yaitu kertas lipat, "+
                "\ndia juga dapat membuat tubuhnya menjadi lembaran-lembaran kertas. Bersama Yahiko dan Nagato " +
                "\nmereka bertiga adalah bekas murid Jiraiya sannin, mereka bertigalah yang awalnya membentuk " +
                "\nakatsuki untuk menciptakan perdamaian dengan cara bermusyawarah tanpa kekerasan, namun " +
                "\nYahiko terbunuh dan Nagato akhirnya bekerja sama dengan Tobi dan mengubah tujuan akatsuki.");
    }

    public String getPartnerKerja() {
        return partnerKerja;
    }


}
