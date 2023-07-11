# Proyecto JAVA master fulfillment course

# ¿Que son las Clases?
Las clases son templates para la creacion de objetos
un objeto es la instacia de una clase (an object is create by instantiating a class)
instancia y objeto son terminos interchangeable

# ¿Static field?
Cuando un valor es estatico se almacena en un lugar especial de la memoria, los valores son accesibles sin necesidad
de instanciar la clase.

# Static method vs Instance method
- los metodos estaticos se pueden acceder sin instanciar la clase
- los metodos instanciados solo se pueden acceder una vez se haya creado un objeto de esa clase.

# Java Array vs Java List

Un array es mutable, podemos establecer o cambiar valores en el array, pero no podemos cambiar su tamaño.

Java nos brinda varias clases que nos permiten agregar y eliminar elementos y cambiar el tamaño de una secuencia de elementos.
Se dice que estas clases implementan un **comportamiento de lista**.

> List es un tipo especial en Java, llamado Interfaz.
Una interfaz de list describe un conjunto de firmas de métodos que se espera que tengan todas las clases de list.

ArrayList es una clase que realmente mantiene un array en la memoria, que en realidad es más grande de lo que necesitamos, en la mayoría de los casos.

Realiza un seguimiento de la capacidad, que es el tamaño real del array en la memoria.

Pero también realiza un seguimiento de los elementos que se han asignado o configurado, que es del tamaño de ArrayList.

A medida que se agregan elementos a una ArrayList, es posible que su capacidad deba crecer. Todo esto sucede automáticamente, detrás de escena.
Esta es la razón por la cual ArrayList es redimensionable.