# CUPON MELI

Este proyecto se ha desarrollado con el fin de resolver la prueba técnica creada por MercadoLibre para evaluar 
mis condiciones técnicas en el lenguaje Java 1.8, Springboot.

## Tabla de contenido

- [inicio](#inicio)
  - [prerequisitos](#prerequisitos)
  - [clone](#clone)
  - [configuración](#configuracion)
  - [jar](#jar)

## Inicio

### Prerequisitos
* Git
* JDK 8 o mayor
* Gradle-7.1.1 o mayor

### Clone
para iniciar se puede clonar el proyecto en:
```
git clone <<pendinente>>
cd cupon
```

### Configuracion
En este proyecto no se está utilizando ningúna configuración diferente a las predefinidas por el framework de Springboot, dado caso que se requiera agregar nuevas configuraciones se hará en el archivo de configuración ubicado en `src/resources/application.properties`.


### JAR

para ejecutar este jar, se puede usar el siguiente comando
```
./gradlew bootRun
```
o puede construir el ejecutable jar con el comando
```
./gradlew build
```
y si se construye correctamente, puede correrlo con este comando
```
java -jar build/libs/cupon-0.0.1-SNAPSHOT.jar
```

estos comandos son enfocados en el uso del wraaper que viene en el proyecto, si desea hacerlo con el gradle de su compudator puede remplazar `./gradlew` con solo el uso del comando `gradle`
