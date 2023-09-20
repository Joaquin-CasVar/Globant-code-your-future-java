package Service;

// @author Haze
import Entity.Password;

public class PasswordValidatorService {

    public int fortalezaContrasenia(Password p) {
        int n = 0;
        boolean flag = false;

        for (int i = 0; i < p.getPassword().length(); i++) {
            char c = p.getPassword().charAt(i);
            if (!Character.isLetter(c) && !Character.isDigit(c) && !Character.isWhitespace(c)) {
                flag = true;
            }
        }

        if (p.getPassword().length() >= 12) {
            n++;
        }
        if (!p.getPassword().equals(p.getPassword().toLowerCase())) {
            n++;
        }
        if (flag) {
            n++;
        }

        return n;
    }
}
