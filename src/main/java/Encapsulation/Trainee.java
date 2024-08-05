package Encapsulation;

public class Trainee {

    private String fullName;
    private String ID;
    /*
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    */
    public void setFullName(String newFullName){
        fullName = newFullName;
    }

    public String getFullName(){
        return fullName;
    }

    public void setID(String newID){
        ID = newID;
    }

    public String getID(){
        return ID;
    }


}
