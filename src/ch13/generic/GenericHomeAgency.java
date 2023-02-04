package ch13.generic;

public class GenericHomeAgency implements GenericRentable<GenericHome> {
    @Override
    public GenericHome rent() {
        return new GenericHome();
    }
}
