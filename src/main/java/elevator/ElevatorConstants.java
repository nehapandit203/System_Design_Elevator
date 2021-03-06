package elevator;

public interface ElevatorConstants {
    String ELEVATOR_AVAILABLE = "ELEVATOR_AVAILABLE";

    interface ElevatorStateConstant {
        String STOP = "IDLE";//REST
        String UP = "UP";
        String DOWN = "DOWN";
        String IDLE = "IDLE";
    }

    interface FloorConstant {
        int MIN = 0;
        int MAX = 10;
    }

}
