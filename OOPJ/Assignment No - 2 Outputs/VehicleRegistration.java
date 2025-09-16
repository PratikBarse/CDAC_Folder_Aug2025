
 class Vehicle {
        private static int vehicleCount = 1;
        private String regNo;
        private String ownerName;
        private String vehicleType;

        public Vehicle(String ownerName, String vehicleType) {
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
            this.regNo = "MH-2025-" + vehicleCount++;
        }

        @Override
        public String toString() {
            return "RegNo=" + regNo + ", Owner=" + ownerName + ", Type=" + vehicleType;
        }
    }
class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ravi", "Car");
        Vehicle v2 = new Vehicle("Pratik", "Bike");

        System.out.println(v1);
        System.out.println(v2);
    }
}
