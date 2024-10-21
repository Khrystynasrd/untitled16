public class Details {

    //model, year of manufacture, color, price of the car
    //information about the manufacturer
    // Is it a convertible?
    private String model;
    private String manufacturer;
    private int year ;
    private String color;
    private   double price;
    private   int litersper100km;
    private int rozmir;

    public Details (String Model,String manufacturer,int year, String color,double price,int litersper100km,int rozmir) {
        this.model = Model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.price = price;
        this.litersper100km = litersper100km;
        this.rozmir = rozmir;
    }

    public String getFullInfo() {
        return  manufacturer + " " + model + "("+ color + ")\n"+" $"+price+"\n"+" " +year +"рік:"+litersper100km+"л\n";
    }

    double priceforafulltank (double litersper100km) {
        return litersper100km * rozmir;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double isPrice() {
        return price;
    }
    public void setLitersper100km(int litersper100km){
        this.litersper100km = litersper100km;
    }
    public int getLitersper100km(){
        return litersper100km;
    }
    public void setRozmir (int rozmir){
        this.rozmir = rozmir;
    }
    public int getRozmir (){
        return rozmir;
    }





}

