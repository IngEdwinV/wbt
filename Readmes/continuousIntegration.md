![Logo](https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Logo_de_la_Escuela_Colombiana_de_Ingenier%C3%ADa.svg/2560px-Logo_de_la_Escuela_Colombiana_de_Ingenier%C3%ADa.svg.png)


# Continuous Integration 👇

En este readme mostraremos como implementamos algunos pasos o herramientras de integración continua, tambien detallaremos los problemas que se tuvo con la implementación y sus soluciones.

### 🛠️ ¿Que herramienta Utilizamos? 

Para implementar un proceso de integración continua utilizamos la herramiento CI de GitHubActions.

### ¿Que es GitHub Actions? 🤔

GitHub Actions es una herramienta que permite reducir la cadena de acciones necesaria para la ejecución de código, mediante la creación de un de flujo de trabajo encargado del Pipeline. Siendo configurable para que GitHub reaccione a ciertos eventos de forma automática según nuestras preferencias.

#

## Implementación 🧐

GitHub Action nos permite desde una configuración muy simple y con pocos pasos poder crear Workflows donde se valida varios aspectos como por ejemplo: Seguridad, analisis de codigo, compilación entre muchas otras acciones de integración continua.

Pasos para crear un workflow con gitHub Actions:
1. Desde Github, en el repositorio del proyecto, seleccionar del menu la opción Actions
   ![GitHubActions1](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/GitHubActions1.png)
2. Despues Seleccionar new Workflow
   ![GitHubActions2](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/GitHubActions2.png)
3. Se desplegara varias opciones de integracion continua seleccione la que requiera.
   ![GitHubActions3](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/GitHubActions3.png)


#
## Caso Practico 💥

El proyecto wtb fue construido o desarrollado como un proyecto **java ant**, realizamos los pasos anteriores para implementar el proceso de integracion continua **build**, una vez aplicado
el workflow, este creo un archivo .yml, pero cuando se ejecuto el flujo genero un error en la ejecución de build ya que no encontraba el archivo pom.xml, como se menciono anteriormente el proyecto java ant y este no cuenta con un archivo pom.

![GitHubActions4](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/GitHubActions4.jpeg)

De acuerdo al problema anterior, se tomo la decision de migrar el código fuete a un proyecto java maven, el cual nos permite modificar y controlar las dependencias desde el archivo pom.xml

### Implementación workflow Build 🐞

Despues de haber migrado el proyecto, se configuro de nuevo el primer workflow de build, para esto se implemento el siguiente archivo .yml:

* Definción de rama y tipo de accion
* Definicion de pasos y tipo de workflow.

![GitHubActions5](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/GitHubActions5.png)

![GitHubActions6](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/GitHubActions6.png)

### Implementación Workflow Analizador de codigo y deploy 🦹‍♂️

Desde la opción de Actión de gitHub, se desplego un workflow que permite cada vez que se requiera desplegar aplicar una validación del código fuente
utilizando la herramienta deepsource, esta ya la aplicamos anteriormente y pueden ver detalles en este [Readme](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Readmes/deepsource.md).

* Creación de YML.
* Ejecución del workFlow.

![GitHubActions7](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/GitHubActions7.png)

![GitHubActions8](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/GitHubActions8.png)

### Implementación de workflow de Test 👁️

Para implementar los pasos de integración continua con respecto a los Test, se tuvo que configurar y aplicar los siguientes pasos:

* Modificar archivo .yml.
* Modificar archivo pom.xml
* Ejecutar workflow.

![GitHubActions9](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/GitHubActions9.png)

![GitHubActions10](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/GitHubActions10.png)

![GitHubActions11](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/GitHubActions11.png)

### Implementación de workflow de seguridad (CodeQL)

**Que es**: CodeQL es el motor de análisis de código que desarrolló GitHub para automatizar las verificaciones de seguridad. Puedes analizar tu código utilizando CodeQL y mostrando los resultados como alertas del escaneo de código

Utilizamos esta herramienta de GitHub la cual nos permite validar y alertar problemas de seguridad desde el codigo de la aplicación.

* Crear archivo YML.
* Ejecutar Workflow.

![GitHubActions12](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/GitHubActions12.png)

![GitHubActions13](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/GitHubActions13.png)

#
### Conclusiones 💫

* Se trato de revisar la implementación con otras herramientas de integracion continua pero por el tiempo de proyecto fue dificil aplicar las configuraciones.
* Puede evidenciar en un pullrequest cuando el analizador de codigo generar alerta en sus validaciones, ver este comportamiento me permitio entender las ventajas de contar con estos mecanimos implementados.
  
    ![GitHubActions14](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/GitHubActions14.png)

    ![GitHubActions15](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/GitHubActions15.png)

    ![GitHubActions16](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/GitHubActions16.png)

* GitHub Actions en mi concepto es una herramienta de implementación muy sencilla y de la cual existe mucha informacion en la web.
