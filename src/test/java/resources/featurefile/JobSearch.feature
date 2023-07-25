@regression
Feature: Login Test
  As user I want to Search job into Cv Library Uk website

  @smoke
  Scenario Outline: Verify Job Search Result Using Different Data Set
    Given I am on homepage
    When I enter job title "<jTitle>"
    And I enter location "<cityLocation>"
    And I enter distance "<distance>"
    And I click on more search option link
    And I enter salaryMin "<minSalary>"
    And I enter salaryMax "<maxSalary>"
    And I select salary type "<sType>"
    And I select job type "<jobType>"
    And I click on find job button
    Then I should see the result message "<expected>"

    Examples:
      | jTitle           | cityLocation           | distance | minSalary | maxSalary | sType     | jobType        | expected                                     |
      | Tester           | Harrow, Greater London | 5        | 30000     | 500000    | Per annum | Permanent      | Permanent Tester jobs in Harrow              |
      | Developer        | London                 | 10       | 2000      | 4000      | Per month | Contract       | Contract Developer jobs in London            |
      | Business Analyst | Coventry               | 2        | 200       | 400       | Per week  | Part Time      | Part Time Business Analyst jobs in Coventry  |
      | Project Manager  | Manchester             | 1        | 30        | 40        | Per hour  | Permanent      | Permanent Project Manager jobs in Manchester |
      | Sales Executive  | Leeds                  | 25       | 300       | 400       | Per day   | Apprenticeship | Apprenticeship Sales Executive jobs in Leeds |
      | Sales Assistant  | Bradford               | 7        | 300       | 400       | Per annum | Temporary      | Temporary Sales Assistant jobs in Bradford   |
