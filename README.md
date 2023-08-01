Universidad Politécnica Salesiana
Descripción del Proyecto
Este proyecto tiene como objetivo desarrollar un programa para gestionar una lista de contactos telefónicos. Cada contacto está compuesto por un nombre, un número de teléfono, una colección de correos electrónicos y un diccionario que almacena las redes sociales del contacto.

El programa utiliza un árbol binario de búsqueda para almacenar y gestionar los contactos, lo que permite realizar operaciones de inserción, búsqueda y eliminación de forma eficiente y mantener los contactos ordenados.

Estructura del Proyecto
ArbolContacto
Implementa todas las operaciones necesarias para manejar una lista de contactos utilizando un árbol binario de búsqueda. Permite la inserción de nuevos contactos en orden, eliminación de contactos específicos y realiza recorridos en el árbol (inorden, preorden, postorden) para obtener los contactos ordenados de diferentes maneras. Además, proporciona métodos para verificar si el árbol está balanceado y calcula la altura del árbol. También incluye la funcionalidad para agregar direcciones de correo electrónico y enlaces de redes sociales a los contactos existentes, por lo que está colocada dentro del paquete controlador.

Contacto
Proporciona una estructura de datos simple pero efectiva para almacenar y gestionar información sobre un contacto, incluyendo su nombre, número de teléfono, correos electrónicos y perfiles de redes sociales. Es una base sólida para implementar una lista de contactos más completa y funcional en una aplicación más amplia.

Nodo
La clase Nodo es una pieza fundamental para construir un árbol binario de búsqueda que almacena objetos de la clase Contacto. Cada objeto de tipo Nodo contiene un objeto de tipo Contacto y referencias a sus nodos hijos izquierdo y derecho. Estas referencias permiten la organización jerárquica de los contactos en el árbol y facilitan la realización de operaciones de búsqueda, inserción y eliminación de manera eficiente.

Main (ProyectoInterciclo_EstructuraDeDatos)
Clase principal que contiene el punto de entrada del programa y se encarga de interactuar con el usuario a través de una interfaz sencilla para interactuar con un árbol binario de búsqueda que almacena contactos. Permite agregar, buscar, eliminar y modificar información de los contactos, además de realizar diferentes tipos de recorridos del árbol y obtener estadísticas como el número de contactos y niveles del árbol.

Explicación de Métodos dentro de la Clase ArbolContacto
Insertar
La inserción en un árbol binario de búsqueda se hace de forma recursiva, comparando el valor del nuevo elemento con los valores de los nodos existentes y colocándolo en el subárbol adecuado para mantener el orden. Los valores menores se colocan a la izquierda y los valores mayores a la derecha en cada nodo. Así, se garantiza que el árbol esté ordenado y optimizado para búsquedas eficientes.

inOrderRecursivo
Realiza un recorrido inorden (inorder traversal) recursivo en un árbol binario de búsqueda. En este tipo de recorrido, se visitan los nodos en el siguiente orden: primero el subárbol izquierdo, luego el nodo actual y finalmente el subárbol derecho.

postOrderRecursivo
Realiza un recorrido postorden (postorder traversal) recursivo en un árbol binario de búsqueda. En este tipo de recorrido, se visitan los nodos en el siguiente orden: primero los subárboles izquierdo y derecho y luego el nodo actual.

preOrderRecursivo
Realiza un recorrido en preorden (preorder traversal) recursivo en un árbol binario de búsqueda. En este tipo de recorrido, se visita el nodo actual primero, luego se recorren los subárboles izquierdo y derecho.

printTreeNode
Es una función que imprime de manera visual la estructura de un árbol binario de búsqueda. La representación muestra los nodos del árbol junto con las conexiones entre ellos para visualizar la jerarquía y la disposición de los elementos en el árbol.

getRoot
Es una función que devuelve el nodo raíz del árbol binario de búsqueda. La raíz es el nodo principal del árbol desde donde comienza toda la estructura y se puede acceder a todos los demás nodos del árbol mediante navegación.

estaBalanceado
Es una función que verifica si el árbol binario de búsqueda está balanceado o no. Un árbol se considera balanceado si la diferencia de alturas entre su subárbol izquierdo y derecho no excede una unidad. Si la diferencia de alturas en algún punto del árbol es mayor que uno, entonces el árbol no está balanceado.

obtenerAltura
Es una función recursiva que calcula la altura de un subárbol en un árbol binario de búsqueda. La altura de un subárbol se define como la cantidad de niveles que tiene dicho subárbol, es decir, la longitud del camino más largo desde la raíz hasta una hoja en el subárbol.

eliminarContacto
Es una función que permite eliminar un contacto del árbol binario de búsqueda por su nombre. Además, se utiliza un método auxiliar eliminarContactoRec(Nodo nodo, String nombre) para realizar la eliminación de manera recursiva en el árbol.

encontrarMinimo
Es una función que busca y devuelve el nodo con el valor mínimo (el sucesor más pequeño) en un subárbol. Es específicamente utilizado para encontrar el nodo sucesor más pequeño en el subárbol derecho de un nodo dado, que se utiliza en el caso 2 de eliminación cuando se quiere eliminar un nodo con dos hijos.

agregarCorreo
Permite agregar un correo electrónico a un contacto específico en el árbol binario de búsqueda. El método primero busca el contacto con el nombre proporcionado (nombre) y, si lo encuentra, agrega el correo electrónico proporcionado (correo) a la lista de correos electrónicos del contacto. Si no se encuentra el contacto, se muestra un mensaje indicando que el contacto no fue encontrado.

agregarRedSocial
Permite agregar una red social con su correspondiente URL a un contacto específico en el árbol binario de búsqueda. El método primero busca el contacto con el nombre proporcionado (nombre) y, si lo encuentra, agrega la red social y su URL proporcionadas (redSocial y url) al mapa de redes sociales del contacto. Si no se encuentra el contacto, se muestra un mensaje indicando que el contacto no fue encontrado.

buscarContacto
Permite buscar un contacto en el árbol binario de búsqueda por su nombre utilizando el método auxiliar buscarContactoRecursivo(Nodo nodo, String nombre) que realiza la búsqueda de manera recursiva en el árbol y devuelve el nodo que contiene el contacto si es encontrado, o null si no se encuentra el contacto con el nombre especificado.

getNumeroContactos
Permite obtener el número total de contactos en el árbol binario de búsqueda utilizando el método auxiliar obtenerNumeroContactosRecursivo(Nodo nodo) que realiza el cálculo de manera recursiva contando los contactos en cada nodo y sumándolos en el árbol completo.

getNumeroNiveles
Permite obtener el número total de niveles del árbol binario de búsqueda utilizando el método auxiliar obtenerNumeroNivelesRecursivo(Nodo nodo) que calcula de manera recursiva la altura del árbol contando los niveles en cada subárbol y determinando el máximo entre las alturas de los subárboles izquierdo y derecho para obtener el número total de niveles del árbol.

imprimirAnchura
Realiza el recorrido por niveles del árbol binario de búsqueda y muestra los contactos almacenados en el árbol en el orden en que se visitan, comenzando desde la raíz y avanzando nivel por nivel.

Código Principal (Main)
El código principal del programa se encuentra en la clase ProyectoInterciclo_EstructuraDeDatos. Esta clase contiene el método main que es el punto de entrada del programa y se encarga de interactuar con el usuario a través de una interfaz de texto simple.

El programa utiliza un objeto ArbolContactos para gestionar los contactos y un objeto VistaContactos para mostrar mensajes y leer la entrada del usuario. El bucle principal permite al usuario seleccionar diferentes opciones, como agregar un nuevo contacto, buscar contactos, eliminar contactos y realizar diversos tipos de recorridos en el árbol de contactos. El bucle se ejecuta hasta que el usuario elige la opción para salir del programa.

Clase ArbolContactos
La clase ArbolContactos implementa todas las operaciones necesarias para manejar una lista de contactos utilizando un árbol binario de búsqueda. Los contactos se insertan en el árbol manteniendo el orden alfabético por nombre. La clase también proporciona métodos para buscar y eliminar contactos, así como para realizar recorridos en el árbol y mostrar los contactos en diferentes órdenes.

Clase Contacto
La clase Contacto representa un contacto individual y almacena su nombre, número de teléfono, una lista de correos electrónicos y un mapa de redes sociales. La clase proporciona métodos para agregar correos electrónicos y redes sociales a un contacto.

Clase Nodo
La clase Nodo es una parte esencial del árbol binario de búsqueda y almacena un objeto de tipo Contacto y las referencias a sus nodos hijos izquierdo y derecho. Los nodos permiten la organización jerárquica de los contactos en el árbol y facilitan las operaciones de búsqueda, inserción y eliminación de manera eficiente.

Clase VistaContactos
La clase VistaContactos se encarga de la interfaz con el usuario, mostrando mensajes y leyendo la entrada del usuario. Proporciona métodos para mostrar el menú de opciones, leer nombres y números de teléfono de nuevos contactos, leer correos electrónicos y redes sociales para agregar a un contacto y mostrar mensajes en pantalla.

Este README.md proporciona una descripción general del proyecto, la estructura del mismo y una explicación detallada de los métodos utilizados en la clase ArbolContactos. El código proporcionado está diseñado para gestionar una lista de contactos telefónicos utilizando un árbol binario de búsqueda, permitiendo realizar operaciones de inserción, búsqueda y eliminación de forma eficiente. Además, se proporciona una interfaz de texto simple para interactuar con el programa y realizar diversas acciones sobre los contactos almacenados en el árbol.





