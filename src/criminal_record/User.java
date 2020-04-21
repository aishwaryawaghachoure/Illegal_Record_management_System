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
public class User {
    private final String name;
    private final long phn_no;
    private int fir_id;
    private String purpose;
    private Date date;
    private Time time;
    
    public User(String name,long phn_no,int fir_id,String purpose,Date date,Time time){
        this.name=name;
        this.phn_no=phn_no;
        this.fir_id=fir_id;
        this.purpose=purpose;
        this.date=date;
        this.time=time;
    }
    public String get_name(){
        return name;
    }
     public long get_phn_no(){
        return phn_no;
    }
      public int get_fir_id(){
        return fir_id;
    }
       public String get_purpose(){
        return purpose;
    }
        public Date get_date(){
        return date;
    }
         public Time get_time(){
        return time;
    }
    
}
