import java.util.ArrayList;
import ex1.*;
import ex2.*;

public class Main {

    public static void main(String[] args) {
//        ex1();
        ex2();
    }

    private static void ex1(){
        ArrayList<String> greetingArray = new ArrayList<>();
        Person person0 = new Person();
        Friend person1 = new Friend();
        Teacher person2 = new Teacher();
        Doctor person3 = new Doctor();

        greetingArray.add(person0.toString());
        greetingArray.add(person1.toString());
        greetingArray.add(person2.toString());
        greetingArray.add(person3.toString());

        System.out.println(greetingArray + "\n\n");
        person0.anotherName();
        person1.anotherName();
        person2.anotherName();
        person3.anotherName();

        System.out.println(person0);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

    }

    private static void ex2(){
        ArrayList<String> buildingList = new ArrayList<>();
        Restuarant building1 = new Restuarant("Jonny's", 23000.23);
        Restuarant building2 = new Restuarant("Backyard Burger", 6300.78);
        Resident building3 = new Resident("Madison Apartments", 43000.65);
        Resident building4 = new Resident("Motel 8", 25000.45);
        Resident building5 = new Resident("Regal Retirement Residency", 125000.53);
        Commercial building6 = new Commercial("Crescent Building", 56789.78);

        buildingList.add(building1.toString());
        buildingList.add(building2.toString());
        buildingList.add(building3.toString());
        buildingList.add(building4.toString());
        buildingList.add(building5.toString());
        buildingList.add(building6.toString());

        System.out.println(buildingList.size());
        System.out.println(buildingList);
    }

}
