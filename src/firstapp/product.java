
package firstapp;

public class product {

int id, price, stocks, tep;
    String name;
    
    
    
    public void addprod(int pid, String pname, int pr, int st, int teps){
        
        this.id = pid;
        this.name = pname;
        this.price = pr;
        this.stocks = st;
        this.tep = teps;
        
    }
    
    public void viewprod(){
        double total = this.price * this.stocks;
        String stats = (this.stocks == 0) ?"out of stocks" : "Available";
        System.out.printf("%-10d %-10s %-10d %-10s %-20.2f\n", this.id, this.name,
                this.price, stats, total);
        
    }
}

