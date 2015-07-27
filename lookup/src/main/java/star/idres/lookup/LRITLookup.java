package star.idres.lookup;

/**
 * Defines methods to identify vessels
 * transmitting LRIT messages. The primary identifier
 * of an LRIT message is the IMO number which can be modeled
 * as an {@link Integer}
 */
public interface LRITLookup extends ReportingSystemLookup<Integer> {
}
