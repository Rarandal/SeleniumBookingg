package com.solera.seleniumbooking;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    MainPage mainPage = new MainPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        open("http://localhost:3000");
    }

    @Test
    public void JavaButtonTest() {

        $("button[data-test='post-option1-button']").click();
    }
    @Test
    public void CsButtonTest() {

        $("button[data-test='post-option2-button']").click();
    }
    @Test
    public void JavaScriptButtonTest() {

        $("button[data-test='post-option3-button']").click();
    }
    @Test
    public void IntroduceANewPostTitle() {
        //mainPage.searchButton.click();

        $("button[data-test='post-option1-button']").click();
        $("[data-test='title-input-text']").sendKeys("laCasaDePaco");
        $("button[data-test='next-post-button']").click();

       // $("input[data-test='search-input']").shouldHave(attribute("value", "Selenium"));
    }
    @Test
    public void ChangeOptionSelection() {
        //mainPage.searchButton.click();

        $("button[data-test='post-option1-button']").click();
        $("[data-test='title-input-text']").sendKeys("laCasaDePaco");
        $("button[data-test='next-post-button']").click();
        $("select[data-test='select-post']").click();
        $("option[data-test='option2-post']").click();
        $("[data-test='textarea-message']").sendKeys("Jose luis es un rissas");
        $("button[data-test='post-button']").click();	

       // $("input[data-test='search-input']").shouldHave(attribute("value", "Selenium"));
    }
    @Test
    public void TryPosting() {
        //mainPage.searchButton.click();

        $("button[data-test='post-option1-button']").click();
        $("[data-test='title-input-text']").sendKeys("laCasaDePaco");
        $("button[data-test='next-post-button']").click();
        $("select[data-test='select-post']").click();
        $("option[data-test='option2-post']").click();
        $("[data-test='textarea-message']").sendKeys("Jose luis es un rissas");
        $("button[data-test='post-button']").click();	
        $("input[data-test='rb-check1']").click();
        $("button[data-test='button-submit']").click();
        

       
    }

}
