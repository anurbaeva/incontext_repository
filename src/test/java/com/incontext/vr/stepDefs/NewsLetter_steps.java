package com.incontext.vr.stepDefs;

import com.incontext.vr.domains.NewsLetter;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



import java.util.List;

public class NewsLetter_steps {


    @When("^user enters Newsletter data$")
    public void userEntersNewsletterData(List<NewsLetter> newsLetters) throws Throwable {

//        newsLetters.stream()
//                .forEach(newsLetter ->
//                {
//                    NewsLetterPage.firstName.sendKeys(newsLetter.getFirstName());
//                    NewsLetterPage.lastName.sendKeys(newsLetter.getLastName());
//                    NewsLetterPage.submit.click();
//                }));
//


    }

    @Then("^user should see the Thank you message$")
    public void userShouldSeeTheThankYouMessage() throws Throwable {

    }

}
