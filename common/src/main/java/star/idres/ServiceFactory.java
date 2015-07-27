package star.idres;

/**
 * A factory for retrieving references to
 * available services.
 */
public interface ServiceFactory {

    /**
     * Used to retrieve a reference to a specific service.
     * Retrieved service instances are initialized and ready to use.
     * They may reserve some resource therefore they should be
     * closed when no longer needed by calling the {@link Service#close()}
     * method. Service instance may be expensive to create
     * and should ideally be shared.
     *
     * @param service the type of the service to be retrieved
     * @param <S> the generic type of the requested service
     * @return an instance of the requested service.
     */
    <S extends Service> S create(Class<S> service);

}
