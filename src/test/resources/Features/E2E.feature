Feature: Finding_hospitals

  @smoke
  Scenario Outline: Applying filter as per the need of cutomser to find hospital
    Given User navigates to practo.com
    When User search for the prefered city as "<City>"
    And User search for the prefered speciality as "<Speciality>"
    Then User can see the options under patient stories
    Then User can select any patient stories
    When User is on experience option
    Then User can select an option as years of experience
    When User is on all filter option
    Then User can select an option zero to five hundred
    And Again user is on all filter option
    Then User can select an option as available today
    When User is on relevance option
    Then User can select an option as experience-high to low
    And User is to select display top doctor details

    Examples: 
      | City      | Speciality   |
      | Bangalore | Cardiologist |

  @regression
  Scenario: Extract surgery option
    When User does click on surgery option
    Then User store and displays the surgery list on the console

  @regression
  Scenario Outline: On the home page under For Corporate open health and wellness plan form
    When User clicks on for corporate option
    Then User clicks on health and wellness plan
    Then User enters Name "<Name>"
    Then User enters Organization "<Organization Name>"
    Then User enters Contact "<Contact Number>"
    Then user enters Email "<Official Email ID>"
    Then User clicks on Organization size
    Then User chooses appropriate size
    Then User clicks on interesed
    Then User chooses appropriate option
    Then User prints the observation on window
    Then User enters Email "<Valid Email>"
    Then User clicks on a taking a demo butto
    Then system prints the Thank you message on window

    Examples: 
      | Name | Organization Name | Contact Number | Official Email ID | Valid Email     |
      | Atul | Cognizant         |     8860832667 | abc@gmail         | valid@gmail.com |
