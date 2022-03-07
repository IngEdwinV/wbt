
![Logo](https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Logo_de_la_Escuela_Colombiana_de_Ingenier%C3%ADa.svg/2560px-Logo_de_la_Escuela_Colombiana_de_Ingenier%C3%ADa.svg.png)


# Clean Code + XP Practices 👇

El fin de este Readme.md es detallar que practicas de clean code se pueden ver reflejadas en el codigo fuente y cuales no, asi mismo verificar y anotar cuales practicas de programación XP se pueden poner en practica par mejorar dicho proyecto.




## Clean Code 🧙
 A continuación se detalla un listado de las clases a la cuales se les revisara si cuentan con practicas de clean code:

- WBTempest (Clase Principal o main) 
- Spike
- SoundManager
- Sound
- Missile
- Level
- Ex
- Crawler
- Column
- Board

### Clean Code - Principio menor asombro
Esta caracteristica dice **Implementaciones en función de su nombre.** verificando se encontro que la mayoria del codigo encapsulado en los metodos hace lo respectivo a lo que el nombre indica, ejemplo:

- **Spike Java**

```java
public List<int[]> getSpinnerCoords(Level lev){
		int nCoords = 16;
		int[][] coords=new int[nCoords][3];
		Column c = lev.getColumns().get(colnum);
		int[] p1 = c.getFrontPoint1();
		int[] p2 = c.getFrontPoint2();
		int[] mp = new int[2];
		mp[0] = p1[0] + (p2[0]-p1[0])/2;
		mp[1] = p1[1] + (p2[1]-p1[1])/2;
		int colWidth = (int)Math.sqrt(Math.pow((p2[0]-p1[0]),2) + Math.pow((p2[1]-p1[1]),2));
		int origRadius = colWidth/3;
		int radius = origRadius;
		float rad_dist = (float) (3.1415927 * 2)*3;
		float step = rad_dist/(nCoords);
		int ct = 0;
		for (double rads=spinnerangle; ct < nCoords; rads+=step, ct++)
		{
			coords[ct][0] = mp[0] - (int)(Math.sin(rads) * radius * .85);
			coords[ct][1] = mp[1] - (int)(Math.cos(rads) * radius);
			coords[ct][2] = spinnerz;
			radius = origRadius *ct/nCoords; 
		}
    	return Arrays.asList(coords);
	}

	public List<int[]> getCoords(Level lev){
		int[][] coords=new int[2][3];
		Column c = lev.getColumns().get(colnum);
		int[] p1 = c.getFrontPoint1();
		int[] p2 = c.getFrontPoint2();
		coords[0][0]=p1[0] + (p2[0] - p1[0])/2;
		coords[0][1]=p1[1] + (p2[1] - p1[1])/2;
		coords[0][2]=Board.LEVEL_DEPTH;
		coords[1][0]=coords[0][0];
		coords[1][1]=coords[0][1];
		coords[1][2]=Board.LEVEL_DEPTH - length;
    	return Arrays.asList(coords);
	}
```
### Clean Code - Abstracción

Esta caracteristica nos dice **Clases y métodos cortos** , verificando el proyecto se puede evidenciar que se aplica pero no a un 100%, esto a que se ve reflejado que cada función o actividad del juego fue encapsulada en una clase JAVA, pero el codigo de estas clases es muy extenso, ejemplo:

**Estructura del proyecto:**

- WBTempest (Clase Principal o main) 
- Spike
- SoundManager
- Sound
- Missile
- Level
- Ex
- Crawler
- Column
- Board

Ejemplo de una clase: 

- 👉 [Clase Java Level](https://github.com/IngEdwinV/wbt/blob/codeSmellRefactoring/src/wbtempest/Level.java)


Las demas caracteristicas del Clean Code no se ven reflejadas en el codigo del proyecto, a continuación se mencionan:

- ❌ Testeable (No cuenta con pruebas unitarias, se dificultaria crearlas por la complejidad de cada metodo)
- ❌ Duplicidad ( Cuenta con code Smell de duplicidad)
- ❌ Escalable 
- ❌ Entendible (Dificil de comprender y leer el codigo)
- ❌ Regla del BoyScout
- ❌ Código enfocado

## Principios de Programación

A continuación se mencionara cuales principios no se ven aplicados en el desarrollo del proyecto del juego:

- **Principio Don'tRepeatYourself:**
    Es nos dice _"Toda pieza de código nunca debería ser duplicada debido a que esto incrementa la dificultad en los cambios y evolución posterior, puede perjudicar la claridad y crear un espacio para posiblesinconsistencias."_

    ```java
    public List<int[]> getCoords() {
        int colnum = getColumn();
        int pose = (int)pos % C_POSES / 2; // each pose here is doubled for more manageable movement
        int[][] coords=new int[9][3]; 
        
        Column column = lev.getColumns().get(colnum);
        int[] pt1 = column.getFrontPoint1();
        int[] pt2 = column.getFrontPoint2();
        switch (pose)
        {
        	case 0:{
                coords[0][0] = pt1[0] +(pt2[0] - pt1[0])/3;
                coords[0][1] = pt1[1] +(pt2[1] - pt1[1])/3;
                coords[0][2] = CHEIGHT_H;
                coords[2][0] = pt1[0] +(pt2[0] - pt1[0])/4;
                coords[2][1] = pt1[1] +(pt2[1] - pt1[1])/4;
                coords[2][2] = -CHEIGHT;
                coords[4][0] = pt2[0] -(pt2[0] - pt1[0])/4;
                coords[4][1] = pt2[1] -(pt2[1] - pt1[1])/4;
                coords[4][2] = CHEIGHT_HP;
                coords[6][0] = pt1[0] +(pt2[0] - pt1[0])/4;
                coords[6][1] = pt1[1] +(pt2[1] - pt1[1])/4;
                coords[6][2] = -CHEIGHT_H;
                break;
        	}
        	case 1: {
                coords[0][0] = pt1[0] +(pt2[0] - pt1[0])/3;
                coords[0][1] = pt1[1] +(pt2[1] - pt1[1])/3;
                coords[0][2] = CHEIGHT_H;
                coords[2][0] = pt1[0] +(pt2[0] - pt1[0])/2;
                coords[2][1] = pt1[1] +(pt2[1] - pt1[1])/2;
                coords[2][2] = -CHEIGHT;
                coords[4][0] = pt2[0] -(pt2[0] - pt1[0])/3;
                coords[4][1] = pt2[1] -(pt2[1] - pt1[1])/3;
                coords[4][2] = CHEIGHT_H;
                coords[6][0] = pt1[0] +(pt2[0] - pt1[0])/2;
                coords[6][1] = pt1[1] +(pt2[1] - pt1[1])/2;
                coords[6][2] = -CHEIGHT_H;
                break;
        	}
        	case 2: {
                coords[0][0] = pt1[0] +(pt2[0] - pt1[0])/4;
                coords[0][1] = pt1[1] +(pt2[1] - pt1[1])/4;
                coords[0][2] = CHEIGHT_HP;
                coords[2][0] = pt1[0] +(pt2[0] - pt1[0])*3/4;
                coords[2][1] = pt1[1] +(pt2[1] - pt1[1])*3/4;
                coords[2][2] = -CHEIGHT;
                coords[4][0] = pt2[0] -(pt2[0] - pt1[0])/3;
                coords[4][1] = pt2[1] -(pt2[1] - pt1[1])/3;
                coords[4][2] = CHEIGHT_H;
                coords[6][0] = pt1[0] +(pt2[0] - pt1[0])*3/4;
                coords[6][1] = pt1[1] +(pt2[1] - pt1[1])*2/3;
                coords[6][2] = -CHEIGHT_H;
                break;
        	}
        }
        coords[1][0] = pt1[0];
        coords[1][1] = pt1[1];
        coords[1][2]=0;
        coords[3][0] = pt2[0];
        coords[3][1] = pt2[1];
        coords[3][2] = 0;
        coords[5][0] = pt2[0] -(pt2[0] - pt1[0])/6;
        coords[5][1] = pt2[1] -(pt2[1] - pt1[1])/6;
        coords[5][2] = 0;
        coords[7][0] = pt1[0] +(pt2[0] - pt1[0])/6;
        coords[7][1] = pt1[1] +(pt2[1] - pt1[1])/6;
        coords[7][2] = 0;
        coords[8] = coords[0];
        return Arrays.asList(coords);
    }
    ```

- **Principio KeepitSimple, Stupid:**
    Este nos dice _"La mayoría de los sistemas funcionan mejor si se mantienen simples en lugar de hacerlos complejos;por lo tanto, la simplicidad debe ser un objetivo clave en el diseño y se debe evitar la complejidad innecesaria"_

    🧐 En mi opinion no se aplica este principo ya que en cada metodo o clase del juego, se dificulta ver simplicidad y por el contrario cuesta entender el funcionamiento de los mismos.


### Practicas XP

![Xp Practices](https://cdn.sanity.io/images/hgftikht/production/a9c0c66929685739168fb98fe18d1cc308f00416-3064x1671.png?w=1280&h=698&fit=crop)


* Teniendo encuenta lo ya revisando en el codigo podemos decir que se pueden aplicar las siguientes practicas Xp para mejorar el codigo:

- **Circulo Rojo**
    - ✅ Small Releases: Desarrollar las mejoras del codigo implementando entregables pequeños y estables
    - ✅ Planing Game: Realizar una planeación completa de cads entrrgable priorizando las entregas que mas generan valor al usuario

- **Circulo Verde**
    - ✅ Coding Standard: Implementar una codificación estandar y bien estructurada
    - ✅ Continuous integration
    - ✅ Sustainable Pace: Cada Entregable al usuario perdure en el tiempo sin generar dificultades o bugs de gran escala 

- **Circulo Azul**
    - ✅ Refactoring: Aplicar todas las posibles practicas de refactorin ya mencionadas antes, separandolas en pequeños entegables al usuario
    - ✅ Test- Driven Development: Implementar pruebas unitarias y de integración al codigo, procurando generar una covertura alta de codigo
    - ✅ Simple Desing: siempre aplicar el principo de simplicidad

## Author 🎖️

- [@IngEdwinV](https://github.com/IngEdwinV)

