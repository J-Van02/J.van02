
package firstapp;

public class Firstapp {

    public static void main(String[] args) {
       
      grade grd = new grade ();
      grd.getGrades();

        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Product ID", "Name", "Price", "Status", "TEP");
        product pr = new product();
        pr.addprod(1011, "Soap", 20, 10, 200);
        pr.viewprod();
        
        product pr1 = new product();
        pr1.addprod(1012, "Cards", 50, 0, 0);
        pr1.viewprod();
        
        
    }
    
}
