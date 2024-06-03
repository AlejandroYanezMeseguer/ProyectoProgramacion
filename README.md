¡¡¡IMPORTANTE!!!
Para comenzar primero deberemos importar las librerías necesarias para que el programa funcione de forma correcta.

Primero debemos ir arriba a la izquierda a los 3 puntos de configuración y le daremos al apartado de Project structure.
  

Una vez hagamos los pasos anteriores tendremos que seleccionar el apartado de librerías en el menú de la izquierda y le daremos al icono +, en el menú que sale deberemos darle a import from maven.
  

A continuación, saldrá el siguiente menú donde en el buscador buscaremos las siguientes librerías para el correcto funcionamiento de nuestro programa.
 

Librerías a importar:

1- com.fasterxml.jackson.core:jackson-databind:2.13.3

Nombre: fasterxml.jackson.core.databind

Version: 2.13.3
 

2- org.slf4j:slf4j-api:2.0.0

Nombre: slf4j.api

Version: 2.0.0
 

3- org.slf4j:slf4j-simple:2.0.0

Nombre: slf4j.simple

Version: 2.0.0
 
4- org.xerial:sqlite-jdbc:3.45.3.0

Nombre: xerial.sqlite.jdbc

Version: 3.45.3.0
 

Una vez importadas todas las librerías de forma correcta el programa ya funcionara de forma óptima.


1- Resumen general del proyecto.

	
 En este proyecto he tratado de hacer un pequeño juego de combate por turnos estilo pokemon con estética inspirada en Elden Ring.
	En el podremos elegir la clase de jugador con el que queremos combatir los cuales tienen estadísticas diferentes y elegir el nombre de nuestro jugador.
 

	

Y podremos ver en tiempo real las estadísticas de nuestros jugadores al pasar por encima de ellos para que nuestra elección sea más precisa al tipo de jugador que queremos para nuestra partida.

   

Una vez comenzada la partida podremos ver en tiempo real el nombre, la vida y que equipamiento tienen nuestros jugadores, así como el tipo de jugador que estamos utilizando.
 





También podremos cambiar de arma y escudo viendo en tiempo real como dicho equipamiento cambia, así como el nombre y estadísticas de cada arma y escudo para que nuestra elección sea lo más acorde a lo que nosotros queremos en ese momento.

   

También como es obvio en un juego de combate por turnos podremos atacar y ver en tiempo real como baja la barra de vida del jugador enemigo.
 

Por ultimo cuando un jugador gane saldrá una pantalla final que indicara el jugador que ha ganado.
   





2- Funcionamiento lógico básico del proyecto.

	
 En este apartado explicare el funcionamiento lógico de las funciones básicas de mi proyecto como por ejemplo la selección de personaje, los botones de ataque, el cambio de equipamiento etc.

¡¡IMPORTANTE!!
Todos los métodos mostrados a continuación son llamados desde una clase en la que mediante los mismos se crean todos los componentes gráficos del programa pasando por parámetro a los métodos los datos necesarios.

2.1- Selección de personaje.

El funcionamiento de este apartado se basa en 6 botones, estos botones lo que hacen es mediante un listener llaman a un método que contiene todas las funciones de este botón.
Entre estas funciones están la más importante que es la creación del jugador mediante un objeto y su barra de vida u otras funciones más básicas como deshabilitar el resto de botones para evitar bugs o borrar el resto de jugadores y sus barras de vida para evitar crear varios jugadores.
La creación de estos botones se crea gracias a un método al cual llamo para pasarle los parámetros necesarios para la correcta creación del botón:
	-Método que crea los botones y creación de los mismos.
  
-Método que escucha el listener con las acciones de cada botón (método ejemplo ya que hay uno para cada botón).
 

	
 2.2- Comenzar pelea.
 
	
 Esta función de nuevo la realiza un botón el cual mediante un listener llama a un método con las acciones del botón.
Este botón primero hace una validación para comprobar que los dos jugadores han elegido clase y le han puesto nombre a su jugador, para esta validación llama a un método que añade a un Array los correspondientes mensajes de error y os muestra por pantalla.
-Método que valida la selección y añade los mensajes de error.
 



-Mensajes de error.
 

Además de eso Este botón también se encarga de hacer invisible todo lo que estamos viendo y hacer visible en entorno de la pelea, así como pasarle el nombre que ha introducido el jugador a unas etiquetas para que lo muestren.
 

2.3-Ataque del jugador.

El ataque del jugador se crea gracias a un botón creado de la misma manera que todos los anteriores, en el método que escucha el listener de este botón lo primero que se hace es un if else con el que un número random creamos los ataques críticos de los jugadores consiguiendo así manejarlo con porcentajes.
Dentro de este if llamamos a los métodos de los jugadores atacar y recibir golpe con el que calculamos el daño que hace cada ataque y guardamos estos valores en una variable con la que más tarde se la pasaremos a la barra de vida para que baje la cantidad de vida exacta.
	-If else que crea los ataques críticos.
 
A continuación, mediante otro if detectaremos que la vida de un jugador a llegado a 0 y haremos invisible lo que estamos viendo y haremos visible el mensaje de jugador ganador correspondiente.
-If que muestra el jugador que ha ganado.
 

Todo lo anteriormente mencionado está dentro de un Switch donde mediante una condición haremos todas estas funciones para el jugador 1 o 2.
-Método completo con las funciones mencionadas.
 

Y por último les pondremos a la barra de vida los valores correspondientes de la vida para que esta baje al atacar.
-Asignamiento de valores a la barra de vida de los jugadores.
 

2.4- Cambio de equipamiento.

	
 El cambio de equipamiento se crea con un botón en el cual genera de forma dinámica mas botones con las armas que corresponden al jugador, esas armas se crean bajando las estadísticas desde una base de datos.
	También genera de forma dinámica los nombres y las estadísticas de las armas sincronizándose con la base de datos y gracias a la Api de elden ring la sincronizo en tiempo real con mi base de datos para bajarme las imágenes de las armas y guardarlas, en caso de que se pierda alguna volverá a guardarse y descargarse en local.
	Igual que en el botón de atacar este método tiene un switch para gracias a una condición detectar si debe cargar las armas y escudos del jugador uno y dos. 
	-Switch que crea las armas y escudos del respectivo jugador.
  
En las imágenes anteriores podemos ver como se llama a los métodos que crean tanto el equipo como sus estadísticas, su fondo y su nombre, para ello utilizamos un método con la siguiente estructura:
	-Estructura del método para las armas.
 

El método que podemos ver aquí arriba crea de forma dinámica 4 columnas de botones, para diferenciar los botones le damos el nombre de i+j para identificarlos con el mismo nombre que el arma a la que representan y se les asigna la imagen del gracias a la sincronización de la API con nuestra base de datos.


Para los escudos hacemos exactamente los mismo pero con una estructura un poco diferente ya que creamos 3 columnas de 3 en vez de 4 columnas de 4.
	-Estructura del método para los escudos.
 


2.5- Cambio de equipamiento 2.


 Como se ha podido ver en apartados anteriores cuando le damos a cambiar arma o escudo aparecen las imágenes de dicho equipamiento, estos botones creados de forma dinámica de la manera mencionada en el apartado anterior tienen la función de cambiar en tiempo real dicho equipamiento y que se muestre a su vez el equipo que has seleccionado.
	Para ello lo primero que debemos hacer es en la clase padre jugador unos métodos que develan las imágenes de las armas y de los escudos y que devuelva un ActionListener los cuales utilizaremos ya que al ser generados de forma dinámica a nivel de código son el mismo botón, pero necesitamos que cada uno haga una acción diferente.
	-Métodos que devuelven las imágenes de las armas, escudos y el listener.
 
	
Los métodos de que devuelven las imágenes los llamamos desde otro método llamado actualizarEquipo, en este método les ponemos la imagen correspondiente a los paneles que muestran las armas y los escudos seleccionados en tiempo real.
	-Método actualizarEquipo que actualiza la imagen que muestran los paneles de equipo seleccionado.
 
Por ultimo con el método del principio que devolvía un listener lo metemos en un método y lo llamamos desde donde se crea el jugador para crear un listener que escucha el método seleccioarEquipo, este método contiene el método actualizar equipo.
	-Ejemplo de cómo se utiliza todo lo anteriormente mencionado en un jugador (esto también se hace para los otros 5 jugadores).
 
