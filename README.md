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
  El proceso de construcción en Maven se divide en ciclo de vida de construcción, fases (Phases) y objetivos (Goals). Un ciclo de vida de la construcción se compone de una serie de fases de construcción, y cada fase de construcción se compone de una serie de objetivos.
  #### 4. Para qué sirven los plugins
  Los plugins son componentes de software que proporcionan funcionalidades adicionales a Maven. Los plugins permiten extender y   personalizar el comportamiento de Maven. Pueden realizar tareas como la compilación, ejecución de pruebas, generación de        informes, despliegue, entre otros. Maven utiliza plugins para ejecutar las diversas fases del ciclo de vida del proyecto.
  #### 5. Qué es y para qué sirve el repositorio central de maven
Maven es una herramienta para crear aplicaciones y, también, proporciona un repositorio para contener artefactos a los que desea que acceda la aplicación.
El repositorio de Maven (o repositorio central) tiene una estructura que permite que los archivos como, por ejemplo, archivos JAR tengan versiones distintas que se descubren después fácilmente con un mecanismo de denominación bien conocido. A continuación, las herramientas de creación pueden utilizar estos nombres para extraer dinámicamente las dependencias de la aplicación. En la definición de la aplicación que se denomina archivo POM, cuando se utiliza Maven como una herramienta de compilación, simplemente denomine las dependencias y el proceso de compilación sabrá qué hacer a partir de ahí.

## EJERCICIO DE LAS FIGURAS
### CREAR UN PROYECTO CON MAVEN
  - Buscar cómo se crea un proyecto maven con ayuda de los arquetipos (archetypes).
  - Busque cómo ejecutar desde línea de comandos el objetivo "generate" del plugin "archetype", con los siguientes parámetros:
  
  1. 
  
  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/a6b13ca8-6180-48cf-81fe-484a3e3deb3e)
  2. 
  
  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/38a06a97-5fa8-4851-8900-f7f8c2b1fb5a)
  
  3.
  
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

  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/c7e62ed1-9f9c-4317-9dbc-e92f4ab39998)

- Realice el cambio en la clase App.java para crear un saludo personalizado, basado en los parámetros de entrada a la aplicación.
- Utilizar la primera posición del parámetro que llega al método "main" para realizar elsaludo personalizado, en caso que no sea posible, se debe mantener el saludo como se encuentra actualmente:
- Buscar cómo enviar parámetros al plugin "exec".

 1. Modificamos el .app
    
    ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/19d34654-f1f8-4b69-9803-b34e0f5d012b)


2. Compilamos
   
   ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/2d9efcf3-3594-47ee-aca5-57a92d22bd66)
   
3. Ejecutamos con parametrosssss

   ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/166d394f-14f9-4169-909f-5a0e34e7c8dc)

- Ejecutar nuevamente la clase desde línea de comandos y verificar la salida: Hello World!

  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/1d2f5296-f904-44d8-b4f1-96597042c8b1)

- Ejecutar la clase desde línea de comandos enviando su nombre como parámetro y verificar la salida. Ej: Hello Pepito!

  

- Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió?
  
  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/28ebc844-959e-4c15-a1e3-127bcf31c3ab)


- Verifique cómo enviar los parámetros de forma "compuesta" para que el saludo se realice con nombre y apellido.

  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/39b11f2d-04a4-4d66-bf76-3b4aa3e36122)


- Ejecutar nuevamente y verificar la salida en consola. Ej: Hello Pepito Perez!

  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/96dc1aee-6ffb-47d5-8c40-abfb8e1b5059)
  














