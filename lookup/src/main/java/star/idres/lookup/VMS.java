package star.idres.lookup;

import java.io.Serializable;
import java.util.Objects;

/**
 * Utilities to deal with VMS data.
 * VMS does not have a single unique identifier.
 * European vessels have an IR number. If that
 * is present in the message, it will be used as
 * the primary identifier. If it is missing
 * the radio call sign is used.
 */
public class VMS {

    /**
     * Type representing an identifier transmitted
     * in a VMS message. Could contain either
     * an IR number or a radio call sign.
     */
    public interface VMSID extends Serializable {
    }

    static class IRVMSID implements VMSID {
        final String ir;

        IRVMSID(String ir) {
            Objects.nonNull(ir);
            this.ir = ir;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IRVMSID irvmsid = (IRVMSID) o;

            return ir.equals(irvmsid.ir);

        }

        @Override
        public int hashCode() {
            return ir.hashCode();
        }
    }

    static class CallSignVMSID implements VMSID {
        final String callSign;

        CallSignVMSID(String callSign) {
            Objects.nonNull(callSign);
            this.callSign = callSign;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CallSignVMSID that = (CallSignVMSID) o;

            return callSign.equals(that.callSign);

        }

        @Override
        public int hashCode() {
            return callSign.hashCode();
        }
    }

    /**
     * Factory method for creating an identifier that refers
     * to a vessel that is transmitting the IR number
     * in VMS messages.
     *
     * @param ir the IR number transmitted by the vessel
     * @return the object used to refer to the vessel in API calls
     */
    public static VMSID irId(String ir) {
        return new IRVMSID(ir);
    }

    /**
     * Factory method for creating an identifier that refers
     * to a vessel that is not transmitting the IR number
     * in VMS messages and is referred to by its
     * radio call sign instead.
     *
     * @param callSign the radio call sign transmitted by the vessel
     * @return the object used to refer to the vessel in API calls
     */
    public static VMSID callSignId(String callSign) {
        return new CallSignVMSID(callSign);
    }

}
