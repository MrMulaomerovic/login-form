public class PojoClass {

    private String firstName;
    private String lastName;
    private String streetName;
    private String profesija;
    private int streetNo;

    public PojoClass() {

    }

    public PojoClass(String firstName, String lastName, String streetName, String profesija, int streetNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetName = streetName;
        this.profesija = profesija;
        this.streetNo = streetNo;
    }

    public static String getFirstName() {
        return getFirstName();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static String getLastName() {
        return getLastName();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static String getStreetName() {
        return getStreetName();
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public static String getProfesija() {
        return getProfesija();
    }

    public void setProfesija(String profesija) {
        this.profesija = profesija;
    }

    public static int getStreetNo() {
        return getStreetNo();
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    @Override
    public String toString() {
        return "PojoClass{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", streetName='" + streetName + '\'' +
                ", profesija='" + profesija + '\'' +
                ", streetNo=" + streetNo +
                '}';
    }
}
