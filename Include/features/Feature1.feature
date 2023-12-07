Feature: Quiero loguearme y mandar un formulario

  Scenario: Inicio Satisfactorio
    Given Abro el navegador y me dirijo al test
    When me logueo
    And relleno el formulario
    And confirmo el formulario
    Then cierro el navegador
