public class Cost {
    private double floorCost;
    private double wallCost;

    Cost(){
        this.floorCost = 30.0d;
        this.wallCost = 15.0d;
    }

    public double getFloorCost() {
        return floorCost;
    }

    public void setFloorCost(double floorCost) {
        this.floorCost = floorCost;
    }

    public double getWallCost() {
        return wallCost;
    }

    public void setWallCost(double wallCost) {
        this.wallCost = wallCost;
    }
}
