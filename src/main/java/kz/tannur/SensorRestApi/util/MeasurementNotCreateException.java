package kz.tannur.SensorRestApi.util;

public class MeasurementNotCreateException extends RuntimeException {
    public MeasurementNotCreateException(String msg) {
        super(msg);
    }
}