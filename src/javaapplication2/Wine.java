package javaapplication2;


public class Wine extends Product{
    
    public double volume;
    public final double TAX = 1.10;
    
    public Wine(String nameProduct, long barcode, double basicPrice, double volume){
        
        super(nameProduct, barcode, basicPrice);
        this.volume = volume;
    }
    
    
    @Override
    public double countPrice(){
        
        return super.countPrice() * TAX;
    }
    
    @Override
    public String toString(){
        
       return super.toString() + "\nNeto " + volume;
       
    } 
}
