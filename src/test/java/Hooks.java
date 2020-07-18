import cucumber.api.java.After;
import cucumber.api.java.Before;
import functionLibrary.CommonFunctions;

public class Hooks extends CommonFunctions {

    CommonFunctions commonFunctionsObj = new CommonFunctions();

    @Before
    public void beforeTest(){
        commonFunctionsObj.openBrowser();
    }

    @After
    public void afterTest(){
        commonFunctionsObj.closeBrowser();
    }
}
