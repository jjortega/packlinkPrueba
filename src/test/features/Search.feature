@search
Feature: Shipping finder
  As a Packling user I want to search

  Scenario Outline: Successful search
    Given I go to init page
    And I choose this <OriginCountry> Country and <ZipCodeOrLocalityOrigin>,  and this <DestinationCountry> and <ZipCodeOrLocalityDestination>
    And I have this one package with this characteristics <weight>, <lenght>, <width> and <height>
    When I click on search button
    Then I check I am in results page

    Examples: 
      | OriginCountry       | ZipCodeOrLocalityOrigin | DestinationCountry  | ZipCodeOrLocalityDestination | weight | lenght | width | height |
      | España - Peninsular | 47001                   | España - Peninsular | 28001                        | 1      | 50     | 50    | 50     |
      | España - Peninsular | 42001                   | España - Peninsular | 34001                        | 1      | 100    | 40    | 20     |

  Scenario: The user can not type less than 0.5 kg
    Given I go to init page
    And I choose this España - Peninsular Country and 47001,  and this España - Peninsular and 28001
    And I have this one package with this characteristics , 50, 50 and 50
    When I click on search button
    Then I check the important message is El peso mínimo aceptado es 0.5. Indique 0.5 aunque el peso real sea menor. Esto no afecta al precio.
