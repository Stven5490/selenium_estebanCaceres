import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class txtBox {
    private static WebElement passWord;
    By byPassWord = By.xpath("//*[@id=\"new-password\"]");
    public static WebElement textBoxPassWord(){
        return passWord;
    }
}
