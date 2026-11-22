SISTEMA DE VENTAS
Proyecto Ordinario - Programación Orientada a Objetos

Alumno: [nombre]
Grupo:  [grupo]

------------------------------------------------------------
REQUISITOS
------------------------------------------------------------
- JDK 17 o superior.
- Eclipse IDE for Java Developers (incluye soporte Maven / m2e).
- Conexión a internet la PRIMERA vez que se importa el proyecto:
  Maven descarga las dependencias (sqlite-jdbc y FlatLaf, ~13 MB).

------------------------------------------------------------
ABRIR Y EJECUTAR EN ECLIPSE
------------------------------------------------------------
1. Extraer el .zip.
2. File > Import > Maven > Existing Maven Projects > Next.
3. En "Root Directory" seleccionar la carpeta extraída > Finish.
4. Esperar a que termine la descarga de dependencias
   (barra de progreso en la esquina inferior derecha).
5. Abrir src/main/java/mx/utm/ventas/Main.java
   > clic derecho > Run As > Java Application.

Si el proyecto aparece con errores tras importarlo:
clic derecho sobre el proyecto > Maven > Update Project (Alt+F5).

Nota: no crear un "Java Project" nuevo apuntando a la carpeta;
Eclipse ignoraría el pom.xml y no encontraría las librerías.

------------------------------------------------------------
BASE DE DATOS
------------------------------------------------------------
- Se usa SQLite: no hay que instalar ningún servidor.
- El archivo ventas.db se crea automáticamente en la carpeta del
  proyecto la primera vez que se ejecuta, con todas sus tablas.
- Para empezar desde cero, basta con borrar ventas.db.

------------------------------------------------------------
ESTRUCTURA DEL CÓDIGO (src/main/java/mx/utm/ventas)
------------------------------------------------------------
- modelo/  Clases del diagrama UML (Cliente, Producto, Venta, ...).
- dao/     Acceso a la base de datos (ConexionBD y clases Registro*).
- vista/   Interfaz gráfica en Swing con el tema FlatLaf.
- Main     Punto de entrada.

El diagrama UML se encuentra en la carpeta docs/.
