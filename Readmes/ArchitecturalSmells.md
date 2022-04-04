![Logo](https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Logo_de_la_Escuela_Colombiana_de_Ingenier%C3%ADa.svg/2560px-Logo_de_la_Escuela_Colombiana_de_Ingenier%C3%ADa.svg.png)


# Architectural Smells 👇

En este readme vamos a ver cuales smells de arquitectura son aplicables o visibles en el proyecto del juego.

### ¿Que es Architectural Smells? 🤔

El code smells architectural son todas aquellas practicas o combinaciones de construcciones que reducen la mantenibilidad del sistema, compo premisas se tiene:
* No son errores.
* Pueden relentizar la velicidad de desarrollo del software.
* Aumenta el riesgo de errores en el futuro.

### 🛠️ ¿Que herramienta Utilizamos?

Identificar los smells de arquitectura en un proyecto es un poco compliado mas en proyectos ya desarrollados, en este caso utilizamos dos herramientas que nos permite analizar el codigo fuente del proyecto y teniendo en cuenta un listado de smelles de arquitectura verificamos si alguno se ve reflejado.

Las herramientas son:

1. [SonarCloud](https://sonarcloud.io/)
2. [DesigniteJava para IntelliJ IDEA](https://www.designite-tools.com/)
3. [Listado de smells](https://www.tusharma.in/smells/ARCH.html)

Cabe resaltar que el correcto flujo es poder identificar o listar estos posibles smells desde el diseño, creación del proyecto, esto debido que a es el momento donde por conocimiento se pueden omitir cosas que a futuro generen esta deuda tecnica.

#
### Resultados SonarCloud 🥸

Una vez aplicada la configuración de SonarCloud en nuestro repositorio este ejecuta una validación de nuestro codigo fuente y nos permite visualizar los resultados.

Ejecutamos la herramienta para validar si encontrabamos algun smell de arquitectura y estos fueron nuestros resultados:

#### Resumen del analisis:

![SmellArch1](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/SmellArch1.png)

* Como se puede observar la herramienta nos muestra que la calificación de nuestro proyecto en mantenibilidad es **A**, que si tenemos 120 smell en el codigo, estos no son aun criticos.
* Revisando el listado de Smell no encontramos alguno que este ligado a la arquitectura.

A continuación algunas imagenes del analisis de sonar:

![SmellArch2](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/SmellArch2.png)

![SmellArch3](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/SmellArch3.png)

![SmellArch4](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/SmellArch4.png)

### Resultados DesigniteJava

DesigniteJava es una herramienta que permite realizar un analisis del codigo fuente y listarnos todos los smells que este tiene.

Esta herramienta la utilizamos desde el **IDEA de IntelliJ** instalando el plugin, despues sobre el proyecto ejecutamos el analizador, como tal esta herramienta no permite tener un resumen del analisis pero si permite por clase verificar y listar los smell.

![SmellArch5](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/SmellArch5.png)

#### Resumen del analisis:

* Verificando el analisis del herramienta no se encontro posibles smells de arquitectura.
* Los Smell encontrados estan en la parte de configuración, diseño y malas practicas de clean code.

![SmellArch6](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/SmellArch6.png)

![SmellArch7](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/SmellArch7.png)

### Analisis Manual 🧐:

Tambien es practico que desde el desarrollador se realice una verificación de su codigo, teniendo en cuenta que las herramientas no le proporcionaran un 100% de exactitud en la verificación de los smells de arquitectura.

Por tal motivo a continuación mostrare algunos smells que considero que estan presente en el proyecto:

1. **Package Hierarchies Unbalanced**: el proyecto actual no esta encapsulado por paquetes, considero que seria una buena mejora o practica poder separar en paquetes las clases que compartan una funcionalidad, requisito o en su defecto utilizar un patron de arquitectura.
2. **Reinvent the Wheel**: Este smell lo veo aplicable o visible en nuestro proyecto ya que en el codigo existen varias formas de implementar una misma funcionalidad, como buena practica se puede crear una clase abstracta con una unica implementación de esa funcionalidad.
3. Tambien considero que un smell de arquitectura de este proyecto es el tipo de proyecto seleccionado para el desarrollo, se eligio un java ant este no permite una facil incorporación de metricas de analisis de codigo, por tal motivo se migro a un proyecto java maven que su integración es mas sencilla.