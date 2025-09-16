interface LandVehicle {
    void driveOnLand();   // method declaration only
}

interface WaterVehicle {
    void driveOnWater();  // method declaration only
}

class AmphibiousVehicle implements LandVehicle, WaterVehicle {
    String name;

    AmphibiousVehicle(String name) {
        this.name = name;
    }

    public void driveOnLand() {
        System.out.println(name + " -> Driving on Land");
    }

    public void driveOnWater() {
        System.out.println(name + " -> Driving on Water");
    }
}

class AmphibiousVehicleDemo {
    public static void main(String args[]) {
        AmphibiousVehicle ab = new AmphibiousVehicle("HydroCar");
        ab.driveOnLand();
        ab.driveOnWater();
    }
}
