package fw;
import core.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {

    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void openRegistrationForm() {
        click(By.cssSelector(".ico-register"));
    }

    public void openLoginForm() {
        click(By.cssSelector(".ico-login"));
    }

    public void login(String email, String password) {
        openLoginForm();
        type(By.id("Email"), email);
        type(By.id("Password"), password);
        click(By.cssSelector("input[value='Log in']"));
    }

    public void logout() {
        click(By.cssSelector(".ico-logout"));
    }

    public void fillRegistrationForm(
            String firstName,
            String lastName,
            String email,
            String password) {

        type(By.id("FirstName"), firstName);
        type(By.id("LastName"), lastName);
        type(By.id("Email"), email);
        type(By.id("Password"), password);
        type(By.id("ConfirmPassword"), password);
    }

    public void clickRegisterButton() {
        click(By.id("register-button"));
    }
}
