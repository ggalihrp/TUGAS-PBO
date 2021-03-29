public class Bicycle extends Vehicle{
    private int myGearCount;

    public Bicycle() {
        this.myGearCount = 0;
        setMyBrand("Trek Bike");
        setMyModel("7.4FX");
        setMyGearCount(23);

        System.out.println("Bicycle");
        System.out.println("Brand  : "+getMyBrand());
        System.out.println("Model  : "+getMyModel());
        System.out.println("Jumlah Gear : "+getMyGearCount());
    }

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
}
