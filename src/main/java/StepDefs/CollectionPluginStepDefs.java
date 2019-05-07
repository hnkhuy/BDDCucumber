package StepDefs;

import Page.CollectionPluginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;

public class CollectionPluginStepDefs extends AbstractStepDefs {

    private CollectionPluginPage collectionPluginPage;

    @Override
    protected void initPages() {
        collectionPluginPage = new CollectionPluginPage();
    }

    @And("^I fill Collection plugin with given title and description$")
    public void fillCollectionPluginWithGivenTitleAndDescription(DataTable itemTable) {
        //just for happy case, no validation for list item quantity-andrew.huynh
        collectionPluginPage.fillCollectionItemsWithGivenTitleAndDescription(itemTable);
        collectionPluginPage.fillCollectionPluginTitle();
    }
}
