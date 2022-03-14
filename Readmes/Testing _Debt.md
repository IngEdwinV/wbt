![Logo](https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Logo_de_la_Escuela_Colombiana_de_Ingenier%C3%ADa.svg/2560px-Logo_de_la_Escuela_Colombiana_de_Ingenier%C3%ADa.svg.png)


# Testing Debt 👇

El fin de este Readme.md es detallar, mencionar que buenas practicas se testing se estan manejando en el proyecto, asi mismo si mencionar cuales no se esta implementando y proponer mejoras para aumentar la coverage esto teniendo encuenta otras metodologias.

## Ejecutando las pruebas ⚙️

A continuación mencionamos como configurar e iniciar a crear pruebas unitarias, de integración en el proyecto actual:

### Creación del scaffolding 🔩

Para dar inicio se de verificar o crear la siguiente estructura de carpetas en el proyecto

### Arbol Directorio Pruebas

 * test
   * wbtempest 
        * TestIntegration
        * TestUnit

En el caso que se tenga que crear el arbol de pruebas en el proyecto se debe realizar la configuración o asignación de la carpeta como ruta de pruebas del proyecto, para esto aplicar lo que se ve en la siguiente imagen:

![test1](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/Test1.png)

### Ejecución de pruebas 🚀

Para ejecutar las pruebas se debe seleccionar el directorio **test** dar clic derecho y seleccionar la opción **Run "test All"** y este iniciar una ejecución.

![test](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/Test2.png)

#
### Practicas de Testing 🧐

Revisando el proyecto con respecto a las practicas de pruebas automatizadas encontramos lo siguiente:

1. 🤦‍♂️ No existe estrucutura o arbol de directorios de pruebas.
2. 🤦‍♂️ No existe pruebas unitarias.
3. 🤦‍♂️ No existe pruebas de integración.
4. 🤦‍♂️ Muchos de los metodos son tipo void o private y esto genera que aplicar las pruebas unitarias se complique o sean mas complejas.
5. 🤦‍♂️ Por anotación, el coverage del proyecto es 0%.

Teniendo en cuenta lo anterior el proyecto y codigo actual tiene las siguientes desventajas, esta mas propenso a presentar fallas o bugs:

* ☠️ Baja calidad de codigo.
* ☠️ Cambios no validados.
* ☠️ No existe mejora continua.
* ☠️ No hay feedback oportuno.


#

### Aplicando UnitTesting ⚒️

Despues de verificar y entender el codigo y su funcionamiento, puedo decir que aplicar pruebas a las clases existentes y aumentar la covertura es algo dificil por la forma en que esta construido el sistema, sin embargo acontinuación mostramos un ejemplo de aplicacion de pruebas unitarias en el codigo.


```java
package wbtempest.TestUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wbtempest.Ex;

public class TestUnitEx {

    Ex ex = new Ex();

    @Test
    void testisPodReturnTrue() {
        boolean variable = true;
        ex.setPod(variable);

        Assertions.assertEquals(variable, ex.isPod());

    }

    @Test
    void testisPodReturnfalse() {
        boolean variable = false;
        ex.setPod(variable);

        Assertions.assertEquals(variable, ex.isPod());
    }

    @Test
    void testisVisibleReturnTrue() {
        boolean variable = true;
        ex.setVisible(variable);

        Assertions.assertEquals(variable, ex.isVisible());

    }

    @Test
    void testisVisibleReturnfalse() {
        boolean variable = false;
        ex.setVisible(variable);

        Assertions.assertEquals(variable, ex.isVisible());
    }

}
```

Como pueden ver se aplico pruebas unitarias a la clase **Ex.java** teniendo encuenta claro, que se tomaron metodos sencillos de probar para este ejemplo.

#

## Propuesta de mejora aplicación unitTesting 🔊

Analizando y teniendo en cuenta lo visto en la sesión de Testing Debt podemos decir o proponer el siguiente plan de mejora con el fin de poder implementar unitTesting y Testingintegration:

1. ⚡ Se debe implementar un refactoring al código, retirando o implementado una buena practica de manejo de variables globales en las clases, actualmente las variables son privadas con asignación de valor en algunos casos o en su defecto no tiene get y set.
2. ⚡ Implementar metodos abstratos o interfaces para los metodos que son compartidos por las clases.
3. ⚡ En paralelo al refactoring se puede aplicar TDD para ir creando los casos de unitTesting.
4. ⚡ Crear o planificar la creación de las pruebas unitarias de los metodos o codigos que no se aplique el refactoring.
5. Tener como proposito y meta tener un coverang de mas del 85%.
6. Para manejar una nomclatura y orden se recomienda nombrar las pruebas unitarias así:
 test_(funcionalidad)_(escenario).



