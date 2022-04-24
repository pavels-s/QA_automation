package lecture11.finalTask;

import lecture11.finalTask.pages.HomePagePom;
import lecture11.finalTask.pages.VacuumCleanerPagePom;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Test1a {

    HomePagePom homePagePom = new HomePagePom();
    VacuumCleanerPagePom vacuumCleanerPagePom = new VacuumCleanerPagePom();

    @Test
    public void selenide1aTest() {
        open("https://www.1a.lv/");
        getWebDriver().manage().window().maximize();
        homePagePom.validatePageUrl();
        homePagePom.searchByProduct();
        homePagePom.chooseCategory();
        vacuumCleanerPagePom.sortByPopularity();

        sleep(1000);
    }
}
