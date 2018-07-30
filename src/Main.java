public class Main {
    public static void main(String[] args) {
        Room room = new Room(3, 10, 4);
//        room.setRoomHeight(3);
//        room.setRoomLenght(10);
//        room.setRoomWidth(4);
        System.out.println(room.getRoomHeight());
        System.out.println(room.getRoomLenght());
        System.out.println(room.getRoomWidth() + '\n');


        System.out.println(room.getWallPrice());
        System.out.println(room.getFloorPrice());

    }
}
