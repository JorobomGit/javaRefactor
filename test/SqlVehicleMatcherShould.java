import narrowOrParallel.replaceType.NewVehicleQuery;
import narrowOrParallel.replaceType.SqlVehicleMatcher;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SqlVehicleMatcherShould {
    @Test
    public void find_vehicles() throws Exception {
        SqlVehicleMatcher matcher = new SqlVehicleMatcher();
        String brandDescription = "VW Polo";

        assertThat(matcher.countVehicles(new NewVehicleQuery(
                brandDescription.split(" ")[0],
                brandDescription.split(" ")[1])
        )).isEqualTo(1);
    }
}
