package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RetoTecnicoCreateUserPage {
    public static final Target INPUT_FIRSTNAME = Target.the("where do we write the first name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("where do we write the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email").located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("select a month").located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("select a day").located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("select a year").located(By.id("birthYear"));
    public static final Target ENTER_BUTTON = Target.the("button to continue user creation").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/a/span"));
    public static final Target INPUT_CITY = Target.the("where do we write the city").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("where do we write the zip or postal code").located(By.id("zip"));
    public static final Target DEVICES_BUTTON = Target.the("button to continue user creation").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
    public static final Target LASTSTEP_BUTTON = Target.the("button to continue user creation").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a/span"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password").located(By.id("password"));
    public static final Target INPUT_CONFIRMPASSWORD = Target.the("where do we write the confirmPassword").located(By.id("confirmPassword"));
    public static final Target COMPLETESETUP_BUTTON = Target.the("button to create the user").located(By.xpath("//*[@id=\"laddaBtn\"]/span"));
}
