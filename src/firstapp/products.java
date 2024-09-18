
package firstapp;

public class products {
    int pid, stks, sold;
    String name;
    double price;
    
    
    public void addprod(int pd, String nm, double pr, int stk, int sd){
        
        this.pid = pd;
        this.name = nm;
        this.price = pr;
        this.stks = stk;
        this.sold = sd;
        
    }
    
    public void viewprod(){
        double total = this.price * this.sold;
        String stats = (this.stks == 0) ?"out of stocks" : "Available";
        System.out.printf("%-10d %-10s %-10d %-10s %-20.2f\n", this.pid, this.name,
                this.price, this.stks, this.sold, this.name);
        
    }
}
