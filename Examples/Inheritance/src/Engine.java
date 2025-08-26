public class Engine extends Part {
    private String engineType;

    public Engine(String engineType, String identifier, String manufacturer, String description, double cost) {
        super(identifier, manufacturer, description, cost);
        this.engineType = engineType;
    }

    public String getEngineType() { return engineType; }
}
/*
public class Engine {
    private String engineType;
    private String identifier;
    private String manufacturer;
    private String description;
    private double cost;

    public TradEngine(String engineType, String identifier, String manufacturer, String description, double cost) {
        this.engineType   = engineType;
        this.identifier   = identifier;
        this.manufacturer = manufacturer;
        this.description  = description;
        this.cost         = cost;
    }
    public String getEngineType()   { return engineType; }
    public String getIdentifier()   { return identifier; }
    public String getDescription()  { return description; }
    public String getManufacturer() { return manufacturer; }
    public double  getCost()        { return cost; }
}

 */