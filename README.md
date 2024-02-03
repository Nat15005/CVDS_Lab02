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
  Buscar cómo se crea un proyecto maven con ayuda de los arquetipos (archetypes).
  Busque cómo ejecutar desde línea de comandos el objetivo "generate" del plugin "archetype", con los siguientes parámetros:
  1. 
  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/a6b13ca8-6180-48cf-81fe-484a3e3deb3e)
  2. 
  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/38a06a97-5fa8-4851-8900-f7f8c2b1fb5a)
  3.
  ![image](https://github.com/Nat15005/Lab02---CVDS/assets/111907712/21da0d8d-2cad-4156-890a-c4f370d629df)



