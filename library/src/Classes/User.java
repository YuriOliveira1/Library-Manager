package Classes;
public class User {
    private String nameOfUser;
    private String emailOfUser;
    private String numberOfUser;
    
    public User(String nameOfUser, String emailOfUser, String numberOfUser) {
        this.nameOfUser = nameOfUser;
        this.emailOfUser = emailOfUser;
        this.numberOfUser = numberOfUser;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }

    public void setNameOfUser(String nameOfUser) {
        this.nameOfUser = nameOfUser;
    }

    public String getEmailOfUser() {
        return emailOfUser;
    }

    public void setEmailOfUser(String emailOfUser) {
        this.emailOfUser = emailOfUser;
    }

    public String getNumberOfUser() {
        return numberOfUser;
    }

    public void setNumberOfUser(String numberOfUser) {
        this.numberOfUser = numberOfUser;
    }
}
