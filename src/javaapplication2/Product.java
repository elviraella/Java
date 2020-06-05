package javaapplication2;


public abstract class Product {
    
    public String nameProduct;
    public long barcode;
    public double basicPrice;
    public  final double VAT = 1.20;
    
    public Product(String nameProduct, long barcode, double basicPrice){
    
        this.nameProduct = nameProduct;
        this.barcode = barcode;
        this.basicPrice = basicPrice;
    
    }
    
    public double countPrice(){
        return this.basicPrice * VAT;
    }
     
    @Override
    public String toString(){ 
     
        return "Naziv: " + nameProduct + " \nBarkod: " + barcode +   "\nCijena " + countPrice()+ " KM";

    }
 
}