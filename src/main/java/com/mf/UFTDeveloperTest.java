package com.mf;

import com.hp.lft.report.ReportException;
import com.hp.lft.report.Reporter;
import com.hp.lft.report.Status;
import jdk.vm.ci.code.site.Mark;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;
import com.hp.lft.sdk.web.*;

import unittesting.*;

public class UFTDeveloperTest extends UnitTestClassBase {
Browser browser;
    public UFTDeveloperTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new UFTDeveloperTest();
        globalSetup(UFTDeveloperTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
        browser=BrowserFactory.launch(BrowserType.CHROME);
        browser.clearCache();
        browser.deleteCookies();
    }

    @After
    public void tearDown() throws Exception {
        browser.closeAllTabs();
    }

    @Test
    public void test() throws GeneralLeanFtException {
        int counter;
        browser.navigate("http://nimbusserver.aos.com:8088");
        browser.sync();
        Link SignOutLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText(new RegExpProperty("Sign Out.*")).build());
        WebElement MenuUserIconWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .id("menuUserIcon").build());
        Image ExecutiveOverviewImage = browser.describe(Image.class, new ImageDescription.Builder()
                .href("http://nimbusserver.aos.com:8088/PP.100.html")
                .index(1).build());
        ExecutiveOverviewImage.click();
        browser.sync();
        Area RonSteelImage = browser.describe(Area.class, new AreaDescription.Builder()
                .href(new RegExpProperty(".*rsteel.*")).build());
        RonSteelImage.click();
        browser.sync();
        WebElement SizeOfBubbleIndicatesProjectedCostWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .tagName("DIV")
                .innerText("(Size of bubble indicates: Projected Cost)").build());
        counter = 0;
        do {
            counter++;
            if (counter >= 5) {
                try {
                    Reporter.reportEvent("The Bubble Chart", "The Bubble Chart failed to display within " + counter + " attempts, aborting run", Status.Failed);
                } catch (ReportException e) {
                    e.printStackTrace();
                }
                MenuUserIconWebElement.click();
                SignOutLink.click();
                browser.sync();
                return;
            }
        }
        while (!SizeOfBubbleIndicatesProjectedCostWebElement.exists());
        WebElement RegulatoryComplianceWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("d3Chart-legend-label")
                .innerText("Regulatory Compliance")
                .index(0).build());
        RegulatoryComplianceWebElement.hoverTap();
        WebElement NineMonthReleaseCycleWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("d3Chart-legend-label")
                .innerText("9 Month Release Cycle")
                .index(0).build());
        NineMonthReleaseCycleWebElement.hoverTap();
        WebElement ReduceCustomerChurnWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("d3Chart-legend-label")
                .innerText("Reduce Customer Churn")
                .index(0).build());
        ReduceCustomerChurnWebElement.hoverTap();
        WebElement TenPercentIncreaseinRevenueWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("d3Chart-legend-label")
                .innerText("10% Increase in Revenue")
                .index(0).build());
        TenPercentIncreaseinRevenueWebElement.hoverTap();
        WebElement FifteenPercentGrowthinPartnerChannelsWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("d3Chart-legend-label")
                .innerText("15% Growth in Partner Channels")
                .index(0).build());
        FifteenPercentGrowthinPartnerChannelsWebElement.hoverTap();
        WebElement CostContainmentWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("d3Chart-legend-label")
                .innerText("Cost Containment")
                .index(0).build());
        CostContainmentWebElement.hoverTap();
        Image BudgetbyBusinessObjectivePortletMenuImage = browser.describe(Image.class, new ImageDescription.Builder()
                .tagName("IMG")
                .alt("")
                .type(com.hp.lft.sdk.web.ImageType.NORMAL)
                .index(5).build());
        BudgetbyBusinessObjectivePortletMenuImage.click();
        browser.sync();
        WebElement MaximizeWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .tagName("SPAN")
                .className("")
                .innerText("Maximize")
                .accessibilityName("")
                .index(1).build());
        MaximizeWebElement.click();
        browser.sync();
        WebElement MaximizedViewWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .tagName("TD")
                .className("portlet-maxview-header max-view-instruction-spacing")
                .innerText("Maximized View ").build());
        counter = 0;
        do {
            counter++;
            if (counter >= 5) {
                try {
                    Reporter.reportEvent("Maximized View", "The Maximized View text failed to display within " + counter + " attempts, aborting run", Status.Failed);
                } catch (ReportException e) {
                    e.printStackTrace();
                }
                MenuUserIconWebElement.click();
                SignOutLink.click();
                browser.sync();
                return;
            }
        }
        while (!MaximizedViewWebElement.exists());
        WebElement regulatoryComplianceWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .tagName("SPAN")
                .className("d3Chart-legend-label")
                .innerText("Regulatory Compliance").build());
        regulatoryComplianceWebElement.hoverTap();
        WebElement reduceCustomerChurnWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .tagName("SPAN")
                .className("d3Chart-legend-label")
                .innerText("Reduce Customer Churn").build());
        reduceCustomerChurnWebElement.hoverTap();
        WebElement costContainmentWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .tagName("SPAN")
                .className("d3Chart-legend-label")
                .innerText("Cost Containment").build());
        costContainmentWebElement.hoverTap();
        WebElement nineMonthReleaseCycleWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .tagName("SPAN")
                .className("d3Chart-legend-label")
                .innerText("9 Month Release Cycle").build());
        nineMonthReleaseCycleWebElement.hoverTap();
        WebElement fifteenPercentGrowthinPartnerChannelsWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .tagName("SPAN")
                .className("d3Chart-legend-label")
                .innerText("15% Growth in Partner Channels").build());
        fifteenPercentGrowthinPartnerChannelsWebElement.hoverTap();
        WebElement tenPercentIncreaseinRevenueWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .tagName("SPAN")
                .className("d3Chart-legend-label")
                .innerText("10% Increase in Revenue").build());
        tenPercentIncreaseinRevenueWebElement.hoverTap();
        Link DashboardLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("DASHBOARD").build());
        DashboardLink.click();
        browser.sync();
        Link PrivateLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("Private").build());
        counter = 0;
        do {
            counter++;
            if (counter >= 2) {
                try {
                    Reporter.reportEvent("Menu Navigation", "The Private menu text failed to display within " + counter + " attempts, aborting run", Status.Failed);
                } catch (ReportException e) {
                    e.printStackTrace();
                }
                MenuUserIconWebElement.click();
                SignOutLink.click();
                browser.sync();
                return;
            }
        }
        while (!PrivateLink.exists());
        Link ITFMLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("ITFM").build());
        counter = 0;
        do {
            counter++;
            PrivateLink.hoverTap();
            browser.sync();
            if (counter >= 2) {
                try {
                    Reporter.reportEvent("Menu Navigation", "The Private | ITFM menu text failed to display within " + counter + " attempts, aborting run", Status.Failed);
                } catch (ReportException e) {
                    e.printStackTrace();
                }
                MenuUserIconWebElement.click();
                SignOutLink.click();
                browser.sync();
                return;
            }
        }
        while (!ITFMLink.exists());
        ITFMLink.hoverTap();
        browser.sync();
        Link PortfolioITFMLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("Portfolio (ITFM)").build());
        PortfolioITFMLink.hoverTap();
        PortfolioITFMLink.click();
        browser.sync();
        WebElement TrialPortfolioWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("d3Chart-legend-label")
                .innerText("Trial Portfolio").build());
        TrialPortfolioWebElement.click();
        browser.sync();
        Link MarketingWebPortalV2Link = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("Marketing WebPortal V2").build());
        MarketingWebPortalV2Link.click();
        browser.sync();
        WebElement DownTrianglewebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .tagName("SPAN")
                .className("lower-triangle").build());
        DownTrianglewebElement.click();
        browser.sync();
        Button DoneButton = browser.describe(Frame.class, new FrameDescription.Builder()
                .name("overrideProjectHealthDialogIF").build())
                .describe(Button.class, new ButtonDescription.Builder()
                        .name(new RegExpProperty(".*Done.*"))
                        .buttonType("button").build());
        DoneButton.click();
        browser.sync();
        MenuUserIconWebElement.click();
        SignOutLink.click();
        browser.sync();

    }

}