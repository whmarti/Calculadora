# Calculadora
Despliegue en Modelo de servicio Rest Programa de Calculadora:

-Lenguaje de Creación:  Java
-Webserver donde se desplego: Tomcat 8

Requerimientos:

Tener instalado Tomcat 8 antes de seguir los pasos, si no se tiene instalado ejecutar el siguiente comando:

sudo docker run -it --rm -p 8888:8080 tomcat:8

*Pasos Instalación - Dos Formas : 
Forma
a. Con Dockerfile:

1-Ejecutar los siguientes comandos:

sudo docker build -f Dockerfile -t restful .

Y luego:

sudo docker run -it --rm -p 8888:8080 restful



Forma
b. Con la imagen :

1- Descomprimir la imagen:

sudo docker load -i  restful.tar.gz

2- Inicar la imagen:

sudo docker run -it --rm -p 8888:8080 restful



*Modos de Uso:   ( Tambien ver Entrega_Postman.docx )

Los metodos de implementación son GET.

Las funciones son las siguientes:

-Sumar N digitos se invoca asi (se separan los digitos por comas ','):

http://localhost:8080/RESTful/Calc/sumaN/2,4,8

-Multiplicar N digitos se invoca asi (se separan los digitos por comas ','):

http://localhost:8080/RESTful/Calc/multiplicaN/2,3,2

Operaciones tradicionales (2 digitos):
Suma de 2 digitos:
http://localhost:8080/RESTful/Calc/suma/6/4

Operaciones tradicionales:
Suma de 2 digitos:
http://localhost:8080/RESTful/Calc/resta/4/2

Operaciones tradicionales:
Multiplicación de 2 digitos:
http://localhost:8080/RESTful/Calc/producto/4/2

Operaciones tradicionales:
División de 2 digitos:
(divisor, dividendo -> divisor>dividendo)
http://localhost:8080/RESTful/Calc/division/4/2

*Invocación desde Postman:

El modo de invocación de cada funcionalidad con la Calculadora desde Postman, se presenta en el documento: Entrega_Postman.docx con graficas demostrativas.