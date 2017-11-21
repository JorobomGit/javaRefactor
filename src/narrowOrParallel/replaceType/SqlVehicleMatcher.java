package narrowOrParallel.replaceType;

public class SqlVehicleMatcher implements VehicleMatcher {

    @Override
    public int countVehicles(NewVehicleQuery query) {
        return new VehicleRepository().find(query).size();
    }
}
