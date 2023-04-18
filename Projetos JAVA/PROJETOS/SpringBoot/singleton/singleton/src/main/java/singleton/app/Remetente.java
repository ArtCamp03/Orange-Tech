package singleton.app;

public class Remetente {
    private String mnome;
    private String email;

    public String getMnome() {
        return mnome;
    }

    public void setMnome(String mnome) {
        this.mnome = mnome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Beans{" +
                "mnome='" + mnome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
