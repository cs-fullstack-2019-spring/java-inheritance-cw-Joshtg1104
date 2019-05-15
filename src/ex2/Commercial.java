package ex2;

public class Commercial extends Building {
    private Integer floors = 4;
    private Boolean parkingLot = true;
    private Boolean hasInspection = true;
    private double taxRate = 0.15;
    private String toString;


    public Commercial(String name, double squareFeetPerFloor) {
        super(name, squareFeetPerFloor);
    }

    public String toString(){
        return "Building Name: "+ getName()+", SqFt: "+getSquareFeetPerFloor()+", floors: "+floors+", Has Parking Lot: "+parkingLot+", Has Inspections: "+hasInspection+", Tax Rate: "+taxRate+"\n\n";
    }
}
