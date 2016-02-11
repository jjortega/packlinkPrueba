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
