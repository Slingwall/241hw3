/**
 * Encapsulates a noble's name, which has four parts
 * - Title
 * - First Name
 * - Last Name
 * - Generation
 */
public class NobleName {
    /**
     * Create a noble name object from the full name string
     */
    public NobleName(String fullName) {
        // totally new operation
    }

    /**
     * Return the full name string
     */
    public String getFullName() {
        return null;
    }

    /**
     * Return the title enum for the name, or Title.Nemo if no title.
     */
    public Title getTitle() {
        return null;
    }

    /**
     * Return the first name
     */
    public String getFirstName() {
        return null;
    }

    /**
     * Return the last name
     */
    public String getLastName() {
        return null;
    }

    /**
     * Return the enum generation, or Generation.Nemo if none
     */
    public Generation getGeneration() {
        return null;
    }

    /**
     * Useful function to convert a noble name into a string
     */
    public String toString() {
        String result = "";
        if (getTitle() != Title.Nemo) {
            result += getTitle() + " ";
        }
        result += getFirstName() + " " + getLastName();
        if (getGeneration() != Generation.Nemo) {
            result += " " + getGeneration();
        }
        return result;
    }

    public static void main(String[] args) {
        NobleName caesar = new NobleName("Caesar Julius Foo III");
        System.out.println(caesar);
    }
}
