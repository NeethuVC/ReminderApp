/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReminderApp;

/**
 *
 * @author Neethu
 */

public class reminder {
    private String Head;
    private String Notes;
    private String date,AddDate;
   public reminder(String tt1,String tt2,String d2,String AddDate)
    {
        this.Head=tt1;
        this.Notes=tt2;
        this.date=d2;
        this.AddDate=AddDate;
    }
    public String getHead()
    {
        return Head;
    }
    public String getNotes()
    {
        return Notes;
    }
    public String getDate()
    {
        return date;
    }
     public String getAddDate()
    {
        return AddDate;
    }
    
}
