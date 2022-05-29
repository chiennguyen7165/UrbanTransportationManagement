package Module;

public class WaterTransport extends Transport {
    private int waterProp1;
    private String waterProp2;

    public int getWaterProp1() {
        return waterProp1;
    }

    public WaterTransport(String id, String name, int seat, String manufacturer, String regisNumber, String type, int waterProp1, String waterProp2) {
        super(id, name, seat, manufacturer, regisNumber, type);
        this.waterProp1 = waterProp1;
        this.waterProp2 = waterProp2;
    }

    public WaterTransport(String id, String name) {
        super(id, name);
    }

    public void setWaterProp1(int waterProp1) {
        this.waterProp1 = waterProp1;
    }

    public String getWaterProp2() {
        return waterProp2;
    }

    public void setWaterProp2(String waterProp2) {
        this.waterProp2 = waterProp2;
    }

    @Override
    protected void showInfo() {
        System.out.println("Water transport information: ");
        super.showInfo();
    }
}
