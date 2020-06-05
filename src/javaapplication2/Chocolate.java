package javaapplication2;

public class Chocolate extends Product{
    
        public int weight;
        
    public Chocolate(String nameProduct, long barcode, double basicPrice, int weight){
    
        super(nameProduct, barcode, basicPrice);
        this.weight = weight;
    
    }
        
   
    @Override
     public String toString(){
     
         return super.toString() + "\nNeto: " + weight + " g"; 
         
         
     }
    
          
}
          


