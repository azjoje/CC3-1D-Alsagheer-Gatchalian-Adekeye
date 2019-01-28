

public class SimpleEmploye{
        
    String name;
    float fixedsalary;
    char Classification;
    double WeeklyGross;
    double BonusRate;
    

    public SimpleEmploye(){
        this.name = name;
         this. fixedsalary =1500;
         this.Classification = Classification;
         this.WeeklyGross = WeeklyGross;
        this.BonusRate = 0.085;
        
    }
    
    
    
    
    
    public void setName(String empname){
        
        this.name = empname;
    }
    public void setWeeklyGross(double weeklysales){
        
        this.WeeklyGross = weeklysales;
    }
    public void setClassification(char classif){
        
        this.Classification = classif;
    }
    public String getname(){
        
        return this.name;
    }
    public double getWeeklyGross(){
        
        return this.WeeklyGross;
    }
    public float getFixedSalary(){
        
        return this.fixedsalary;
    }
    public char getClassification(){
        
        return this.Classification;
    }
    public double getBonusRate(){
        
        return this.BonusRate;
        
       
        }
        
    }
    
    


