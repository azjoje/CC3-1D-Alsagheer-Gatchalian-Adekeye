
package simpleemployee;

/**
 *
 * @author m304user
 */
import java.util.Scanner;
public class SimpleEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
       String name;
       double gws;
        System.out.println("Enter name:");
       name = in.nextLine();
        System.out.println("Enter Weekly Gross:");
       gws = in.nextDouble();
       float bonus = (float) (gws * 0.085);
       double bonusPay = bonus;
        
        System.out.println("*****SNOW ENTERPRISES********");
        System.out.println("Employee Name : \t" + name);
        System.out.println("Gross Salary : \t\t" + gws);
        System.out.println("Bonus : \t\t" + bonus);
       
        
        
    }

    private static String NetWeekly(double bonus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String classify(String NetWeekly) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public double getNetWeekly(double GrossWeekSales){
        double NetWeekSal;
        NetWeekSal = GrossWeekSales * 0.085 + 1500;
        getClass(NetWeekSal);

        return NetWeekSal;
    }
     public char getClass(double NetWeekSal){
        char[] classfication = new char[6];
        double[] netsal = new double[6];
        char classification = 0;


        return classification;
    }

}
