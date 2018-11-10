package StepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

import java.util.List;

public class ToDosStepDefs {

    @Then("^I should see Todos on Todo page: \"([^\"]*)\"$/")
    public void iShouldSeeTodosOnTodoPageToDos(List<String> testData) throws Throwable {
        testData.stream().forEach(System.out::print);
    }
}
