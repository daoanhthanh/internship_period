package vn.daoanhthanh.builder.example.builder;

import vn.daoanhthanh.builder.example.car.CarType;
import vn.daoanhthanh.builder.example.components.Engine;
import vn.daoanhthanh.builder.example.components.GPSNavigator;
import vn.daoanhthanh.builder.example.components.Transmission;
import vn.daoanhthanh.builder.example.components.TripComputer;

public interface Builder {
    // void setCarId(UUID carId);

    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}