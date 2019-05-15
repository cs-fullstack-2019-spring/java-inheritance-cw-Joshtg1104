package ex1;

public class Friend extends Person {

    public void anotherName(){
       setName("Bella");
    }

    public String toString(){
        return "What's up, "+getName();
    }
}
