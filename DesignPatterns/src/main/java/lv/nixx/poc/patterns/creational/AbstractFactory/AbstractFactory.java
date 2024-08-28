package lv.nixx.poc.patterns.creational.AbstractFactory;

// Abstract products
interface Chair {
    void sitOn();
}

interface Table {
    void placeOn();
}

// Product implementations
class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Сидим на модерн стуле.");
    }
}

class ModernTable implements Table {
    @Override
    public void placeOn() {
        System.out.println("Вещи на модерн столе.");
    }
}

class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Сидим на викторианском стуле.");
    }
}

class VictorianTable implements Table {
    @Override
    public void placeOn() {
        System.out.println("Вещи на викторианском столе.");
    }
}

interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}

class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}

class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}


public class AbstractFactory {
    private final Chair chair;
    private final Table table;

    public AbstractFactory(FurnitureFactory factory) {
        chair = factory.createChair();
        table = factory.createTable();
    }

    public void useFurniture() {
        chair.sitOn();
        table.placeOn();
    }

    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        AbstractFactory modernClient = new AbstractFactory(modernFactory);
        modernClient.useFurniture();

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        AbstractFactory victorianClient = new AbstractFactory(victorianFactory);
        victorianClient.useFurniture();
    }
}
