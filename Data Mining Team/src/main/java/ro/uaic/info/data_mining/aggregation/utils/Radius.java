package ro.uaic.info.data_mining.aggregation.utils;

import ro.uaic.info.data_mining.aggregation.exceptions.InvalidRadiusException;

/**
 * TODO
 */
public class Radius {

    private int amount;
    private DistanceUnit unit;

    public Radius(int amount, DistanceUnit unit) throws InvalidRadiusException {
        if (amount <= 0) {
            throw new InvalidRadiusException(InvalidRadiusException.AMOUNT_NOT_VALID);
        }
        this.amount = amount;
        this.unit = unit;
    }
}
