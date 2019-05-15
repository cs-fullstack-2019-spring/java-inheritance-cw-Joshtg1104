package ex2;

public class Restuarant extends Building {
    private Integer floors = 1;
    private Boolean parkingLot = true;
    private Boolean hasInspection = true;
    private double taxRate = 0.10;
    private String toString;


    public Restuarant(String name, double squareFeetPerFloor) {
        super(name, squareFeetPerFloor);
    }

    public String toString(){
        return "Building Name: "+ getName()+", SqFt: "+getSquareFeetPerFloor()+", floors: "+floors+", Has Parking Lot: "+parkingLot+", Has Inspections: "+hasInspection+", Tax Rate: "+taxRate+"\n\n";
    }
}
