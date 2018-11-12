package StepDefs;

import Page.ToDosPage;
import cucumber.api.java.en.Then;

import java.util.List;

public class ToDosStepDefs extends AbstractStepDefs {

    private ToDosPage toDosPage;

    @Override
    protected void initPages() {
        toDosPage = new ToDosPage();
    }

    @Then("^I should see Todos on Todo page: (.*)")
    public void seeTodosOnTodoPageToDos(List<String> todos) throws Throwable {
        toDosPage.seeTodosOnTodoPageToDos(todos);
    }
}
