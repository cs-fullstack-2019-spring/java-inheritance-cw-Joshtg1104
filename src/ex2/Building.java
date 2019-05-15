package ex2;

public class Building {
    private String name;
    private double squareFeetPerFloor;

    public Building(String name, double squareFeetPerFloor) {
        this.name = name;
        this.squareFeetPerFloor = squareFeetPerFloor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSquareFeetPerFloor() {
        return squareFeetPerFloor;
    }

    public void setSquareFeetPerFloor(double squareFeetPerFloor) {
        this.squareFeetPerFloor = squareFeetPerFloor;
    }
}
