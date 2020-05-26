package missonToMars;

public class Coordinator {
    private String co_name;
    private String co_contact;

    public Coordinator(String co_name, String co_contact) {
        this.co_name = co_name;
        this.co_contact = co_contact;
    }

    public String getCo_name() {
        return co_name;
    }

    public String getCo_contact() {
        return co_contact;
    }

    public void setCo_name(String co_name) {
        this.co_name = co_name;
    }

    public void setCo_contact(String co_contact) {
        this.co_contact = co_contact;
    }
}
