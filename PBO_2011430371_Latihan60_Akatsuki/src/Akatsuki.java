public class Akatsuki {
    protected String nama;
    protected String asalNegara;
    protected String elemen;
    protected String jutsu;

//    protected String jabatan;
//    protected String usia;
//    protected String partnerKerja;

    public Akatsuki() {
        this.nama = " " ;
        this.asalNegara = " " ;
        this.elemen = " " ;
        this.jutsu = " " ;
    }

    public void tampilData() {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Nama \t: "+nama);
        System.out.println("Asal Negara : "+asalNegara);
        System.out.println("Elemen \t: "+elemen);
        System.out.println("Jutsu\t: "+jutsu);
    }

    public void jabatan() {
        System.out.println("**"+nama +" adalah anggota Akatsuki");
    }

}
