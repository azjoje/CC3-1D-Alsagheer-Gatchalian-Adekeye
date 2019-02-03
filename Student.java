rivate int IDnumber;
    private int CreditHours;
    private int NoOfHours;
    private int GPA; 
    private int points;
    private char StudentLetter;
    private int Comp;
    //3 hours = 12 points 
    // 1 hour = 4 points
    //points = number of hours * 4 ?
    //Gpa = Points/Credithours 


    public Student()
    {
        this.IDnumber=1;
        this.CreditHours=0;
        this.NoOfHours =0;
        this.GPA=0;
    }
    
    
        public int getIDnumber()
    {
        return IDnumber;
    }
    public int getCreditHours()
    {
        return CreditHours;
    }
        public int getGPA()
    {
        return GPA;
    }
        public int getNoOfHours()
    {
        return NoOfHours;
    }
        public int getPoints()
    {
        return points;
    }
    public int NoOfHours()
    {
        return NoOfHours;
    }
    public void setID (int IDnumber)
    {
        this.IDnumber = IDnumber;
    }
    public void setCreditHours(int CreditHours)
    {
        this.CreditHours = CreditHours;
    }
    public void setHours(int NoOfHours)
    {
        this.NoOfHours = NoOfHours;
    }
 
    public int points()
    {
   points = CreditHours *4;
    return points;
    } 
    
        public int GPA()
    {
   GPA = points/ CreditHours;
   
   
    return GPA;
    } 
        
                public char StudentLetter()
    {
   GPA = points/ CreditHours*3;
   
  
           //Comp =  CreditHours * 4; 
   if (NoOfHours *4 == points){
       StudentLetter = 'A';
   }
   if (NoOfHours *4 != points){
       StudentLetter = 'B';     
   }
   if (CreditHours ==1){
       StudentLetter = 'C';
   }
    return StudentLetter;
    } 
    
}
