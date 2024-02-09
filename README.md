# LABORATORIO 2 CVDS
## OBJETIVOS
  1. Entender qué es Maven
  2. Usar comandos de generación de arquetipos, compilación y ejecución de un proyecto usando Maven
  3. Obtener puntos adicionales por PR qué corrijan o mejoren los laboratorios
## LA HERRAMIENTA MAVEN
Ingresar a la página de la herramienta y entender:
  #### 1. Cuál es su mayor utilidad
  Maven simplifica y estandariza el proceso de desarrollo de software en Java al proporcionar una estructura organizada, gestionar dependencias y automatizar tareas comunes, lo que mejora la eficiencia y la consistencia en los proyectos.
  #### 2. Fases de maven
  - validate: se comprueba el proyecto para asegurarse de que está correctamente construido y de que se dispone de toda la     información necesaria.
  - compile: realizar la compilación el código fuente del proyecto.
  - test: se ejecutan las pruebas del proyecto.
  - package: crea un archivo JAR o WAR que se puede usar para la implementación.
  - verify: verifica si el paquete es válido y cumple con algunos estándares.
  - install: instala el paquete en el repositorio local, dejandolo disponible para ser usado en otros proyectos.
  - deploy:  copia el paquete en el repositorio remoto, donde otros desarrolladores o máquinas pueden acceder a él.
  #### 3. Ciclo de vida de la construcción
  El ciclo de vida de Maven se organiza en tres lifecycles principales: default, clean y site. Cada uno de estos lifecycles tiene un conjunto de fases predefinidas que representan las diferentes etapas   del proceso de construcción de un proyecto.
  
  - Default Lifecycle:   Este ciclo de vida es el más común y se utiliza para construir, probar y distribuir el proyecto
    
  - Clean Lifecycle: Este ciclo de vida se encarga de limpiar el directorio de salida del proyecto.
  - Site Lifecycle: Este ciclo de vida se utiliza para generar y desplegar la documentación del proyecto.
    
  Estos lifecycles y fases predefinidas permiten una gestión coherente y ordenada del proceso de construcción de proyectos en Maven. Cada fase representa una tarea específica que contribuye al         
  desarrollo, prueba y distribución exitosos del proyecto.
  #### 4. Para qué sirven los plugins
  Los plugins son componentes de software que proporcionan funcionalidades adicionales a Maven. Los plugins permiten extender y   personalizar el comportamiento de Maven. Pueden realizar tareas como la compilación, ejecución de pruebas, generación de        informes, despliegue, entre otros. Maven utiliza plugins para ejecutar las diversas fases del ciclo de vida del proyecto.
  #### 5. Qué es y para qué sirve el repositorio central de maven
Maven es una herramienta para crear aplicaciones y, también, proporciona un repositorio para contener artefactos a los que desea que acceda la aplicación.
El repositorio de Maven (o repositorio central) tiene una estructura que permite que los archivos como, por ejemplo, archivos JAR tengan versiones distintas que se descubren después fácilmente con un mecanismo de denominación bien conocido. A continuación, las herramientas de creación pueden utilizar estos nombres para extraer dinámicamente las dependencias de la aplicación. En la definición de la aplicación que se denomina archivo POM, cuando se utiliza Maven como una herramienta de compilación, simplemente denomine las dependencias y el proceso de compilación sabrá qué hacer a partir de ahí.

## EJERCICIO DE LAS FIGURAS
### CREAR UN PROYECTO CON MAVEN
  - Buscar cómo se crea un proyecto maven con ayuda de los arquetipos (archetypes).
  - Busque cómo ejecutar desde línea de comandos el objetivo "generate" del plugin "archetype", con los siguientes parámetros:
  
  1. Primero generamos un nuevo proyecto Maven a partir de un arquetipo, con el comando "mvn archetype:generate"
  
     ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/a6b13ca8-6180-48cf-81fe-484a3e3deb3e)
  
  2. Escogemos la versión, en este caso la opción 5
  
     ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/38a06a97-5fa8-4851-8900-f7f8c2b1fb5a)
  
  3. Establecemos las configuraciones correspondientes:
  
     ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/9755cdf7-a40d-46bb-8adc-8be3b92d2db4)

  - Cambie al directorio Patterns:
    
    ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/b77d2174-f11c-40f9-9c35-952f804be3a2)

  - Para ver el conjunto de archivos y directorios creados por el comando mvn ejecute el comando tree.

    ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/a62cc36d-d173-4eac-ab32-8811769c178b)
    
## AJUSTAR ALGUNAS CONFIGURACIONES EN EL PROYECTO
- Edite el archivo pom.xml y realize la siguiente actualización:
  Hay que cambiar la version del compilador de Java a la versión 8
  
  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/cf6c3ceb-26be-42b3-82a0-5c5e90501b86)

  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/7c21bf23-cc1a-43c3-863d-5f823b26bd3e)


## COMPILAR Y EJECUTAR
 - Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando mvn.
  
    El parámetro package en Maven se utiliza para especificar el tipo de empaquetado que se aplicará al proyecto durante la fase de empaquetado (mvn package). En este caso un .jar
  
- Busque cómo ejecutar desde línea de comandos, un proyecto maven y verifique la salida cuando se ejecuta con la clase App.java como parámetro en "mainClass". Tip: https://www.mojohaus.org/exec-maven-plugin/usage.html

  utilizamos: $ mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.archetype.App"

  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/ab3ebb95-ceb7-4bb6-abcc-bdd4eedd468d)


- Realice el cambio en la clase App.java para crear un saludo personalizado, basado en los parámetros de entrada a la aplicación.
- Utilizar la primera posición del parámetro que llega al método "main" para realizar elsaludo personalizado, en caso que no sea posible, se debe mantener el saludo como se encuentra actualmente:
- Buscar cómo enviar parámetros al plugin "exec".
  

 1. Modificamos el App.java
    
    ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/19d34654-f1f8-4b69-9803-b34e0f5d012b)


2. Compilamos
   
   ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/2d9efcf3-3594-47ee-aca5-57a92d22bd66)
   
3. Ejecutamos con el parámetro "CVDS"

   ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/166d394f-14f9-4169-909f-5a0e34e7c8dc)

- Ejecutar nuevamente la clase desde línea de comandos y verificar la salida: Hello World!

  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/5d936216-b1a6-48c4-bc11-a4214ded01c2)


- Ejecutar la clase desde línea de comandos enviando su nombre como parámetro y verificar la salida. Ej: Hello Pepito!

  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/f35f49e5-7aa1-4fa4-b5c1-55936b429a13)


- Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió?

  Como la función está definida para solo tomar el primer string del parámetro ingresado, solo toma el nombre.
  
  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/20743a69-bd3a-4d0e-a4a2-e923273039f4)


- Verifique cómo enviar los parámetros de forma "compuesta" para que el saludo se realice con nombre y apellido.

  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/39b11f2d-04a4-4d66-bf76-3b4aa3e36122)


- Ejecutar nuevamente y verificar la salida en consola. Ej: Hello Pepito Perez!

  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/ebd63623-939a-4644-aeb3-7e726bc703ec)

  
## HACER EL ESQUELETO DE LA APLICACIÓN
- Cree el paquete edu.eci.cvds.patterns.shapes y el paquete edu.eci.cvds.patterns.shapes.concrete.

  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/f38c0f92-a4c6-4566-859f-1955842618d3)

- Cree una interfaz llamada Shape.java en el directorio src/main/java/edu/eci/cvds/patterns/shapes

  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/520a8afc-6eee-4ea5-9791-89308da1c90a)

- Cree una enumeración llamada RegularShapeType.java en el directorio src/main/java/edu/eci/cvds/patterns/shapes

  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/ce66aa78-8a6a-4998-a37c-e8b027aceabd)

- En el directorio src/main/java/edu/eci/cvds/patterns/shapes/concrete cree las diferentes clases (Triangle, Quadrilateral, Pentagon, Hexagon), que implementen la interfaz creada y retornen el número correspondiente de vértices que tiene la figura.
  
  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/768f59bf-0d4c-4d29-8f47-2995ae3efb22)
  
  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/20091b0a-def0-4b5d-80f6-8f1cc9fcffda)
  
  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/1c23ea1f-da92-49c8-8973-7e551cbd5e53)
  
  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/8253f359-f129-45e0-870a-089089e3eaa3)

- Cree el archivo ShapeMain.java en el directorio src/main/java/edu/eci/cvds/patterns/shapes con el metodo main:

  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/6b925950-57f8-49a5-b82a-957a6a002020)

- Analice y asegúrese de entender cada una de las instrucciones que se encuentran en todas las clases que se crearon anteriormente. Cree el archivo ShapeFactory.java en el directorio src/main/java/edu/eci/cvds/patterns/shapes implementando el patrón fábrica, haciendo uso de la instrucción switch-case de Java y usando las enumeraciones.

  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/f8e7f4a6-4689-4082-8c36-c3712adab06b)
  
- ¿Cuál fábrica hiciste? y ¿Cuál es mejor?

  Realizamos la "simple factory"
  En este caso, es mejor utilizar la "simple factory", ya que todos los objetos se instancian de la misma manera, haciendo que utilizar otras fábricas resulte inncesario para este caso
  
 Simple Factory:

  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/c0119522-f331-4157-88e9-170162cba98d)
  
- Ejecute múltiples veces la clase ShapeMain, usando el plugin exec de maven con los siguientes parámetros y verifique la salida en consola para cada una:
  - Sin parámetros
    
    ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/e43c033c-bde4-4b3f-8cea-0959e061af50)

  - Parámetro: qwerty

    ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/a476efe5-b8ce-4135-a956-2b2776f706e1)

  - Parámetro: pentagon

    ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/74da7e2f-773d-4fad-adee-74761be1cf14)

  - Parámetro: Hexagon

    ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/b1819134-e64e-448b-b1c4-b37dffe15e16)
    
  - ¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?
    La única instrucción que se ejecuta y funciona correctamente es el parámetro "Hexagon", esto debido a que es el único que está escrito correctamente a como está definido en los casos del switch.




  


  


  






















