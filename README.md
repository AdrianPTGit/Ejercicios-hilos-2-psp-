# PSP: Unidad Didáctica 2 - Ejercicios

## Ejercicios para realizar en clase

### Bloque ejercicios 1

#### Ejercicio 1: Tic y Tac

**Objetivo:** Ejecutar un script Java que lance dos hilos.  
- Un hilo debe mostrar en pantalla de forma infinita la palabra **TIC**.  
- El otro hilo debe mostrar la palabra **TAC**.

**Instrucciones:**

1. Dentro del bucle de cada hilo, utiliza el método `sleep(milisegundos)` para que nos dé tiempo a ver las palabras que se visualizan cuando lo ejecutemos:
  ```java
   Thread.sleep(500);
```
2. Añade un bloque try-catch y captura la excepción InterruptedException.

3. Desde la función public static void main(String args[]) inicia la ejecución de ambos hilos y comprueba su resultado.

### Pregunta de reflexión:

- ¿Se visualizan los textos TIC y TAC de forma ordenada (es decir: TIC TAC TIC TAC TIC TAC...)?
