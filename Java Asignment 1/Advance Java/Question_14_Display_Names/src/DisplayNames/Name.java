package DisplayNames;

public class Name {
    String firstName,surName;

    public Name(String fName, String sName) {
        super();
        this.firstName = fName;
        this.surName = sName;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String fName) {
        this.firstName = fName;
    }

    public String getSname() {
        return surName;
    }

    public void setSname(String sName) {
        this.surName = sName;
    }


}
