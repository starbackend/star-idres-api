package star.idres.lookup;

import com.google.common.collect.Range;
import star.idres.TemporalValue;
import star.idres.VesselID;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

/**
 * A generic interface that defines the common methods
 * used to retrieve the mapping between the transmitted
 * identifiers and the surrogate identifiers.
 *
 * @param <T> the type that is used to represent the
 *           identifier that is transmitted in the
 *           messages of the reporting system
 */
public interface ReportingSystemLookup<T> {

    /**
     * Returns the {@link VesselID} for the vessel
     * that is known to have been transmitting the specified
     * identifier at a certain point in time.
     *
     * @param transmittedId the identifier transmitted from the vessel
     * @param timestamp the time when the message was transmitted
     * @return the reference to the vessel that the transmission is
     *  supposed to come from or an empty value if the vessel is not known
     *
     */
    Optional<VesselID> getVesselID(T transmittedId, Date timestamp);

    /**
     * Returns a collection of identifiers that were transmitted by the specific
     * vessel during the requested period. Note that in most cases
     * the result will contain a single value. The possibility to return
     * multiple values is only necessary to cover the case when
     * the vessel has changed its transmitted identifier during the
     * requested period. The result also contains the time period
     * during which the given identifier was transmitted.
     *
     * @param vesselId the vessel whose transmitted identifiers are requested
     * @param period the time period during which the vessel was transmitting
     *                 the returned identifiers
     * @return a collection of identifiers associated with the time period
     *  during which the vessel was transmitting them
     */
    Collection<TemporalValue<T>> getTransmittedIDs(VesselID vesselId, Range<Date> period);
}
