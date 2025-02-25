package record;

/** Trivial demo of a Record class.
 */
public class PersonRecordDemo {

	/** This is all it takes to define a record -
	 * compiler generates constructor, toString, equals/hashcode, etc.
	 * Hint: after compiling or running this file, do:
	 * javap PersonRecordDemo$Person
	 */
	public record Person(String name, String email) { }

	/**
	 * Now we can use the record type as a regular data class.
	 */
	public static void main(String[] args) {
		Person p = new Person("Covington Roderick Smythe", "roddy@smythe.tld");
		System.out.println(p);
	}
}
