/*
 * package com.fmc;
 * 
 * import org.springframework.stereotype.Component;
 * 
 * import com.vehicle.VehicleService;
 * 
 * @Component public class Vehicle { private VehicleService vehicleservice;
 * 
 * public void Vehicle(VehicleService vehicleservice) {
 * this.vehicleservice=vehicleservice; } public void start() {
 * vehicleservice.music(); vehicleservice.move(); }
 * 
 * 
 * 
 * }
 */

package com.fmc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Vehicle {
	@Autowired
    private VehicleService vehicleservice;

    public Vehicle(VehicleService vehicleservice) {
        this.vehicleservice = vehicleservice;
    }

    public void start() {
        vehicleservice.music();
        vehicleservice.move();
    }
}
