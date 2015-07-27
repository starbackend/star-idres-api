package star.idres;

import com.google.common.collect.Range;

import java.util.Date;

/**
 * A type that represent a value that is associated with
 * a certain period of time
 *
 * @param <V> the type of the value that is associated with the given period
 */
public interface TemporalValue<V> {

    /**
     * @return the value that is associated with the given period
     */
    V getValue();

    /**
     * @return the period of time that is referred to
     */
    Range<Date> getPeriod();

}
