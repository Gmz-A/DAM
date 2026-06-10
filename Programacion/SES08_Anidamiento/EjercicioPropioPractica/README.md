------
Eres el programador de un instituto y te piden que crees un programa que, dada la nota numérica de un estudiante (de 0 a 10), determine:
------
Si el alumno ha aprobado o suspenso.

En caso de haber aprobado, qué calificación en letra le corresponde:

5–6 → Suficiente  |  7–8 → Notable  |  9–10 → Sobresaliente

En caso de haber suspenso, indicar si la nota está cerca del aprobado (nota ≥ 3) o si es una nota muy baja (nota < 3).

El programa debe pedirle al usuario que introduzca la nota y mostrar por pantalla un mensaje claro con el resultado.

------
## Pautas a seguir
------
1. Usa un if / else principal para separar aprobado (nota ≥ 5) de suspenso (nota < 5).
2. Dentro de la rama de aprobado, añade otro bloque if / elif / else anidado para distinguir entre Suficiente, Notable y Sobresaliente.
3. Dentro de la rama de suspenso, añade otro if / else anidado para diferenciar si la nota es ≥ 3 o < 3.
4. Lee la nota con input() y conviértela a número (puedes usar float() o int()).
5. Muestra los resultados con print() usando mensajes descriptivos, por ejemplo:
    "Aprobado ✓ — Calificación: Notable"
6. Reto extra (opcional): comprueba al principio que la nota está entre 0 y 10. Si no lo está, muestra un mensaje de error antes de entrar en la lógica principal.