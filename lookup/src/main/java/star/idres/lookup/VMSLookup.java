package star.idres.lookup;

/**
 * Defines methods to identify senders of VMS messages.
 * VMS messages contain radio call sign and optionally
 * an IR number. See the type {@link star.idres.lookup.VMS.VMSID}
 * for details.
 *
 * @see star.idres.lookup.VMS.VMSID
 * @see VMS#callSignId(String)
 * @see VMS#irId(String)
 */
public interface VMSLookup extends  ReportingSystemLookup<VMS.VMSID> {
}
