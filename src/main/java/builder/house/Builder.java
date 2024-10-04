package builder.house;

public interface Builder {
    public Builder setWindows(int windows);

    public Builder setDoors(int doors);

    public Builder setRooms(int rooms);

    public Builder setGarage(boolean hasGarage);

    public Builder setSwimPool(boolean hasSwimPool);

    public Builder setStatues(boolean hasStatues);

    public Builder setGarden(boolean hasGarden);

    public House build(); // Build ra 1 ngoi nha
}
