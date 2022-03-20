![Logo](https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Logo_de_la_Escuela_Colombiana_de_Ingenier%C3%ADa.svg/2560px-Logo_de_la_Escuela_Colombiana_de_Ingenier%C3%ADa.svg.png)


# 🛠️ Herramienta de análisis Deepsource

En este archivo .md se detalla los resultados arrojados al analisis ejecutado por la herramienta Deepsource al codigo del juego

### **¿ Que es Deepsource ?** 🤔

 Es una herramienta de análisis estático que puede aprovechar para detectar problemas de seguridad y calidad del código en una etapa temprana del ciclo de vida de desarrollo de su software.

## **¿Que se necesita?**
- Tener cargado o almancenado su proyecto en una herramienta de control de versiones y versionado.
- Registrarse a la herramienta con cuenta gratuita y dar permisos al software sobre el codigo.

#

## Detalle Analisis :

Despues de haber ejecutado la verificación del codigo fuente desde esta herramienta, esta arrojo los siguientes resultados:

* 🤒 Encontro **una** posible mejora en el performance del proyecto
* 🤕 **2** posibles mejoras en el estilo del codigo
* 🤕 **6** antipatrones
* 😵 **2** bug con riesgo alto.
* 🤯 **31,5** en coverage (Documentación de la aplicación)

![deep1](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/deep1.png)

## 💨 **Performance issues:**

El software nos indica el siguiente error: **Non-null boxed types are inefficient**

Nos explica que el error es "Los objetos de Java inherentemente agregan algo de sobrecarga en términos de uso de CPU y memoria, y esta sobrecarga también se extiende a los tipos primitivos"

El codigo donde existe la posible mejora es:

 ```java
 public void setVisible(Boolean visible) {
        this.visible = visible;
   }
```

La solución es cambiar el tipo de dato de la variable, utilizando datos no primitivos, ejemplo:

 ```java
No recomendado: integer i = 3;
Recomendado: int i = 3;
```

**Nota importante: este tipo de falla y mejora en el codigo no se habia contemplado antes en la revisión manual que se aplico al codigo, me parece muy acertado por el software recomendar este tipo de mejoras al codigo, por sencillas y simples generan gran efecto en el proyecto.**

## 🧟 **Anti-Pattern:**

El analisis arrojo los siguientes anti patrones:
* Method superfluously delegates to parent class method
* Collection and array length checks must be sensible
* Getter/setter names must be appropriate
* Method uses the same code for multiple branches
* Method and field names must be dissimilar


Adjunto algunas imagenes de la información que nos arroja el software sobre los anti-patrones:

![deep2](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/deep2.png)

![deep3](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/deep3.png)

![deep4](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/deep4.png)


**Nota importante: este tipo de falla y mejora en el codigo no se habia contemplado antes en la revisión manual que se aplico al codigo, el resaltar estos anti patrones y describir posibles mejoras al codigo me parece que hace que el software tenga mas valor**

## 🐞 **Bug risk:**

El software tambien en su analisis nos lista errores con un alto riesgo, en este caso nos dice que existe una clase anidada y esto no es recomendable aplicar.

Recomienda que la clase secundaria sea marcada como clase estatica.

![deep5](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/deep5.png)

**Nota importante: este tipo de falla y mejora en el codigo no se habia contemplado antes en la revisión manual que se aplico al codigo, aclaro que no conocia que este tipo de codificación generara bugs criticos y que son implementaciones no recomendadas**


#

### Conclusiones 

* Me parece importante resaltar que este software analiza mas a fondo la codificación que se tiene en el proyecto, clases, metodos tipos de datos.
* La visualización de la información es muy facil de entender y generar soluciones prontas y rapidas
* Explica de que se trata el error o falla, como solucionarlo y ejemplos del mismo, esto me parece super importante da claridad y ayuda a la rapida mejora del codigo.

![deep6](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/deep6.png)