import java.util.ArrayList;
import java.util.function.Predicate;

public class UserValidator {

    public ArrayList<Predicate<UserForm>> rules = new ArrayList<>();

    public void addRule(Predicate<UserForm> rule) {
        rules.add(rule);
    }

    boolean isValid(UserForm form) {
        for (Predicate<UserForm> p : rules) {
            if (p.test(form) == false) {
                return false;
            }
        }
        return true;
    }

}
