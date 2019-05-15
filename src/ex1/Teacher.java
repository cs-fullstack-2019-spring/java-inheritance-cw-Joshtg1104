package ex1;

public class Teacher extends Person {

    public void anotherName(){
        setName("Lesley");
    }

    public String toString(){
        return "Hello Mr/Mrs."+getName();
    }

}
