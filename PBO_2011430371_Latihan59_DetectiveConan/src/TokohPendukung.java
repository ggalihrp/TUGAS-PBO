public class TokohPendukung extends TokohDetectiveConan {
    private String[] daftarTokoh = {"Ayumi Yoshida","Mitsuhiko Tsuburaya","Genta Kojima",
            "Ai Haibara","Sumiko Kobayashi","Sonoko Suzuki","Heiji Hattori","Kazuha Toyama"};

    public void daftarTokohPendukung() {
        System.out.println("\n==Daftar Tokoh Utama==");
        for (int i = 0; i < daftarTokoh.length; i++) {
            System.out.println(i+4 + ". " + daftarTokoh[i]);
        }
    }

}
