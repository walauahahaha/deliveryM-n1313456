package clockinANDout;


import java.io.Serializable;


    import java.io.Serializable;
import java.util.*;
import java.util.GregorianCalendar;

public class Employee implements Serializable {

    

    
  private String name;
  private int EmployeeID;
  private int finishPosition;
  private String EmployeeStatus;
  private Calendar realTime;
  public Employee(int EmployeeID) {
    this.EmployeeID = EmployeeID;
  }
  
  public Employee(String name) {
    this.name = name;
    this.EmployeeID = EmployeeID;
    this.realTime = new GregorianCalendar();
  }

    Employee() {
        
    }

    

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getEmployeeID() {
    return EmployeeID;
  }

  public void setEmployeeID(int EmployeeID) {
    this.EmployeeID = EmployeeID;
  }
  public static String getTime(Calendar time) {
    return String.format("%02d:%02d:%02d", time.get(Calendar.HOUR_OF_DAY),
            time.get(Calendar.MINUTE), time.get(Calendar.SECOND));
  }
  
 
  public void setRealTime(Calendar realTIme){
      this.realTime = realTime;
  }
  public String getEmployeeStatus(){
      return EmployeeStatus;
  }
  
  public void setEmployeeStatus(String EmployeeStatus){
      this.EmployeeStatus = EmployeeStatus;
  }


  public int getFinishPosition() {
    return finishPosition;
  }

  public void setFinishPosition(int finishPosition) {
    this.finishPosition = finishPosition;
  }

  @Override
  public int hashCode() {
    int hash = 3;
    return hash;
  }

  
  
      
 
  public String toString() {
    return String.format(" Employee Name : %s \n "+ name + "\n Check in Time :" +getTime(realTime));
  }
  
  
}


