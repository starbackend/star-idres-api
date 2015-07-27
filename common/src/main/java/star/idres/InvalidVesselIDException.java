package star.idres;

/**
 * Thrown when a invalid {@link VesselID} has been used
 * in an API call.
 */
public class InvalidVesselIDException extends RuntimeException {

    public InvalidVesselIDException() {
    }

    public InvalidVesselIDException(String message) {
        super(message);
    }

    public InvalidVesselIDException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidVesselIDException(Throwable cause) {
        super(cause);
    }

    public InvalidVesselIDException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
