package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.NavigationMenu.Hidden;
import pageObjects.NavigationMenu.Icons;
import pageObjects.Pages.*;
import pageObjects.Pages.Contact;
import pageObjects.Pages.About.About;
import pageObjects.Pages.MainPage.Collections;
import pageObjects.Pages.MainPage.InternetArchiveFloater;
import pageObjects.Pages.MainPage.TopCollections;
import setup.Helper;
import setup.PageURLs;
import setup.BaseClass;
import setup.Handles;
import tests.BaseTest;

public class Test1 extends BaseTest {

	WebDriver driver;
	public static final String searchTerm = "ITEMS";

//	@Test(dataProviderClass = Helper.class, dataProvider = "LoginData")
//	public void moderatorUser(String username, String password) {
//	}

	@Test
	public void testMainTopCollectionNumOfElements() {

//		Na main strani proveriti da li ima 
//		minimalno 20 elemenata u Top Collections at the Archive
//		Proveriti da li svaki od tih kolekcijskih blokova sadrzi string "ITEMS"

		driver.navigate().to(PageURLs.HOME_PAGE);

		BaseClass      baseClass      = new BaseClass();
		TopCollections topCollections = new TopCollections();

		baseClass.waitPageLoaded();

		Assert.assertTrue(topCollections.getTopCollectionsElementsSize() >= 20);

		topCollections.getTopCollectionsAllElementsText(searchTerm);

		// probaj i alternativni nacin
	}

	@Test
	public void testNumOfItemsMatch() {

//		Na main strani iz prvog elementa u Top Collections extract-ovati broj item-a,
//		zatim kliknuti na taj element u u novootvorenoj stranici 
//		proveriti da li se ta brojka nalazi prikazana u levom meniju.

//		Dodatak - posto je sajt real time i stalno se azurira, 
//		moze da se desi da se brojke ne poklapaju.
//		U tom slucaju samo proveriti da li je razlika tih brojki manja od 100, 
//		ako jeste test prolazi

		BaseClass      baseClass      = new BaseClass();
		TopCollections topCollections = new TopCollections();
		Collections    collections    = new Collections();

		topCollections.getTopCollectionsNumItems(0);

		topCollections.clickTopCollectionsElement(0);

		baseClass.waitPageLoaded();

		collections.getCollectionsResultsText();

		Assert.assertEquals(topCollections.getTopCollectionsNumItems(0), collections.getCollectionsResultsText());

	}

	@Test
	public void testURLsMatch() {

//		Na main strani kliknuti na text u prvom navigacionom meniju, zatim na All texts link.
//		Uzeti URL sa te strane, vratiti se na Main menu 
//		i kliknuti na narandzastu svesku sa 21 M ispor.
//		potvrditi da je URL na novootvorenoj strani isti kao URL prethodne.

		driver.navigate().to(PageURLs.HOME_PAGE);

		BaseClass              baseClass = new BaseClass();
		Icons                  icons     = new Icons();
		Hidden                 hidden    = new Hidden();
		Handles                handles   = new Handles();
		InternetArchiveFloater iaf       = new InternetArchiveFloater();

		baseClass.waitPageLoaded();

		icons.clickOnIcon(1);

		// waiter

		hidden.clickFeaturedListNavH(0);

		// waiter

		String url = driver.getCurrentUrl();

//		String url = handles.getChildWindowUrl();

		driver.navigate().back();

		iaf.clickIconLinks(1);

		// waiter

		Assert.assertTrue(handles.getChildWindowUrl().equals(url));

	}

	@Test
	public void test4() {

//		Na main stranici u search koji se nalazi ispod sarenih ikonica
//		kliknuti i proveriti da li se javlja padajuci meni.
//		Zatim uneti string "qa", kliknuti na GO button 
//		i proveriti da li na novootvorenoj strani u URL-u postoji string ?query=qa

		String searchTerm = "qa";

		driver.navigate().to(PageURLs.HOME_PAGE);

		BaseClass              baseClass = new BaseClass();
		InternetArchiveFloater iaf       = new InternetArchiveFloater();

		iaf.clickSearchBarIAF();

		// is dropdown displayed check

		iaf.searchBarIAFInput(searchTerm);
		iaf.clickGoButton();

		// waiter
		baseClass.waitPageLoaded();

		Assert.assertTrue(driver.getCurrentUrl().toString().contains(searchTerm));

	}

	@Test
	public void test5() {
//		Kliknuti na Upload i 
//		proveriti da li u novoovorenoj stranici postoji tekst "Log in or Sign up".
//		(Moguce odraditi na vise nacina, najslozeniji bi bio 
//		koriscenjem metode getPageSource i regex patterna) 

		driver.navigate().to(PageURLs.HOME_PAGE);

		Icons icons = new Icons();

		icons.clickOnUpload();

	}

	@Test
	public void test6() throws Exception {

//		Kliknuti na Sign In u navigacionom meniju. 
//		Proveriti da li se na novootvorenoj stranici nalazi Log In button.
//		U email field uneti: foo@gmail.com, a u password field uneti "bar".
//		Kliknuti na Log In button 
//		i proveriti da li se javlaj error message: Email address and/or Password incorrect.

		String email    = "foo@gmail.com";
		String password = "bar";

		driver.navigate().to(PageURLs.HOME_PAGE);

		BaseClass baseClass = new BaseClass();
		Icons     icons     = new Icons();
		LogIn     logIn     = new LogIn();
		
		icons.clickOnSignIn();
		
		// waiter
		baseClass.waitPageLoaded();
		
		// check if there is a login button
		logIn.loginSubmittButtonIsDisplayed();

		logIn.loginEmailInput   (email);
		logIn.loginPasswordInput(password);
		logIn.clickLoginSubmitButton();
		
		// waiter
		baseClass.waiter();
		// check error message
		Assert.assertTrue(logIn.loginErrorMessageIsDisplayed());
	}

	@Test
	public void test7() throws Exception {

//		kliknuti na Sign In u navigacionom meniju. 
//		Proveriti da li se na novootvorenoj stranici nalazi Forget Password? link.
//		Kliknuti na link Sign up for free link. Kliknuti na Terms of service link.
//		U novootvorenom prozoru proverite da li se u URL-u nalazi String "terms".

		driver.navigate().to(PageURLs.HOME_PAGE);

		BaseClass  baseClass = new BaseClass();
		Icons      icons     = new Icons();
		LogIn      logIn     = new LogIn();
		SignUpPage signUp    = new SignUpPage();
		
		String searchTerm = "terms";
		
		icons.clickOnSignIn();
		
		// waiter
		baseClass.waiter();
		
		// check if ForgetPassword link is Displayed
		logIn.loginForgotPasswordIsDisplayed();
		
		logIn.clickLoginSignUpFreeLink();
		
		baseClass.waiter();
		
		signUp.clickSignUpTermButton();
		
		//waiter
		baseClass.waiter();
		
		Assert.assertTrue(driver.getCurrentUrl().contains(searchTerm));
		
	}

	@Test
	public void test8() {

//		Otici na stranicu PEOPLE, zatim pokupiti Imena, prezimena i titule za sve ljude.
//		Procitati iz Excel fajla vec extractovane stringove i uporediti ih sa onima u listi. 
//		Koristiti assertFalse.
//		Na kraju, excel dopuniti sa preostalim elementima liste.
//		Upisivanje nastaviti u prvoj koloni, 
//		ali tako da se na kraju nijedan string ne ponavlja.

	}

}
