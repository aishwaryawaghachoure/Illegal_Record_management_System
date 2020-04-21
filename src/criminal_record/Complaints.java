package criminal_record;
import java.sql.Date;
import java.sql.Time;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aishwarya Waghchoure
 */
public class Complaints {
    private final String name;
    private String surname;
    private String complaint;
    
    
    public Complaints(String name,String surname,String complaint){
        this.name=name;
        this.surname=surname;
        this.complaint=complaint;
     }
    public String get_name(){
        return name;
    }
    
      public String get_surname(){
        return surname;
    }
       public String get_complaint(){
        return complaint;
    }
      
}
