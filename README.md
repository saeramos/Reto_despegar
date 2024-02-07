# Reto de automatización https://www.despegar.com.co/ de Sergio Andres Escobar Ramos#

*	El control de versiones se realizó con GITHUB
*   Se realiza el ejercicio utilizando el framework de SERENITY con JBEHAVE
*   Se realiza el ejercicio utilizando el IDE de desarrollo fue Intellij
*   Se utiliza el Patron de desarrollo: POM (Page Objetc
*   Se utiliza BDD
*   Se utiliza Selenium
*   Se utiliza Automatización Modular, Infraestructura de Carpetas, Estándar de Nombres,
*   Se utilizaron Funciones individuales o métodos estáticos



### Conclusiones ###
* Fue una practica retadora, porque implico evaluar diferentes opciones para la identificación de los objetos de la página.



### Estrategia ###
1. Se ingresa a Chrome
2. Se ingresa a la página https://www.despegar.com.co/
3. Se cierra la ventana emergente que presenta la web
4. Click en la opción de Vuelos, encontre la opción usando XPATH
5. Click en el campo Origen, encontré el campo de Origen creando un XPATH manual
6. Click en el campo Destino, encontré el campo de Origen creando un XPATH manual
7. Click en la Fecha de Partida, se espera hasta que el calendario de fecha de partida sea visible,  encontre la fecha usando XPATH
8. Se selecciona en la Fecha de Regreso,  encontre la fecha usando XPATH
9. Se selecciona el número de viajeros,
10. Click en el botón Buscar, encontre el botón usando XPATH
11. Se espera para verificar que la operación se haya ejecutado con éxito.
12. El proyecto contiene varios test Case negativos


### Automatización ###
1. El proyecto  se ejecuta con mvm test
