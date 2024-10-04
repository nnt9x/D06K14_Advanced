package builder;


import builder.house.House;
import builder.house.HouseBuilder;

public class Main {
    public static void main(String[] args) {
        // De tao 1 ngoi nha, truyen rat nhieu tham so
        // Tao 1 ngoi nha co gara
        House house1 = new HouseBuilder()
                .setWindows(5)
                .setRooms(2)
                .setDoors(6)
                .setGarage(true)
                .build();

        System.out.println(house1);
        // Tao ngoi nha, co gara, vua co san vuon
        House house2 = new HouseBuilder()
                .setGarage(true)
                .setGarden(true)
                .setRooms(3)
                .setWindows(4)
                .setDoors(2)
                .build();

        System.out.println(house2);

    }
}
