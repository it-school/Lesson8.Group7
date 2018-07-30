public class Room {
    private int roomHeight;
    private int roomLenght;
    private int roomWidth;
    private int wallCost;


    Cost cost = new Cost();


    public Room(int roomHeight, int roomLenght, int roomWidth){
        this.roomHeight = roomHeight;
        this.roomLenght = roomLenght;
        this.roomWidth = roomWidth;
    }

    public void setRoomHeight(int roomHeight){
        this.roomHeight = roomHeight;
    }

    public int getRoomHeight(){
        return roomHeight;
    }

    public void setRoomWidth(int roomWidth){
        this.roomWidth = roomWidth;
    }

    public int getRoomWidth(){
        return roomWidth;
    }

    public void setRoomLenght(int roomLenght){
        this.roomLenght = roomLenght;
    }

    public int getRoomLenght(){
        return roomLenght;
    }

    public int getAreaWall(){
        return (roomHeight*roomLenght*2)+(roomHeight*roomWidth*2);
    }

    public int getAreaFloor(){
        return roomLenght*roomWidth;
    }

    public double getWallPrice(){
        return cost.getWallCost() * getAreaWall();
    }

    public double getFloorPrice(){
        return cost.getFloorCost() * getAreaFloor();
    }


}
