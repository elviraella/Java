package javaapplication2;


public class JavaApplication2 {

    
    public static void main(String[] args) {
       
       Chocolate chocolate = new Chocolate("Milka", 387456789430L, 2.20, 100);
       System.out.println(chocolate);
       
       Wine wine = new Wine("Prošek", 387584729345L, 48, 0.75);
       System.out.println(wine);
    }
    
}
