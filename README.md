# CUPON MELI

Este proyecto se ha desarrollado con el fin de resolver la prueba técnica creada por MercadoLibre para evaluar 
mis condiciones técnicas en el lenguaje Java 1.8, Springboot.

## Tabla de contenido

- [inicio](#inicio)
  - [prerequisitos](#prerequisitos)
  - [clone](#clone)
  - [configuración](#configuracion)
  - [jar](#jar)
- [como funciona](#como-funciona)
  - [Nivel 1](#nivel-1)
  - [Nivel 2](#nivel-2)
  - [Nivel 3](#nivel-3)

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

Nota: este solo ejecutará el microservicio Springboot.
estos comandos son enfocados en el uso del wraaper que viene en el proyecto, si desea hacerlo con el gradle de su compudator puede remplazar `./gradlew` con solo el uso del comando `gradle`


## Como funciona

Dentro de este aplicativo se encotnrarán las dos funcionalidades de la prueba, funcionando para ejecutarlas se deben seguir los pasos que se mencionan a continuación

### Nivel 1
para el nivel 1 donde se solicita una aplicación java que contenga un funcionamiento lógico con un método que se exprese de la siguiente manera:

```
List<String> calculate(Map<String, Float> items, Float amount)
```

Se dejó un ejecutable con el nombre `Nivel1.java` que se podrá encontrar en el folder principal `com.meli.cupon` al ejecutarse, usará el ejemplo dado en el documento para mostrar el funcionamiento del método `calculate()`.

### Nivel 2
para el nivel 2 actualmente se tiene desarrollado un servicio que ejecuta el proceso con datos enviados en el servicio es decir:
/cupon POST requiere en el body de un json que esté formado de la siguiente manera:

```
"item_ids": [
    {"id":"MLA1",     "amount":100    },
    {"id":"MLA2",     "amount":210    },
    {"id":"MLA3",     "amount":260    },
    {"id":"MLA4",     "amount":80     },
    {"id":"MLA5",     "amount":90     }
],
"amount": 500
}
```

localmente puede ser probado de la siguiente manera:

```
curl -X POST -H "Content-Type: application/json" -d '{
"item_ids": [
    {
    "id":"MLA1", 
    "amount":100
    },
    {
    "id":"MLA2", 
    "amount":210
    },
    {
    "id":"MLA3", 
    "amount":260
    },
    {
    "id":"MLA4", 
    "amount":80
    },
    {
    "id":"MLA5", 
    "amount":90
    }
],
"amount": 500
}' http://localhost:8080/cupon
```

### Nivel 3
Teniendo en cuenta la explicación del Nivel 2, el único cambio es la url a la que se debe apuntar que en este caso sería:
`http://melicupon-env.eba-ntgtsuik.us-east-2.elasticbeanstalk.com/cupon`