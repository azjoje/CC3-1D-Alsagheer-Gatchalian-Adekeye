/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m304user
 */
public class Student {

    private int ID;
    private int CreditHr;
    private int Points;
    
    public Student(){
        this.ID=180719444;
        this.CreditHr=4 ;
        this.Points=12;
    }
    public int getID(){
        return ID;
    }
    public int getCredits(){
        return CreditHr;
    }
    public int getPoints(){
        return Points;
    }
    public int getGradeAve(){
        int GradeAve;
        GradeAve=Points/CreditHr;
        return GradeAve;
    }    
    public void setID(int ID){
        this.ID=ID;
    }
    public void setCreditHr(int credit){
        this.CreditHr=credit;
    }
    public void setPoints(int points){
        this.Points=points;
    }

       
}

    
    

