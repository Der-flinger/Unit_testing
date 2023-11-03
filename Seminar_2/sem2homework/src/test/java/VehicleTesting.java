// import org.junit.jupiter.api.*;

import hw.Car;
import hw.Motorcycle;
import hw.Vehicle;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
// import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class VehicleTesting {

    /**
     * Проверить, что экземпляр объекта Car также является экземпляром
     * транспортного средства (используя оператор instanceof).
     */
    @Test
    public void carIsVehicle() {
        Car car = new Car("Vaz", "Moskvich3", 2023);
        assertInstanceOf(Vehicle.class, car);
    }

    /**
     * Проверить, что объект Car создается с 4-мя колесами.
     */
    @Test
    public void carHaveFourWheels() {
        Car car = new Car("Renault", "Megan II", 2006);
        assertEquals(4, car.getNumWheels());
    }

    /**
     * Проверить, что объект Motorcycle создается с 2-мя колесами.
     */
    @Test
    public void motorcycleHaveFourWheels() {
        Motorcycle moto = new Motorcycle("Izh", "Jupiter 5", 1985);
        assertEquals(2, moto.getNumWheels());
    }

    /**
     * Проверить, что объект Car развивает скорость 60 в режиме тестового вождения
     * (используя метод testDrive()).
     */
    @Test
    public void carHaveNormalSpeedTest() {
        Car car = new Car("Renault", "Megan II", 2006);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    /**
     * Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового
     * вождения (используя метод testDrive()).
     */
    @Test
    public void motorcycleHaveNormalSpeedTest() {
        Motorcycle moto = new Motorcycle("Izh", "Jupiter 5", 1985);
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }

    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е.
     * эмуляция движения транспорта) машина останавливается (speed = 0).
     */
    @Test
    public void carSpeedZeroInParkingModTesting() {
        Car car = new Car("Renault", "Megan II", 2006);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е.
     * эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
     */
    @Test
    public void motorcycleSpeedZeroInParkingModTesting() {
        Motorcycle moto = new Motorcycle("Izh", "Jupiter 5", 1985);
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }
}
