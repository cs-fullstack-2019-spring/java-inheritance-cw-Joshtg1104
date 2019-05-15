package ex1;

public class Doctor extends Person {

    public void anotherName(){
        setName("Morgan");
    }

    public String toString(){
        return "Good Morning/Afternoon Dr."+getName();
    }

}
