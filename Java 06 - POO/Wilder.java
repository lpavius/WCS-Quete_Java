public class Wilder {

    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String whoAmI() {
        return (this.aware) ? "Je m'appelle " + this.firstname + " et je suis aware" :
                "Je m'appelle " + this.firstname + " et je ne suis pas aware";
    }

    public String getFirstname() {
        return firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }
}