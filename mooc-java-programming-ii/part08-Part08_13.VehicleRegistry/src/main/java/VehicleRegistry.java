import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicleRegistry;

    public VehicleRegistry() {
        vehicleRegistry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (vehicleRegistry.containsKey(licensePlate)) return false;
        vehicleRegistry.put(licensePlate, owner); return true;
    }

    public String get(LicensePlate licensePlate) {
        return vehicleRegistry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!(vehicleRegistry.containsKey(licensePlate))) return false;
        vehicleRegistry.remove(licensePlate); return true;
    }

    public void printLicensePlates() {
        for (LicensePlate lp: vehicleRegistry.keySet()) {
            System.out.println(lp);
        }
    }

    public void printOwners() {
        ArrayList<String> ownerNames = new ArrayList<>();

        for (String name: vehicleRegistry.values()) {
            if (!(ownerNames.contains(name))) ownerNames.add(name);
        }

        for (String name: ownerNames) {
            System.out.println(name);
        }
    }
}
