public class Classroom {

    public static void main(String[] args) {
        Wilder jeanClaude = new Wilder("Jean-Claude", true);
        Wilder henri = new Wilder("Henri", false);
        Wilder bernard = new Wilder("Bernard", true);
        Wilder[] wilders = {jeanClaude, henri, bernard};
        for (Wilder wilder : wilders) {
            System.out.println(wilder.whoAmI());
        }
    }
}