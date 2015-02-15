/**
 * This class is generated by jOOQ
 */
package sample.model.ticket;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.1"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Ticket extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -1029543785;

	/**
	 * The reference instance of <code>ticket</code>
	 */
	public static final Ticket TICKET = new Ticket();

	/**
	 * No further instances allowed
	 */
	private Ticket() {
		super("ticket");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			sample.model.ticket.tables.Tickets.TICKETS,
			sample.model.ticket.tables.UsedTickets.USED_TICKETS);
	}
}