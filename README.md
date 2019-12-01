# Pokemon APP
Proyecto de Ingeniería de Software. Equipo D. Diana Barboza, Juan Caro, Caleb Villalba y Leonardo Monsalvo.

## 1. Análisis de Requerimientos

### 1.1. Visión del Proyecto

Durante este proyecto se pretende crear una réplica del famoso juego de batallas por turno “Pokémon” llamada “PokémonApp” utilizando todos los conocimientos adquiridos durante el curso de Ingeniería de Software. Para esto se eligió como herramienta de desarrollo “Android Studio” para realizar una app con las características del juego.
Para esto se utilizará una API que contiene la información necesaria para modelar un sistema de juego llamada “PokéApi” ( https://pokeapi.co/ ), de la cual se realizarán las peticiones requeridas para esto.

### 1.2. Requerimientos de usuario 

1. La aplicación es exclusiva solo para Android nativo (ANDROID).
2. Los colores de interfaz serán fieles a los de Pokémon.
3. La aplicación debe ser intuitiva para el usuario.

### 1.3. Requerimientos de sistema 

1. Se realizará una copia de los datos en nuestros servidores para evitar inconvenientes con los servidores de la API.
2. El aplicativo seleccionará aleatoriamente al oponente por medio de la identificación de cada Pokémon.
3. La aplicación debería ser capaz de hacerle un seguimiento a las estadísticas de cada Pokémon y desglosarlas a la interfaz de usuario.
4. Desplegará una comparación de cada Pokémon seleccionado.

### 1.4. Requerimientos no funcionales 

1. La aplicación estará corriendo sobre los servidores de la universidad, por lo cual no podrá ser usado con ánimos de lucro.
2. La aplicación estará disponible para cualquier tipo de público, no poseerá restricciones de ningún tipo comercial.
3. El uso de peticiones a la API debe ser moderado.

## 2. Diseño

### 2.1. Diseño de las pantallas
Se encuentra en Marvel App en el siguiente link: https://marvelapp.com/jb42ff9

### 2.2.  Modelado del sistema 

Con el diseño anterior se pudo validar con el cliente la estructura del programa. Es pertinente decir que, para cada una de estas pantallas, se especificó cómo debería ser la gestión de los datos. Esto es, qué elementos se van a ir trayendo de la API y cuáles se almacenarán de manera local en el dispositivo móvil. Esta descripción se detalla a continuación enumerados segpun la pantalla a la que corresponde.

1.	Se hará uso de guardado de variables locales para que el usuario una vez preparada la interfaz pueda guardar su nombre de usuario o nickname, acompañado de un background e imágenes tomadas de la API.
2.	Se deberá tener en cuenta los permisos de administrador en esta pantalla, puesto que es necesario que el usuario otorgue permisos como: micrófono y sonido. Son datos de tipo local que el usuario tendrá derecho a modificar, adicionalmente estará suministrada información acerca del juego.
3.	Se necesitará como recursos los sprites que representen cada elemento de un Pokémon, en este caso 8 y también se necesita la información de los elementos, se reitera que esto se obtiene por medio de la API (type:"https://pokeapi.co/api/v2/type/")
4.	Teniendo información de la API guardada en esta pantalla solo es necesario desplegar todos los sprites que pertenezcan a los Pokémon de tipo hierba, por lo que se corresponde hacer una petición de todos los sprites ("grass" "https://pokeapi.co/api/v2/type/12/")
En este punto cabe resaltar que se ha ejemplificado con una pantalla para los Pokémon de tipo hierba. Existirá una pantalla con los datos para cada tipo de Pokémon que se mostrará de acuerdo a la selección del jugador.
5.	Con base a la lista de sprites (Pokémons seleccionados), el usuario habrá escogido a uno de la lista y con base a la selección se hará una petición encargada de desplegar la información con respecto al Pokémon seleccionado.
6.	La búsqueda del oponente será al azar y la pantalla deberá usar la información guardada de la petición anterior con respecto al Pokémon que haya resultado.
7.	En este punto, se mostrará el Pokémon oponente seleccionado aleatoriamente y se podrá visualizar información acerca del mismo tomada de API.
8.	En pantalla se desplegará el formato VS del sprite seleccionado por el usuario y el sprite escogido al azar. Aquí ya la información (nombre) y los sprites de estos dos Pokémon se encuentra localmente.
9.	La nueva petición se basa en los campos de batalla, se requiere información de la API para determinar cuáles son los campos de batalla de los Pokémon y características de cada terreno. (https://pokeapi.co/api/v2/location/)
10.	Aquí se desarrolla la batalla. Se necesita la información sobre los poderes/habilidades de cada Pokémon y qué tanto afecta cada una de estas a su oponente (viene de la API), de manera que se puedan ir modificando los niveles de vida.
11.	En la pantalla final con base a la información recolectada anteriormente, mostramos el Pokémon ganador, el usuario o nickname asignado y guardamos datos locales como lo son las puntuaciones de la batalla Pokémon

Con estas especificaciones se propuso un diseño orientado a objetos que se puede modelar como se observa la siguiente imagen.
 
![GitHub Logo](/ClassDiagram.jpeg)

Además, se diseñó el flujo del sistema de juego a partir del siguiente diagrama.
![GitHub Logo](/FlowChart.jpg)
### 2.2. Gestión del proyecto

Como se describió antes, se usa Android Studio como entorno de desarrollo, el cual se sincroniza con este repositorio. Se utiliza la plataforma para compartir los archivos necesarios para la elaboración de la app además de coordinar las entradas al repositorio de esta. El equipo deberá evaluar las sugerencias de cambio al código antes de unirlas a la rama principal del proyecto.  Esta metodología permitió que los integrantes del equipo en todo momento tuvieran claridad de en qué etapa estaba el proyecto, además de facilitar la asignación de tareas y seguimiento al cumplimiento de las mismas, evidenciando así una metodolodía ágil a travpes de un tablero KANBAN. [https://github.com/LeoM98/Pokemon/projects/1]

## 3. Implementación

### 3.1. Avance 

Los requerimientos no han sido satisfechos en su totalidad. Aunque se han solucionado varios problemas desde el último avance, la entrega no es completa debido a inconvenientes que se detallan en el apartado 3.2. Aun así, se puede hacer un listado de objetivos alcanzados. 

- Levantamiento de requerimientos
- Diseño del aplicativo
- Establecimiento de estrategia de gestión
- Validación del diseño del aplicativo
- Pasar de diseños a Layout en Android Studio
- Conexión de flujo entre pantallas
- Captura del nombre del usuario

Lo que queda pendiente son ciertas funcionalidades del juego Pokémon como el sistema de combates por turno y la lógica de los ataques y los tipos de Pokémon, además de la creación del perfil del jugador.

### 3.2. Problemas / Obstáculos

Los problemas principales que se presentaron fueron debido a la impericia de los integrantes del equipo con la manipulación de la herramienta Android Studio. Hubo dificultades durante el proceso de instalación y virtualización del programa. Por lo que tuvimos que acudir a videos tutoriales para poder adherir práctica y poder hacer un trabajo bien detallado y presentable. Más recientemente se han tenido dificultades con las peticiones a la API, por lo que no se ha podido concluir el proyecto. Se espera dar solución a este último problema con prontitud.
