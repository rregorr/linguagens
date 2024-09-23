package projeto_csv;

public class User {
    private String name, emailAddress, office;

    public User(String name, String emailAddress, String office) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.office = office;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getOffice() {
        return office;
    }

    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", office='" + office + '\'' +
                '}';
    }
}

