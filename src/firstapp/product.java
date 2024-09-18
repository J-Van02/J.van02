
package firstapp;
import java.util.Scanner;
public class product {
 
       
        
       Scanner sc = new Scanner(System.in);
       products[] pr = new products[100];
       
       int nump, i;
        double ttp = 0;
  public void manageproduts(){
      System.out.print("Enter no. of Products: ");
       nump = sc.nextInt();
        double ttp = 0;
       
        for ( i = 0; i< nump; i++){
           System.out.println("Enter details of Product "+(i + 1)+": ");
            System.out.print("ID: ");
            int pid = sc.nextInt();
           System.out.print("Name: ");
            String name = sc.next();
           System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Stock: ");
            int stks = sc.nextInt();
           System.out.print("Sold: ");
            int sold = sc.nextInt();
           pr[i]= new products();
           pr[i].addprod(pid, name, price, stks, sold);
        }
       
        for ( i = 0; i < nump; i++){
           pr[i].viewprod();
           ttp = ttp +(pr[i].price * pr[i].sold);
        }
           System.out.print("Total Profit: "+ttp); 
  }
}
