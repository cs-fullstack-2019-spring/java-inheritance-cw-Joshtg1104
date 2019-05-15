package ex2;

public class Resident extends Building {
    private Integer floors = 2;
    private Boolean parkingLot = false;
    private Boolean hasInspection = false;
    private double taxRate = 0.07;
    private String toString;


    public Resident(String name, double squareFeetPerFloor) {
        super(name, squareFeetPerFloor);
    }

    public String toString(){
        return "Building Name: "+ getName()+", SqFt: "+getSquareFeetPerFloor()+", floors: "+floors+", Has Parking Lot: "+parkingLot+", Has Inspections: "+hasInspection+", Tax Rate: "+taxRate+"\n\n";
    }
}
