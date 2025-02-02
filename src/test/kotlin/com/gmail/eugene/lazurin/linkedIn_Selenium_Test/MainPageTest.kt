package com.gmail.eugene.lazurin.linkedIn_Selenium_Test

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.util.concurrent.TimeUnit

class MainPageTest {
    private lateinit var driver: WebDriver
    private lateinit var mainPage: MainPage
    private val url = "https://ru.linkedin.com/"

    @BeforeEach
    fun setUp() {
        System.setProperty(
            "webdriver.chrome.driver",
            "src/main/kotlin/com/gmail/eugene/lazurin/linkedIn_Selenium_Test/driver/chromedriver.exe"
        )
        driver = ChromeDriver()
        driver.manage().window().maximize()
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
        driver.get(url)

        mainPage = MainPage(driver)
    }

    @AfterEach
    fun tearDown() {
        driver.quit()
    }

    @Test
    fun mainPage() {
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("LinkedIn Россия: войти или зарегистрироваться"))
    }

    @Test
    fun enterButton() {
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("LinkedIn Россия: войти или зарегистрироваться"))
        mainPage.navButtonEnter.click()
        WebDriverWait(driver, 5).until(ExpectedConditions.titleContains("Вход в LinkedIn, Войти | LinkedIn"))
    }

    @Test
    fun joinButton() {
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("LinkedIn Россия: войти или зарегистрироваться"))
        mainPage.navButtonJoin.click()
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("Зарегистрироваться | LinkedIn"))
    }

    @Test
    fun googleButton() {
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("LinkedIn Россия: войти или зарегистрироваться"))
        mainPage.googleEnterButton.click()
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("LinkedIn Россия: войти или зарегистрироваться"))
    }

    @Test
    fun makeVacancy() {
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("LinkedIn Россия: войти или зарегистрироваться"))
        mainPage.makeVacancy.click()
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("LinkedIn Talent Solutions"))
    }

    @Test
    fun startBigButton() {
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("LinkedIn Россия: войти или зарегистрироваться"))
        mainPage.startBigButton.click()
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("Зарегистрироваться | LinkedIn"))
    }

    @Test
    fun findGuys() {
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("LinkedIn Россия: войти или зарегистрироваться"))
        mainPage.findGuys.click()
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("Зарегистрироваться | LinkedIn"))
    }

    @Test
    fun engineer() {
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("LinkedIn Россия: войти или зарегистрироваться"))
        mainPage.engineer.click()
        WebDriverWait(driver, 5).until(ExpectedConditions.titleContains("Engineering"))
    }

    @Test
    fun business() {
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("LinkedIn Россия: войти или зарегистрироваться"))
        mainPage.business.click()
        WebDriverWait(driver, 5).until(ExpectedConditions.titleContains("Business Development"))
    }

    @Test
    fun fin() {
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("LinkedIn Россия: войти или зарегистрироваться"))
        mainPage.fin.click()
        WebDriverWait(driver, 5).until(ExpectedConditions.titleContains("Finance"))
    }

    @Test
    fun admin() {
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("LinkedIn Россия: войти или зарегистрироваться"))
        mainPage.admin.click()
        WebDriverWait(driver, 5).until(ExpectedConditions.titleContains("Administrative Assistant"))
    }

    @Test
    fun sell() {
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("LinkedIn Россия: войти или зарегистрироваться"))
        mainPage.sell.click()
        WebDriverWait(driver, 5).until(ExpectedConditions.titleContains("Retail Associate"))
    }

    @Test
    fun help() {
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("LinkedIn Россия: войти или зарегистрироваться"))
        mainPage.help.click()
        WebDriverWait(driver, 5).until(ExpectedConditions.titleContains("Customer Service"))
    }

    @Test
    fun it() {
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("LinkedIn Россия: войти или зарегистрироваться"))
        mainPage.iT.click()
        WebDriverWait(driver, 5).until(ExpectedConditions.titleContains("Information Technology"))
    }

    @Test
    fun marketing() {
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("LinkedIn Россия: войти или зарегистрироваться"))
        mainPage.marketing.click()
        WebDriverWait(driver, 5).until(ExpectedConditions.titleContains("Marketing"))
    }

    @Test
    fun cadr() {
        WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("LinkedIn Россия: войти или зарегистрироваться"))
        mainPage.cadr.click()
        WebDriverWait(driver, 5).until(ExpectedConditions.titleContains("Human Resources"))
    }
}
