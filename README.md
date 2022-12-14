# (Tarea 3) Pruebas con JUnit
Autor: Tomás Joaquín Barber Villalobos

## Requisitos
- Es necesario tener instalado Gradle en su computador
- Clonar el repositorio utilizando en una terminal/consola:
```
git clone https://github.com/tomineitor/software-tests-2.git
```
Y luego acceder a la carpeta del proyecto:
```
cd software-tests-2
```

## Cómo usar: el programa
Para ejecutar el programa como tal (el sistema de registro y acceso de libros), primero debe asegurarse de que se encuentra en 
la carpeta del proyecto ("software-tests-2").
Una vez esté en la carpeta, ejecutar el comando:
```
gradle run --console=plain
```
Y con esto el programa se ejecutará en la consola.

## Cómo usar: las pruebas
Nuevamente, asegurarse de estar en la carpeta del proyecto ("software-tests-2").
Una vez en la carpeta, ejecutar el comando:
```
gradle test
```
Una vez ejecutadas las pruebas, se generará un archivo (index.html) donde se encontrará un reporte respecto a las pruebas ejecutadas en la siguiente ubicación:
```
software-tests-2\app\build\reports\tests\test\index.html
```
