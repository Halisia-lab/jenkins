import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class UserTest {




    @Test
   public void testIsValidFunctionwithemptyname() {
        User user = new User();
        user.nom = "";
        user.prenom = "toto";
        user.email = "toto@gmail.com";
        user.dateNaissance = LocalDate.of(1990,1,1);

        Assert.assertEquals(false, user.isValid());
    }

    @Test
    public void testIsValidFunctionwithemptyfirstname() {
        User user = new User();
        user.nom = "toto";
        user.prenom = "";
        user.email = "toto@gmail.com";
        user.dateNaissance = LocalDate.of(1990,01,01);

        Assert.assertEquals(false, user.isValid());
    }

    @Test
    public void testIsValidFunctionwithWrongEmail() {
        User user = new User();
        user.nom = "toto";
        user.prenom = "toto";
        user.email = "totogmail.com";
        user.dateNaissance = LocalDate.of(1990,1,1);

        Assert.assertEquals(false, user.isValid());
    }

    @Test
    public void testIsValidFunctionwithWrongAge() {
        User user = new User();
        user.nom = "toto";
        user.prenom = "toto";
        user.email = "totogmail.com";
        user.dateNaissance = LocalDate.of(2010,1,1);

        Assert.assertEquals(false, user.isValid());
    }

    @Test
    public void testIsValidFunctionwithAllGood() {
        User user = new User();
        user.nom = "toto";
        user.prenom = "toto";
        user.email = "toto@gmail.com";
        user.dateNaissance = LocalDate.of(1990,1,1);
        Assert.assertEquals(true, user.isValid());
    }




}
