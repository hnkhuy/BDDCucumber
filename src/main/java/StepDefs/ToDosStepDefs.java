package StepDefs;

import Page.ToDosWebPage;
import cucumber.api.java.en.Then;

import java.util.List;

public class ToDosStepDefs extends AbstractStepDefs {

    private ToDosWebPage toDosPage;

    @Override
    protected void initPages() {
        toDosPage = new ToDosWebPage();
    }

    @Then("^I should see Todos on Todo page: (.*)")
    public void seeTodosOnTodoPageToDos(List<String> todos) throws Throwable {
        toDosPage.seeTodosOnTodoPageToDos(todos);
    }
}
