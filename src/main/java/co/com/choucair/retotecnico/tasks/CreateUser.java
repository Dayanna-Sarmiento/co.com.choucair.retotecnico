package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.userinterface.RetoTecnicoCreateUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CreateUser implements Task {
    private String firstName;
    private String lastName;
    private String email;
    private String birthMonth;
    private String birthDay;
    private String birthYear;
    private String city;
    private String zip;
    private String password;
    private String confirmPassword;

    public CreateUser(String firstName, String lastName, String email, String birthMonth, String birthDay, String birthYear, String city, String zip, String password, String confirmPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.city = city;
        this.zip = zip;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static CreateUser onThePage(String firstName, String lastName, String email, String birthMonth, String birthDay, String birthYear) {
        return Tasks.instrumented(CreateUser.class,firstName,lastName,email,birthMonth,birthDay,birthYear);
    }

    public static CreateUser addAddress(String city, String zip){
        return Tasks.instrumented(CreateUser.class,city,zip);
    }

    public static CreateUser validatePass(String password,String confirmPassword){
        return Tasks.instrumented(CreateUser.class,password,confirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(firstName).into(RetoTecnicoCreateUserPage.INPUT_FIRSTNAME),
                Enter.theValue(lastName).into(RetoTecnicoCreateUserPage.INPUT_LASTNAME),
                Enter.theValue(email).into(RetoTecnicoCreateUserPage.INPUT_EMAIL),
                Click.on(RetoTecnicoCreateUserPage.SELECT_MONTH),
                Click.on(RetoTecnicoCreateUserPage.SELECT_DAY),
                Click.on(RetoTecnicoCreateUserPage.SELECT_YEAR),
                Click.on(RetoTecnicoCreateUserPage.ENTER_BUTTON),
                Enter.theValue(city).into(RetoTecnicoCreateUserPage.INPUT_CITY),
                Enter.theValue(zip).into(RetoTecnicoCreateUserPage.INPUT_ZIP),
                Click.on(RetoTecnicoCreateUserPage.DEVICES_BUTTON),
                Click.on(RetoTecnicoCreateUserPage.LASTSTEP_BUTTON),
                Enter.theValue(password).into(RetoTecnicoCreateUserPage.INPUT_PASSWORD),
                Enter.theValue(confirmPassword).into(RetoTecnicoCreateUserPage.INPUT_CONFIRMPASSWORD),
                Click.on(RetoTecnicoCreateUserPage.COMPLETESETUP_BUTTON));
    }
}
