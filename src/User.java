import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class User {
    String nom;
    String prenom;
    String email;
    LocalDate dateNaissance;

    User() {

    }

    boolean isValid() {
        if(this.nom == null || this.prenom == null) return false;
        if(this.nom.equals("") || this.prenom.equals("")) return false;
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

        if(!this.email.matches(regex)) return false;
        return (int) ChronoUnit.YEARS.between(dateNaissance, LocalDate.now()) > 13;
    }
}
