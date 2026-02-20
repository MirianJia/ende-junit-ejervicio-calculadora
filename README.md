# Testing con Junit

*Yeting Mirian Jia 1ºDAM*

Este es un ejemplo sencillo de pruebas unitarias usando Junit 5

Observa que este proyecto no tiene ninguna clase con el método `main`, no nos hace fatal. Además, tampoco tiene ningún `scanner` ni ningún `print`.

Haz un fork de este proyecto en tu repositorio de Github y contesta a las siguientes preguntas:

### 1. ¿Qué sentido puede tener este proyecto y para que lo podrías usar?

Este proyecto sirve para practicar pruebas unitarias con JUnit 5. Permite comprobar el funcionamiento de una calculadora mediante tests sin necesidad de usar un método main.

### 2. Revisa las pruebas de la suma y comenta lo que te parezca de interés

Las pruebas de suma comprueban distintos casos como números positivos, negativos y cero. También se utiliza assertAll para agrupar varias comprobaciones en un mismo test.

### 3. Realiza un estudio de caja negra de la división e implementa las pruebas en junit: Se realizará en markdown.

-Para la división he considerado los siguientes casos:

División entre números positivos.

División con números negativos.

División cuando el numerador es 0.

División por 1.

División por 0, que debe lanzar una excepción.

## Instrucciones

El alumno deberá hacer un fork de este proyecto e implementar la solución solicitada (preguntas y código).

>Se deberá utilizar este fichero, y los artefactos de código del proyecto, para resolver el ejercicio.


**Si no se puede acceder al repositorio la evaluación del ejercicio será de 0. No se evaluarán entregas modificadas/entregadas fuera del plazo establecido en la tarea**