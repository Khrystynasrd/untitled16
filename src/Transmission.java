public class Transmission {
    private int gears;
    private String type;
    private boolean automatic;
    public Transmission (int gears,String type) {
        this.gears = gears;
        this.type = type;
        this.automatic = automatic;
    }

    public String gearsinfo (int money) {
        if (gears > 5 ) {
            return "The transmission has a high number of gears, which is great for fuel efficiency and performance"+ gears;
        } else
            return "The transmission has a moderate number of gears, which is decent for general use"+ gears;



    }
    public void  setType(String type){
        this.type = type;
    }
    public void  setGears(int gears){
        this.gears = gears;
    }
    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }
    public int getGears(){
        return gears;
    }
    public String getType(){
        return type;
    }
    public boolean isAutomatic(){
        return automatic  ;
    }


}
