package patternts.combine.mvc;

public class HeatTestDrive {
    public static void main(String[] args) {
        HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
