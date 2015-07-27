package star.idres;

/**
 * The surrogate type that is used to refer to a particular
 * physical vessel. Instances of this type cannot be created
 * by the client code. They will always be returned by
 * API methods. Can be used to check for equality against
 * other instances possible returned by different API calls.
 * Can also be used to in later API calls to refer to a
 * particular vessel.
 * <p>
 * Instances of this type may be invalidated after certain events,
 * for example after a conflict resolution in the service.
 * An {@link InvalidVesselIDException} is thrown if an
 * invalid {@link VesselID} instance is used in an API call.
 * </p>
 */
public interface VesselID {

    /**
     * VesselID object is guaranteed to implement
     * {@link Object#toString()} in a consistent manner
     * so that any instances referring to the same
     * vessel will return the same value. Can be used
     * for example for database lookups.
     *
     * @return the string representation of the identifier
     */
    @Override
    String toString();

    /**
     * Implemented consistently so that it can be used in a
     * {@link java.util.HashMap}, for example.
     *
     * @return hash value consistent with equality
     */
    @Override
    int hashCode();

    /**
     * Implemented so that identifiers retrieved from
     * different requests can be checked for equality.
     *
     * @param other the other identifier that might be
     *              retrieved from a response to
     *              an earlier API method call
     * @return result of test for equality
     */
    @Override
    boolean equals(Object other);

}
