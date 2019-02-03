package showstudent;
import java.util.Scanner;

public class ShowStudent {

  
    public static void main(String[] args) {
       Scanner cs = new Scanner(System.in);
        System.out.println("Enter IDno:");
        String setID = cs.nextLine();
        
       
       Student Emilfontanilla = new Student();
         
  
         Emilfontanilla.setHours(3);
         Emilfontanilla .setCreditHours(3);
         Emilfontanilla.setID(186968851);
         
        Scanner sc = new Scanner (System.in); 
        System.out.println("GPA:  "+Emilfontanilla.GPA());
        System.out.println("Points:  "+Emilfontanilla.points());
        System.out.println("ID:  "+Emilfontanilla.getIDnumber());
        System.out.println("Hours Creditied:  "+Emilfontanilla.getCreditHours()+Emilfontanilla .getNoOfHours ());
        
   
        
        System.out.println("studentletter "+Emilfontanilla.StudentLetter());
    
    
    }
   
}
    
