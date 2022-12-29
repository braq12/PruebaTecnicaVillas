# PruebaTecnicaVillas
Este repositorio tiene como objetivo dar solución ala prueba técnica enviada por la entidad Banco Av Villas.


#Instrucciones de ejecucion 
Version java : 8

 Metodo 1 Maven : 
 
 Abrimos un CMD desde la raiz del proyecto y ejecutamso el comando "mvn spring-boot:run"
 ![image](https://user-images.githubusercontent.com/36553982/210017873-18873ffe-b99e-4d43-80d8-c8551cdd4a57.png)

 
 Una vez ejecutado el comando la consola nos idicara el puerto donde etsa corriendo el microservicio :
 ![image](https://user-images.githubusercontent.com/36553982/210017960-c5804eee-a4c1-4288-a8a1-60758e7e0e4f.png)
 Metodo 2 Java:
 
 Desde un CMD nos ubicamos en la carpeta raiz del proeycto y ejecutar el compilado jar del microservicio con el comando "java -jar pruebaTecnica-0.0.1-SNAPSHOT.jar"
 ![image](https://user-images.githubusercontent.com/36553982/210018259-6998e063-6e70-4834-ae21-5c43fe76bb17.png)
 
 Una vez este correindo el microservicio en el servidor tomcat embebido, ejecutamos la url http://localhost:8080/harrypotter/Spells/all y obtendremos el lsitado de   hechizos que contiene el micro servicio.
 
 Para ejecutar las demas pruebas se adjunta collecion psotman.
 
 #Casos de Prueba
 1. Ejecucion servicio get http://localhost:8080/harrypotter/Spells?Type=Conjuration&light=Blue:
 ![image](https://user-images.githubusercontent.com/36553982/210019351-9a4e9179-2dd4-4bd9-a443-50fda478e72b.png)

 2. Ejecucion servicio get 
 ![image](https://user-images.githubusercontent.com/36553982/210019388-771dfcab-8a44-4dfc-bfd3-1431d294199e.png)

 5. Ejecucion servicio post
 ![image](https://user-images.githubusercontent.com/36553982/210019452-d486a180-69c1-4bd0-8562-61e0f83502ba.png)

 7. Ejecucion servicio post valdiacion not null
 ![image](https://user-images.githubusercontent.com/36553982/210019422-5cfb8e3c-d5ca-4297-b364-4092587345d7.png)

 9. Ejecucion servicio post validacion campo canBeVerbal
 ![image](https://user-images.githubusercontent.com/36553982/210019472-d6312bfa-3406-4f25-8180-922eabd82494.png)

 11. Ejecucion servicio post valdiacion campo name
 ![image](https://user-images.githubusercontent.com/36553982/210019520-51816a98-2c20-47bd-866f-27ea58449240.png)

 13. Ejecucion servicio psot validacion campo light
 ![image](https://user-images.githubusercontent.com/36553982/210019551-72561856-c331-4d27-99c4-d992e8e7f9dd.png)


 
 
