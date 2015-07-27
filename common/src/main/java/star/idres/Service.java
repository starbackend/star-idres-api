package star.idres;

/**
 * Marker interface for types defining a particular
 * set of service requests.
 */
public interface Service {

    /**
     * Method to be called to release any resources
     * that may be used by the service reference.
     * Service methods should not be used after
     * this method has been called.
     */
    void close();

}
