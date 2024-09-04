
package firstapp;
import java.util.Scanner;
public class Firstapp {

    public static void main(String[] args) {
       
      /*grade grd = new grade ();
      grd.getGrades();

       System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Product ID", "Name", "Price", "Status", "TEP");
       product pr = new product();
       pr.addprod(1011, "Soap", 20, 10, 200);
      pr.viewprod();
        
       product pr1 = new product();
       pr1.addprod(1012, "Cards", 50, 0, 0);
        pr1.viewprod();
        
       Scanner sc = new Scanner(System.in);
       product[] pr = new product[100];
       
       int nump, i;
       
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
           pr[i]= new product();
           pr[i].addprod(pid, name, price, stks, sold);
        }
       
        for ( i = 0; i < nump; i++){
           pr[i].viewprod();
           ttp = ttp +(pr[i].price * pr[i].sold);
        }
           System.out.print("Total Profit: "+ttp);
*/
      Scanner s = new Scanner(System.in);
      account[] acc = new account[100];
       
        int no, i, id;

        System.out.print("Enter number of Accounts: ");
        no = s.nextInt();

        for (i = 0; i < no; i++) {
            acc[i] = new account();
         
            boolean identi;
            boolean email1;
            boolean username;
           
            System.out.println("Enter account Details " + (i + 1) + ": ");
            while (true) {
                System.out.print("Enter ID: ");
                id = s.nextInt();
                identi = false;

               
                for (int x = 0; x < i; x++) {
                    if (acc[x] != null && acc[x].id == id) {
                        identi = true;
                        break;
                    }
                }

                if (identi) {
                    System.out.println(" - ID already exists. Try again -");
                } else {
                   
                    acc[i].id = id;
                    break;
                }
            }
           
            System.out.print("First Name: ");
            String fname = s.next();
            System.out.print("Last Name: ");
            String lname = s.next();
           
             while (true) {
                System.out.print("Email: ");
                String email = s.next();
                email1 = false;

               
                for (int x = 0; x < i; x++) {
                    if (acc[x] != null && acc[x].email.equals(email)) {
                        email1 = true;
                        break;
                    }
                }

                if (email1) {
                    System.out.println(" - Email already exists. Try again -");
                } else {
                   
                    acc[i].email = email;
                    break;
                }
            }
           
             while (true) {
                System.out.print("Username: ");
                String user = s.next();
                username = false;

               
                for (int x = 0; x < i; x++) {
                    if (acc[x] != null && acc[x].username.equals(user)) {
                        username = true;
                        break;
                    }
                }

                if (username) {
                    System.out.println(" - Username already exists. Try again -");
                } else {
                   
                    acc[i].username = user;
                    break;
                }
            }
           
            boolean passValid = false;
           
            while (!passValid) {
                System.out.print("Password: ");
                String password = s.next();

                if (acc[i].passwordVerify(password)) {
                    acc[i].addAccount(acc[i].id, fname, lname, acc[i].email, acc[i].username, password);
                    passValid = true;  
                } else {
                    System.out.println(" - Invalid password - , Try Again ");
                }
            }
            System.out.println("");
       

        }
        System.out.println("Account Details: ");
         System.out.printf("%-10s %-10s %-10s %-20s %-13s %-10s\n","ID", "FirstName", "LastName", "Email", "Username", "Password");
         System.out.println("---------------------------------------------------------------------------------");
        for (i = 0; i < no; i++) {
            if(acc[i] != null){
            acc[i].viewAccount();
            System.out.println("");
        }
        }
    }

    
}

    
    

