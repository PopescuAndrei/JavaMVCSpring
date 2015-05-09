package ro.teamnet.zth.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.teamnet.zth.app.domain.Location;
import ro.teamnet.zth.app.domain.Location;
import ro.teamnet.zth.app.service.LocationServiceImpl;
import ro.teamnet.zth.app.service.LocationServiceImpl;

import java.util.List;

/**
 * Created by Andrei on 5/6/2015.
 */
@Controller
@RequestMapping(value="/locations")
public class LocationsController {

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    List<Location> getAllLocations() {
        LocationServiceImpl locationService = new LocationServiceImpl();
        return locationService.findAllLocations();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{locationId}")
    public
    @ResponseBody
    Location getOneLocation(@PathVariable("locationId") int locationId) {
        LocationServiceImpl locationService = new LocationServiceImpl();
        return locationService.getLocation(locationId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{locationId}")
    public void deleteOneLocation(@PathVariable("locationId") int locationId) {
        LocationServiceImpl locationService = new LocationServiceImpl();
        locationService.deleteLocation(locationId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    Location insertLocation(@RequestBody Location location) {

        LocationServiceImpl locationService = new LocationServiceImpl();
        return locationService.insertLocation(location);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody
    Location updateLocation(@RequestBody Location location) {
        LocationServiceImpl locationService = new LocationServiceImpl();
        return locationService.updateLocation(location);
    }
}
