package task_1;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Server {
    private List<Client> clients;

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);


    boolean validate(Client client) {
        if (client.getName() == null || client.getSurname() == null || client.getEmail() == null || client.getSalary() <= 0) {
            return false;
        }
        if (!Character.isUpperCase(client.getName().charAt(0))) return false;
        if (!Character.isUpperCase(client.getSurname().charAt(0))) return false;
            Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(client.getEmail());
            //todo;
            matcher.find();


        return true;
    }

    void save(Client client) {
 if (validate(client))
    }
}
