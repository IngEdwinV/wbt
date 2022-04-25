![Logo](https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Logo_de_la_Escuela_Colombiana_de_Ingenier%C3%ADa.svg/2560px-Logo_de_la_Escuela_Colombiana_de_Ingenier%C3%ADa.svg.png)


# Architectural Debt 👇

En este archivo vamos a visualizar como se puede analizar e identificar la deuda técnica en arquitectura, teniendo en cuenta dos metedos de trabajo.

### 📚 Tener en cuenta (Documentación)

1. [ATAM](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Documentos/ATAM.pdf)
2. [QAW](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Documentos/QAW.pdf)

### ¿Que es ATAM?🤔

ATAM (Architecture tradeoff analysis method), es un método o proceso de mitigación del riesgo que se utiliza en las primeras etapas de vida del ciclo del desarrollo de software, está enfocado en la arquitectura y ayuda a identificar cuál es la más adecuada para el proyecto en curso

**Algo importante para resaltar de la documentación de ATAM, es el siguiente imagen, es un ejemplo práctico para identificar los drivers importantes del proyecto y así mismo cuál es su importancia en el proyecto.**

![ATAM1](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/ATAM1.png)

### ¿Que es QAW? 🤔

Quality Attribute Workshop (QAW), es un taller donde se trata de involucrar al team de trabajo del proyecto y asi poder identificar los atributos de calidad y drivers del diseño de arquitectura del producto, en este taller se puede implementar el ATAM.

**importante resaltar tambien que en la documentación hacen referencia a un ejemplo de como refinar los drivers de calidad del proyecto**

![QAW1](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/Imagenes/QAW1.png)

## Aplicación desde un QAW ejemplo:

**Caso 1:**
<table>
  <tr >
    <td colspan="3">Scenario Refinement for Scenario N 1</td>
  </tr>
  <tr >
    <td rowspan="4"></td>
  </tr>
  <tr>
    <td>Scenario(s):</td>
    <td>El juego debe estar disponible para varias plataformas</td>
  </tr>
  <tr>
    <td>Business Goals:</td>
    <td>Despliegue multiplataforma</td>
  </tr>
  <tr>
    <td>Relevant QualityAttributes:</td>
    <td>Disponibilidad, performan  y modificalidad</td>
  </tr>
  <tr>
    <td rowspan="7">Scenario Components</td>
</tr>
<tr>
    <td>Stimulus</td>
    <td>Varios usuarios de diferentes plataformas quiere descargar y utiliar el juego</td>
</tr>
<tr>
    <td>Stimulus Source:</td>
    <td>Usuario Android quiere descargar el juego</td>
</tr>
<tr>
    <td>Environment:</td>
    <td>Descarga desde Android, IOS, computadoras/td>
</tr>
<tr>
    <td>Artifact (If Known):</td>
    <td>Deploy</td>
</tr>
<tr>
    <td>Response:</td>
    <td> El juego esta disponible en varias plataformas</td>
</tr>
<tr>
    <td>Response Measure:</td>
    <td>Multiplataforma</td>
  </tr>
  <tr >
    <td rowspan="3"></td>
  </tr>
<tr>
    <td>RQuestions:</td>
    <td>¿El juego permite aplicar a otras plataformas?, ¿La infraestructura esta configurada para varias plataformas?</td>
  </tr>
<tr>
    <td>Issues:</td>
    <td>Es seguro que se deba implementar una infraestructura que permita contar con un juego multiplataforma</td>
  </tr>
</table>

#

**Caso 2:**
<table>
  <tr>
    <td colspan="3">Scenario Refinement for Scenario N</td>
  </tr>
  <tr >
    <td rowspan="4"></td>
  </tr>
  <tr>
    <td>Scenario(s):</td>
    <td> Cuando el juego presente un incremento en las peticiones de registro al sistema</td>
  </tr>
  <tr>
    <td>Business Goals:</td>
    <td>Alta disponibilidad</td>
  </tr>
  <tr>
    <td>Relevant QualityAttributes:</td>
    <td>Escalabilidad y Usabilidad</td>
  </tr>
  <tr>
    <td rowspan="7">Scenario Components</td>
</tr>
<tr>
    <td>Stimulus</td>
    <td>Incremento en las solicitudes para registro en el sistema</td>
</tr>
<tr>
    <td>Stimulus Source:</td>
    <td>Campaña comercial de descarga del juego</td>
</tr>
<tr>
    <td>Environment:</td>
    <td>Varios usuarios realizan el proceso de registro en la plataforma del juego</td>
</tr>
<tr>
    <td>Artifact (If Known):</td>
    <td> Registro de usuarios</td>
</tr>
<tr>
    <td>Response:</td>
    <td>El sistema no presenta lentitud en las peticiones al sistema</td>
</tr>
<tr>
    <td>Response Measure:</td>
    <td>10 segundos</td>
  </tr>
  <tr >
    <td rowspan="3"></td>
  </tr>
<tr>
    <td>Questions:</td>
    <td>¿Se cuenta con alertas que nos indiquen de incrementos o degradación del servicio?. ¿Se aplicaron pruebas de carga al sistema?</td>
  </tr>
<tr>
    <td>Issues:</td>
    <td> Es posible que se deba ajustar o implementar una infraestructura que permita escalar correctamente el sistema</td>
  </tr>
</table>

