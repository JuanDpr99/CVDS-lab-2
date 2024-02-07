<h1 align="center">CVDS-lab-2</h1>

## OBJETIVOS
1. Entender qué es Maven
2. Usar comandos de generación de arquetipos, compilación y ejecución de un proyecto usando Maven
3. Obtener puntos adicionales por PR qué corrijan o mejoren los laboratorios

## LA HERRAMIENTA MAVEN :hammer:
Ingresar a la página de la herramienta [Apache Maven](https://maven.apache.org/what-is-maven.html) y entender:
- Cuál es su mayor utilidad
    -  Rta:  
- Fases de maven
    -  Rta:
- Ciclo de vida de la construcción
    -  Rta:
- Para qué sirven los plugins
    -  Rta: Los plugins en Maven permiten extender o personalizar el comportamiento del ciclo de vida de construcción al agregar nuevas metas (goals) y configuraciones específicas. Algunos ejemplos de funcionalidades que pueden ser proporcionadas por plugins son:
        -  Compilación de código fuente
        -  Empaquetado y distribución de artefactos
        -  Pruebas automatizadas
        -  Análisis de código estático
        -  Generación de documentación
          
        Los plugins permiten a los desarrolladores personalizar y automatizar el proceso de construcción de sus proyectos de acuerdo a sus necesidades específicas.
- Qué es y para qué sirve el repositorio central de maven
    -  Rta: El Repositorio Central de Maven, también conocido como Maven Central Repository, es un repositorio de código abierto gestionado por la comunidad de Apache Maven. Es el repositorio de artefactos de software más grande y utilizado en el ecosistema de Maven.
            El Repositorio Central de Maven sirve como un almacén centralizado de artefactos de software, que incluyen bibliotecas de código Java, plugins de Maven, archivos JAR, WAR y otros componentes utilizados en proyectos basados en Maven. Proporciona acceso a una amplia gama de bibliotecas y herramientas que pueden ser fácilmente integradas en proyectos Maven.

## CREACIÓN PROYECTO EN MAVEN

Ejecutamos el siguiente comando para crear un proyecto maven con ayuda de los arquetipos
```sh
$ mvn archetype:generate -DgroupId=edu.eci.cvds -DartifactId=Patterns -DarchetypeArtifactId=maven-archetype-quickstart -Dpackage=edu.eci.cvds.patterns.archetype
```

![image](https://github.com/JuanDpr99/CVDS-lab-2/assets/77819591/772cf3fb-94a3-41f0-a867-4f3854e9e743)

## AJUSTES CONFIGURACIONES DEL PROYECTO :wrench:

En archivo pom.xml se ajusta la versión del compilador de Java a la versión 8, para ello, agregamos la sección `properties` antes de la sección de
dependencias:

![image](https://github.com/JuanDpr99/CVDS-lab-2/assets/77819591/5a7cea0e-edde-4535-9ebf-e520ddc0437a)

## COMPILAR Y EJECUTAR
Realizamos el ajuste el la clase App.java para realizar el saludo personalizado

```java
public class App
{
    public static void main(String[] args) {
        if (args.length > 0) {
            StringBuilder saludo = new StringBuilder("Hola");

            for (String arg : args) {
                saludo.append(" ").append(arg);
            }
            System.out.println(saludo.toString());

        } else {
            System.out.println("Hola mi mundo!");
        }
    }
}
```
Ejecutamos la clase con parámetros compuestos para que el saludo se realice con nombre y apellido.
```sh
$  mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.archetype.App" -Dexec.args="Juan Parroquiano"
```
```sh
$  mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.archetype.App" -Dexec.args="Carolina Morales"
```

![image](https://github.com/JuanDpr99/CVDS-lab-2/assets/77819591/c8c7e780-3aec-48f2-93a5-7fda370095a0)

![image](https://github.com/JuanDpr99/CVDS-lab-2/assets/77819591/e063db09-baec-46a2-be69-c9b09f7847d2)





