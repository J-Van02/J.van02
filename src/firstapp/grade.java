
package firstapp;

import java.util.Scanner;

public class grade {
 


        
      public void getGrades(){
         Scanner s = new Scanner(System.in);
        
        String name;
        int math,sci,eng,com,tt,marks;
        float ave;
        System.out.print("Enter your name: ");
        name = s.nextLine();
        System.out.println("Enter marks in");
    
        System.out.print("Math: ");
        math = s.nextInt();
        System.out.print("Science: ");
        sci = s.nextInt();
        System.out.print("English: ");
        eng = s.nextInt();
        System.out.print("Computer: ");
        com = s.nextInt();
        
        
        System.out.println("----------------------");
        System.out.println("Grade Detail");
        System.out.println("-----------------------");
        
        tt = math + sci + eng + com;
        ave = tt / 4;

        
        System.out.println("Name: "+name);
     
        System.out.println("Total Marks: "+tt);
      
        System.out.println("Total Average: "+ave);
        
    }
}
    

