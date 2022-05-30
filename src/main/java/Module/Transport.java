package Module;

public class Transport {

    private String id;
    private String name;
    private int seat;
    private String manufacturer;
    private String regisNumber;
    private String type;

    public Transport(String id, String name, int seat, String manufacturer, String regisNumber, String type) {
        this.id = id;
        this.name = name;
        this.seat = seat;
        this.manufacturer = manufacturer;
        this.regisNumber = regisNumber;
        this.type = type;
    }

    public Transport(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getRegisNumber() {
        return regisNumber;
    }

    public void setRegisNumber(String regisNumber) {
        this.regisNumber = regisNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void showInfo() {
        System.out.println("-  1. ID: " + this.getId());
        System.out.println("-  2. Type of Transport: " + this.getType());
        System.out.println("-  3. Name: " + this.getName());
        System.out.println("-  4. Number of seats: " + this.getSeat());
        System.out.println("-  5. Manufacturer: " + this.getManufacturer());
        System.out.println("-  6. Registration Number: " + this.getRegisNumber());
    }
}
