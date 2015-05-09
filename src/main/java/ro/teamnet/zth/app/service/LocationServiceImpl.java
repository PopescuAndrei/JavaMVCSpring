package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.dao.EmployeeDao;
import ro.teamnet.zth.app.dao.LocationDao;
import ro.teamnet.zth.app.domain.Employee;
import ro.teamnet.zth.app.domain.Location;

import java.util.List;

/**
 * Created by Andrei on 5/7/2015.
 */
public class LocationServiceImpl implements LocationService{
    @Override
    public List<Location> findAllLocations() {
        LocationDao dao = new LocationDao();
        List<Location> locations = dao.getAllLocations();
        return locations;
    }

    @Override
    public Location getLocation(int locationId) {
        return new LocationDao().getLocationById(locationId);
    }

    @Override
    public void deleteLocation(int locationId) {
        LocationDao dao = new LocationDao();
        dao.deleteLocation(dao.getLocationById(locationId));
    }

    @Override
    public Location insertLocation(Location location) {
        LocationDao dao = new LocationDao();
        return dao.insertLocation(location);
    }

    @Override
    public Location updateLocation(Location location) {
        LocationDao dao = new LocationDao();
        return dao.updateLocation(location);
    }
}
