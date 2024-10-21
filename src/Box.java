public class Box {
    private double lendth;
    private double width;
    private double height;
    public Box (double lendth,double width,double height){
        this.lendth = lendth;
        this.width = width;
        this.height = height;
    }

    double volume() {
        return height*lendth*width;
    }

    public double getLendth(){
        return lendth;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight() {
        return height;
    }

    public void setLendth(double lendth){
        this.lendth = lendth;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }






}
