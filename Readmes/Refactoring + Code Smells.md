
![Logo](https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Logo_de_la_Escuela_Colombiana_de_Ingenier%C3%ADa.svg/2560px-Logo_de_la_Escuela_Colombiana_de_Ingenier%C3%ADa.svg.png)


# Refactoring + Code Smells

El fin de este Readme.md es detallar las posibles practicas de Refactoring y code Smells que se puedan presentar en el codigo fuente del juego "wannabe tempest", este proyecto esta desarrollado en el lenguaje de programación JAVA.




## Code Smell 💩
 A continuación se detalla un listado de las clases a la cuales se les revisara el codigo con mal olor:

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

### Code smell-Comments
Estos son los metodos que tiene code smell-Comments, este code Smell dice: **Un método está lleno de comentarios explicativos**.

- **Clase SoundManager:**

```java
/**
	 * the way sound is triggered in java, from what i can tell, is a fucking disaster.
	 * 
	 * so basically, we create a thread, which then plays the sound (in yet 
	 * another secondary thread), and then waits around until the second thread notifies
	 * it that it's done and mindlessly idling, so that we 
	 * can tell the second thread to close down.
	 * 
	 * @author ugliest
	 *
	 */
	private class SoundPlayer implements Runnable, LineListener{...}
```
- **Clase Board:**

```java
    /**
     * This is how we achieve the 3D effect.  The z-axis is assumed to
     * point "into" the screen, away from the player.  interpolation is
     * done toward this center to simulate a z-axis -- but it can't be
     * done linearly, or depth perception is ruined.  this function 
     * creates a "z factor", based on the
     * z position, which asymptotically approaches but never hits the
     * board center (which represents z-infinity). this z-factor can then 
     * be used by the caller as a percentage of the way to the center.
     * 
     * @param z the inpassed z position
     * @return
     */
    private static double getZFact(int z) {return 1.0-(ZSTRETCH/(z+ZSTRETCH));}
```

- **Clase Crawler:**

```java
/**
     * Returns the coordinates to draw the crawler at its current position/pose.
     * 
     * Like everything in this game, the crawler is drawn based on a line
     * connecting a list of points. a few fixed positions are used.
     * 
     * @return
     */
    public List<int[]> getCoords() {...}
```

- **Clase SoundManager:**

```java
	/**
	 * the way sound is triggered in java, from what i can tell, is a fucking disaster.
	 * 
	 * so basically, we create a thread, which then plays the sound (in yet 
	 * another secondary thread), and then waits around until the second thread notifies
	 * it that it's done and mindlessly idling, so that we 
	 * can tell the second thread to close down.
	 * 
	 * @author ugliest
	 *
	 */
	private class SoundPlayer implements Runnable, LineListener{...}
```

### Code Smell-LongMethod
Estos son los metodos que tiene code smell-LongMethod, este code Smell dice: **Un método contiene demasiadas líneas de código. En general, cualquier método de más de diez líneas debería hacer que comiences a hacer preguntas.**.

- **Clase SoundManager:**

Este metodo contiene demasiadas lineas de codigo, implementa un swith/case y unos bucles por cada caso y lo complementan con unos if anidados, estos se pueden reducir en metodos aparte donde se envie por parametros los datos necesarios para su ejecución.

```java
    public Level(int levnum, int b_width, int b_height){...}
```
- **Clase Ex:**

Este metodo contiene demasiadas lineas de codigo, implementa un swith/case y if anidados, se puede implementar metodos mas simples donde se coloque o defina funciones repetidas del metodo. 

```java
    public void move(int xbound, int crawlerCol) {...}
```

Este metodo contiene una asignación de un array pero la esta aplicando manulamente y esto se puede reducir a un for o un lamda en java

```java
    public List<int[]> getDeathCoords(Level lev){...}
```

Este metodo contiene un swith/case donde por case implementa la asignación de un array, esto se puede mejorar con un función donde se maneje el array por for o lamda.

```java
    public List<int[]> getCoords(Level lev){...}
```

- **Clase Crawler**

Este metodo contiene un swith/case donde por case implementa la asignación de un array, esto se puede mejorar con un función donde se maneje el array por for o lamda.

```java
    public List<int[]> getCoords(){...}
```

- **Clase Board**

Este metodo contiene muchas lineas de codigo, nolo hace entedible, se implementa varios if anidados, se pueden implementar funciones como lamda. 
```java
     public void paint(Graphics g){...}
```

### Code Smell-LazyClass
Estos son los metodos que tiene code smell-LongMethod, este code Smell dice: **Comprender y mantener las clases siempre cuesta tiempo y dinero. Entonces, si una clase no hace lo suficiente para llamar su atención, debe eliminarse.**.

- **Clase Sound:**

```java
    package wbtempest;

    public enum Sound {
	    FIRE,
	    LEVELCLEAR,
	    ENEMYFIRE,
	    ENEMYDEATH,
	    CRAWLERDEATH,
	    CRAWLERMOVE
    }

```


## Refactoring
 A continuación se detalla un listado de las clases a la cuales se les revisara el codigo aplicable a refactoring:

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

### Refactoring-Notación (CamelCase)
Podemos implementar una mejora al codigo del juego, manejando la notación camelCase, renombrando algunas clases y metodos esto con el fin de que sean mas descriptivos para su entendimiento, ejemplo:

- **Clase Ex:**

### Refactoring Replace Magic Number with Symbolic Constant

Aunque el proyecto implementa este metodo de refactoring, aun se puede implementar mas y mejorar la simplicidad y entendibilidad del codigo, ejemplo:

```java

	for (double rads=spinnerangle; ct < nCoords; rads+=step, ct++)
		{
			coords[ct][0] = mp[0] - (int)(Math.sin(rads) * radius * .85);
			coords[ct][1] = mp[1] - (int)(Math.cos(rads) * radius);
			coords[ct][2] = spinnerz;
			radius = origRadius *ct/nCoords; 
		}
    	return Arrays.asList(coords);
```

### Refactoring Replace Nested Conditional with Guard Clauses

El proyecto contiene bastantes metodos en los cuales contiene if anidados en los cuales se pueden resumir e implemntar diferente.

### Refactoring Split Temporary Variable

El proyecto contiene varios metodos con variables locales que cambian varias veces durante todo el ciclo del proyecto.

### Refactoring Codigo Duplicado

El proyecto contiene varios metodo donde implementa switch/case y en este se duplica el codigo solo que con datos diferentes, esto lo podemos mejorar cambiando por una funcion donde se implemente solo una vez.
## 🛠 Skills
Java


## Authors

- [@IngEdwinV](https://github.com/IngEdwinV)

