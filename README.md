# Gestor de Gastos Personales

Aplicación de consola hecha en Java que permite registrar y controlar los gastos personales. Fue desarrollada con ayuda de un asistente de IA (Claude) como parte de la actividad de la asignatura Herramientas Avanzadas para el Desarrollo de Aplicaciones (102HAD1), UTLA.

## Funcionalidades

1. **Agregar gasto:** registra descripción, monto y categoría.
2. **Listar gastos:** muestra todos los gastos con su número de id.
3. **Eliminar gasto:** borra un gasto indicando su id.
4. **Ver total:** calcula la suma de todos los gastos registrados.

El programa también valida los datos: no acepta letras donde se piden números ni montos menores o iguales a cero.

## Tecnologías

- Java (JDK 25)
- Visual Studio Code
- Git y GitHub

## Estructura del proyecto

```
gestor-gastos/
├── src/
│   ├── Gasto.java         # Clase que representa un gasto
│   ├── GestorGastos.java  # Lógica: agregar, listar, eliminar y total
│   └── Main.java          # Menú principal en consola
├── .gitignore
└── README.md
```

## Cómo ejecutarlo

1. Tener instalado el JDK 17 o superior.
2. Clonar el repositorio:
   ```
   git clone https://github.com/TU-USUARIO/gestor-gastos.git
   cd gestor-gastos
   ```
3. Compilar y ejecutar desde la terminal:
   ```
   javac src/*.java
   java -cp src Main
   ```
   O abrir la carpeta en VS Code (con Extension Pack for Java) y ejecutar `Main.java`.

## Cómo usé la IA

Usé Claude como asistente de programación. Le pedí una estructura de proyecto sencilla y la revisé antes de aceptarla. Luego desarrollé el código por partes (primero `Gasto`, después `GestorGastos` y al final `Main`), pidiéndole explicaciones de cada una. Probé cada funcionalidad en la terminal, incluyendo datos inválidos, para comprobar que el programa no se cayera.

Ejemplos de instrucciones que le di:

- *"Quiero un módulo sencillo, que se pueda hacer en VS Code y que cumpla todos los pasos del documento."* La IA propuso un gestor de gastos con tres clases; revisé la estructura y la acepté porque separa los datos, la lógica y el menú.
- *"Dame un ejemplo de cómo agregar 3 gastos."* Usé el ejemplo como guía para probar y luego cambié los datos por los míos para las capturas.

Entiendo el código entregado y puedo explicar cada una de sus partes.