package lv.nixx.poc.patterns.creational.Builder;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
class House {
    private String walls;
    private String roof;
    private String doors;
    private String windows;
}

// Интерфейс Builder
interface HouseBuilder {
    HouseBuilder buildWalls();

    HouseBuilder buildRoof();

    HouseBuilder buildDoors();

    HouseBuilder buildWindows();

    House buildHouse();
}

// Конкретная реализация Builder
class WoodenHouseBuilder implements HouseBuilder {

    private final House house;

    public WoodenHouseBuilder() {
        this.house = new House();
    }

    @Override
    public HouseBuilder buildWalls() {
        house.setWalls("Wooden Walls");
        return this;
    }

    @Override
    public HouseBuilder buildRoof() {
        house.setRoof("Wooden Roof");
        return this;
    }

    @Override
    public HouseBuilder buildDoors() {
        house.setDoors("Wooden Doors");
        return this;
    }

    @Override
    public HouseBuilder buildWindows() {
        house.setWindows("Glass Windows");
        return this;
    }

    @Override
    public House buildHouse() {
        return this.house;
    }
}

class StoneHouseBuilder implements HouseBuilder {
    private final House house;

    public StoneHouseBuilder() {
        this.house = new House();
    }

    @Override
    public HouseBuilder buildWalls() {
        house.setWalls("Stone Walls");
        return this;
    }

    @Override
    public HouseBuilder buildRoof() {
        house.setRoof("Stone Roof");
        return this;
    }

    @Override
    public HouseBuilder buildDoors() {
        house.setDoors("Steel Doors");
        return this;
    }

    @Override
    public HouseBuilder buildWindows() {
        house.setWindows("Reinforced Glass Windows");
        return this;
    }

    @Override
    public House buildHouse() {
        return this.house;
    }
}

// Данный класс не обязательный, такое код может вызыватся просто в приложение
class ConstructionEngineer {
    private final HouseBuilder houseBuilder;

    public ConstructionEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        return houseBuilder.buildWalls()
                .buildRoof()
                .buildDoors()
                .buildWindows()
                .buildHouse();
    }
}


public class BuilderSample {

    public static void main(String[] args) {

        HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
        ConstructionEngineer engineer1 = new ConstructionEngineer(woodenHouseBuilder);
        House woodenHouse = engineer1.constructHouse();
        System.out.println("House is: " + woodenHouse);

        HouseBuilder stoneHouseBuilder = new StoneHouseBuilder();
        ConstructionEngineer engineer2 = new ConstructionEngineer(stoneHouseBuilder);
        House stoneHouse = engineer2.constructHouse();
        System.out.println("House is: " + stoneHouse);
    }
}
