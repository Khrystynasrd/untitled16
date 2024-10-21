public class Contain extends Transmission {
    private boolean automatic;
    public Contain (int gears,String type,boolean automatic){
        super (gears, type);
        this.automatic= automatic;

    }

    public Contain(int gears, String type) {
        super(gears, type);
    }

    public void getAutomatic(){
        if(automatic) {
            System.out.println("Easier to drive");
        }else {
            System.out.println("Not easier to drive");

        }

    }


}
