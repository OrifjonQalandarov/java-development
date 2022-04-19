package task;

public class Employee implements Human {
    private String ined;
    private String Name;
    private String LastName;
    private double Salary;

    public String getIned(){
        return ined;
    }

    public void setIned(String ined){
        this.ined = ined;
    }

    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public String getLastName(){
        return LastName;
    }

    public void setLastName(String LastName){
        this.LastName = LastName;
    }



    @Override
    public void gettoSalary() {

    }

    @Override
    public void getHoliday() {

    }
}
