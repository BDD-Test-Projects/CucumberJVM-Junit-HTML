Feature: Sample Cucumber JVM Feature to Test HTML Reporting

  @Test
  Scenario: Test HTML Report Generation
    Given I make a maven project with all dependencies
    When I compile this project in CLI
    Then I should be able to get detailed HTML Report as per this developer