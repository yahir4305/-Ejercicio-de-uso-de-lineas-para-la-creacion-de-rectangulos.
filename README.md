# Ejercicio de uso de líneas para la creación de rectángulos.
![image](https://user-images.githubusercontent.com/90071108/132076659-4378c9a0-0b66-48d4-aba4-25d189fda45e.png)


Lo primero que hacemos es importar las librerías que utilizaremos para crear nuestro programa, las cuales serán mostradas a continuación.

![image](https://user-images.githubusercontent.com/90071108/132072374-41a2b595-9eab-4276-b544-aaa286486454.png)

# Clase ejercicio_2_.

En esta parte creamos nuestra clase Ejercicio_2_, la cual es implementada de GLEventListener, en la cual creamos nuestras variables las cuales serán utilizadas a lo largo del programa. 

![image](https://user-images.githubusercontent.com/90071108/132074579-15b1f789-5320-4857-bc7f-5bf87520cd06.png)

# Método Main

En esta parte del código creamos nuestro método main dentro de este método encontraremos las características de nuestra pantalla, de la misma manera realizamos la implementación de un hilo el cual nos permitirá detener la animación que presenta nuestro programa al momento de cerra la venta que nos aparece al momento de compilar el programa.

![image](https://user-images.githubusercontent.com/90071108/132075333-a0fb0bc5-c9a8-46c7-857a-a9ddda83a0cb.png)
![image](https://user-images.githubusercontent.com/90071108/132075372-255acb93-f587-4a8b-94e4-1bb3b0d6e8c3.png)

 # Método init


En esta parte de nuestro código podemos observar el método llamado init en el cual realizamos la inicialización de los gráficos de OpenGL los cuales serán utilizados en nuestro programa. Se muestran a continuación.


![image](https://user-images.githubusercontent.com/90071108/132075449-5a652390-39aa-4907-90ae-7226837954f2.png)


 # Método reshape

En esta parte del código podemos observar el método reshape, podemos darnos cuenta que este método se encuentra vacío, esto se debe a que nuestro programa no lo necesita. 

![image](https://user-images.githubusercontent.com/90071108/132075840-f8064731-54d0-4975-9cb8-0db9e98b348f.png)

# Método display

En este método llamado display en este método hacemos uso de nuestro ciclo repetitivo for en donde inicializamos una variable de tipo int la cual tiene un valor de cero,
donde decimos que si (  i < freame.getHeight () / largo ; i ++ ),  en el interior de nuestro ciclo se encuentran nuestras coordenadas la cuales servirán para poder crear la figuras y esto funciona de la siguiente manera cada que se repite el ciclo for se aumenta el valor de i. 


![image](https://user-images.githubusercontent.com/90071108/132075965-1363f45b-b268-4414-b21f-65702ed01519.png)

# Método displayChanged

En este método como podemos observar no contiene nada, esto se debe a que nuestro programa no lo necesita.

![image](https://user-images.githubusercontent.com/90071108/132076420-4225f4d2-b4c9-4086-8f68-ada68a9cc783.png)



