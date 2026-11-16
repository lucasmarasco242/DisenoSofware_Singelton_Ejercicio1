Ejercicio 1 - Configuración Inicial de la Aplicación

Explicación del programa

En este ejercicio se creó una clase llamada Configuracion que aplica el patrón Singleton para mantener una única instancia en toda la aplicación.
La clase tiene:
- Una variable estática privada llamada instancia.
- Dos atributos privados: clave y valor (ambos de tipo String).
- Un constructor privado para evitar que se creen objetos usando new.
- Un método estático público llamado getInstancia() que devuelve siempre la misma instancia.

Luego, dentro del método main, se obtienen dos referencias a la configuración:
Configuracion c1 = Configuracion.getInstancia();
Configuracion c2 = Configuracion.getInstancia();

Finalmente, se utiliza System.out.println() para comprobar que ambas referencias apuntan al mismo objeto y para mostrar los valores por consola.

Lógica utilizada

La lógica del programa consiste en:
- Crear la clase Configuracion con constructor privado.
- Verificar dentro de getInstancia() si el objeto ya existe; si es nulo, se crea una sola vez.
- Obtener la instancia desde dos variables distintas (c1 y c2) en el main.
- Comprobar que ambas son iguales y mostrar los parámetros cargados.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
¿Son la misma instancia?: true
Clave: idioma
Valor: español

Captura de pantalla

<img width="795" height="139" alt="image" src="https://github.com/user-attachments/assets/99cdc530-928a-486b-96e7-6509bcc2aa87" />
