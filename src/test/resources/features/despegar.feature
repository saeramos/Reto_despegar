Feature: Despegar.com
  As a inspacient traveler
  I want to search for cheap flights
  To find the most viable flights

  Scenario Outline: : search for prizes of flights from 'Bogotá, Bogotá D.C., Colombia' to 'Ciudad de México, México D.F., México' between
  'Sab, 25 may 2024' and 'Lun, 17 jun 2024', collecting prizes by cheaper to expensive and printing the prizes in an excel file
    Given Juan is on the Despegar home page
    When Juan search for flights from <from> to <to> between <startDate> and <endDate>
    Then Juan should see as cheaper prize <prize>
    And An excel should be created, with the prices in him
    Examples:
      |from|to|startDate|endDate|prize|
      |"Bogotá, Bogotá D.C., Colombia"|"Ciudad de México, México D.F., México"|"31 jul 2024"|"30 ago 2024"|"1.841.847"|


