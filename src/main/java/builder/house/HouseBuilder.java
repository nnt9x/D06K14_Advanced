package builder.house;

public class HouseBuilder implements Builder {
    private int windows = 0;
    private int doors = 0;
    private int rooms = 0;
    private boolean hasGarage = false;
    private boolean hasSwimPool = false;
    private boolean hasStatues = false;
    private boolean hasGarden = false;

    public HouseBuilder() {
    }

    @Override
    public Builder setWindows(int windows) {
        this.windows = windows;
        return this;
    }

    @Override
    public Builder setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    @Override
    public Builder setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    @Override
    public Builder setGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    @Override
    public Builder setSwimPool(boolean hasSwimPool) {
        this.hasSwimPool = hasSwimPool;
        return this;
    }

    @Override
    public Builder setStatues(boolean hasStatues) {
        this.hasStatues = hasStatues;
        return this;
    }

    @Override
    public Builder setGarden(boolean hasGarden) {
        this.hasGarage = hasGarden;
        return this;
    }

    @Override
    public House build() {
        return new House(windows,doors,rooms,hasGarage,hasSwimPool,hasStatues,hasGarden);
    }
}
