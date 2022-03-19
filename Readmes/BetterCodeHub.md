![Logo](https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Logo_de_la_Escuela_Colombiana_de_Ingenier%C3%ADa.svg/2560px-Logo_de_la_Escuela_Colombiana_de_Ingenier%C3%ADa.svg.png)


# 🛠️ Herramienta de análisis Better Code Hub 

En este archivo .md se detalla los resultados arrojados al analisis ejecutado por la herramienta Better Code Hub al codigo del juego

### **¿ Que es Better Code Hub ?** 🤔

Es una herramienta o software que ayuda a los equipos de desarrollo a dedicar menos tiempo a la corrección de errores y más tiempo al envío de nuevas funciones, realizando un analisis de codigo fuente y generando un informe de resultados.

## **¿Que se necesita?**
- Tener cargado o almancenado su proyecto en una herramienta de control de versiones y versionado.
- Registrarse a la herramienta con cuenta gratuita y dar permisos al software sobre el codigo.

#

## Detalle Analisis :

Despues de haber ejecutado el analisis de la herramienta sobre el codigo se encontro lo siguente:

* El compliance del codigo es 4
* El codigo cumple con las siguentes metricas de validación:
    - ✅ Write Code Once
    - ✅ Couple Architecture Components Loosely
    - ✅ Keep Your Codebase Small
    - ✅ Write Clean Code
* El Codigo no cumple con las siguientes metricas de validación:
    - ❌ Write Short Units of Code
    - ❌ Write Simple Units of Code
    - ❌ Keep Unit Interfaces Small
    - ❌ Separate Concerns in Modules
    - ❌ Keep Architecture Components Balanced
    - ❌ Automate Tests 

![hub1](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/hub1.png)

#
## **Aspectos Importantes:**

### ❌ Write Short Units of Code

De acuerdo a la herramienta nos indica que un gran porcentaje de los metodos de las clases de juego tiene mas de 15 lineas de codigo y estas son candidatas para aplicar una refactorización.

La herramienta nos recomienda sub dividir estos metodos en fuciones espesificar y pequeñas.

**Comparación:** Esta falla en el proyecto, tambien se tuvo encuenta en el analisis ejecutado manualmente en el codigo y plasmado en el [readme de Clean Code](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Readmes/Refactoring%20%2B%20Code%20Smells.md)) en la seccion de **Clean Code - Abstracción**

![hub2](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/hub2.png)

![hub3](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/hub3.png)

### ❌ Write Simple Units of Code

Esta seccion del analisis dice que se debe mantener un bajo numero puntos de bifurcación (if, for, while), nos dice que un porcentaje alto del codigo no cumple con esta.

La herramienta nos recomienda refactorizar en metodos sencillos donde la iteracción del codigo no sea tan compleja.

**Comparación:** Esta falla en el proyecto, tambien se tuvo encuenta en el analisis ejecutado manualmente en el codigo y plasmado en el [readme de Clean Code](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Readmes/Refactoring%20%2B%20Code%20Smells.md)) en la seccion de **Clean Code** pero no esta detallado al nivel de la herramienta.

![hub4](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/hub4.png)

![hub5](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/hub5.png)

## ✅ Write Code Once

De acuerdo al analisis de la herramienta nos indica que en el desarrollo del codigo si se tuvo encuenta el escribir codigo solo una vez y no duplicarlo.

Nos indica que tenemos la mayor parte del codigo unico y que tenemos algunos factores de riesgo pero que son minimos para el proyecto.

**Comparación:** En comparación con el anallisis que realizamos sesiones anteriores nosotros si detallamos como riesgo grande el codigo duplicado en el proyecto, esto esta en el [Refactoring + Code Smells](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Readmes/Refactoring%20%2B%20Code%20Smells.md)) Pero verificando con la herramienta es una deuda tecnica la cual tiene baja prioridad.

![hub6](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/hub6.png)

![hub7](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/hub7.png)

## - ✅ Write Clean Code

En esta seccion la herramienta nos dice que el proyecto cumple con el criterio de validación de codigo limpio, nos dice la mayoria del codigo no cuenta con codel smells.

Nos dice que si existen algunas clases que generan factores de riesgo pero que son manejables y su prioridad es baja.

**Comparación:** Este analisis del codigo es diferente a lo listado por nosotros en el readme de [Refactoring + Code Smells](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Readmes/Refactoring%20%2B%20Code%20Smells.md)) Donde nosotros si encontramos varios casos de code smells, que detallamos y listamos, pero entendemos que no generan un factor de riesgo alto y por ende ell software nos dice que cumple con este aspecto.

![hub8](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/hub8.png)

![hub9](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/hub9.png)


### 🥸 **Otros Detalles:**

* Segun el analisis el codigo no tiene pruebas automatizadas, esto tambien lo mencionamos en el readme de Testing.
* Dice que no es un codigo modular.
* Compara la cantidad de codigo por los años de desarrollo y dice que segun nuestro proyecto cumple con lo parametrizado.