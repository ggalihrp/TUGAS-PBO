public class TokohUtama extends TokohDetectiveConan {
    private String[] daftarTokoh = {"Shinichi Kudo","Ran Mouri","Kogoro Mouri"};

    public void daftarTokohUtama() {
        System.out.println("\n==Daftar Tokoh Utama==");
        for (int i = 0; i < daftarTokoh.length; i++) {
            System.out.println(i+1 + ". " + daftarTokoh[i]);
        }
    }

}
