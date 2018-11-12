package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ToDosPage extends AbstractPage {

    private String todoByNameXpath = "//div[contains(@class,'cell-name')][text()='%s']";

    @Override
    protected void initPageFactory() {
        PageFactory.initElements(webDriver, this);
    }

    public void seeTodosOnTodoPageToDos(List<String> todos) {
        for (String todo : todos) {
            WebElement thisToDo = actions.getElementByXpath(todoByNameXpath, todo);
            Assert.assertTrue(actions.verifyElementExist(thisToDo, "ToDo named " + todo), "Expected exist ToDo named: " + todo);
        }
    }
}
