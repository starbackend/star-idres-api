package star.idres.lookup;

/**
 * An interface that defines methods for
 * identifying the originating vessels of AIS
 * messages. Every AIS message contains an MMSI number
 * which can be represented by the {@link Integer} type.
 */
public interface AISLookup extends ReportingSystemLookup<Integer> {
}
