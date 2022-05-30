package Module;

public class RoadTransport extends Transport {

    private int roadProp1;
    private String roadProp2;

    public int getRoadProp1() {
        return roadProp1;
    }

    public RoadTransport(String id, String name, int seat, String manufacturer, String regisNumber, String type, int roadProp1, String roadProp2) {
        super(id, name, seat, manufacturer, regisNumber, type);
        this.roadProp1 = roadProp1;
        this.roadProp2 = roadProp2;
    }

    public RoadTransport(String id, String name) {
        super(id, name);
    }

    public void setRoadProp1(int roadProp1) {
        this.roadProp1 = roadProp1;
    }

    public String getRoadProp2() {
        return roadProp2;
    }

    public void setRoadProp2(String roadProp2) {
        this.roadProp2 = roadProp2;
    }

    @Override
    public void showInfo() {
        System.out.println("Road Transport Information: ");
        super.showInfo();
    }


}
