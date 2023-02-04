package ch13.generic;

public class GenericCarAgency implements GenericRentable<GenericCar> {
    @Override
    public GenericCar rent() {
        return new GenericCar();
    }
}
