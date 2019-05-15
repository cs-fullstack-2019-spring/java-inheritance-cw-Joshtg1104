package ex1;

public class Person {
    private String name;

    public Person(){
        this.name="Default";
    }

//    public Person(String name) {
//        this.name = name;
//    }

    public void anotherName(){
        name= "Johnny";
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String toString(){
        return getName();
    }
}
