<h1 align="center">CVDS-lab-2</h1>

## OBJETIVOS
1. Entender qué es Maven
2. Usar comandos de generación de arquetipos, compilación y ejecución de un proyecto usando Maven
3. Obtener puntos adicionales por PR qué corrijan o mejoren los laboratorios

## LA HERRAMIENTA MAVEN :hammer:
Ingresar a la página de la herramienta [Apache Maven](https://maven.apache.org/what-is-maven.html) y entender:
- Cuál es su mayor utilidad
    -  Rta: El objetivo principal de Maven es permitir que un desarrollador comprenda el estado completo de un esfuerzo de desarrollo en el menor tiempo posible.
- Fases de maven
    -  Rta: 
- Ciclo de vida de la construcción
    -  Rta: La especificación, ejecución y elaboración de informes de las pruebas unitarias forman parte del ciclo normal de compilación con Maven
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

## HACER EL ESQUELETO DE LA APLICACIÓN

-    Decidimos implemetar el patrón de fábrica 'Simple Factory', un patrón sumamente sencillo de implementar. Básicamente se trata de crear una clase que contenga un método (o varios), ya sea público o estático (también publico), que contenga un gigante condicional para la creación de cada producto u objeto.

```java
     public class ShapeFactory
    {
        public static Shape create(RegularShapeType _type)
        {
            switch(_type) {
                case Triangle:
                    return new Triangle();
    
                case Quadrilateral:
                    return new Quadrilateral();
    
                case Pentagon:
                    return new Pentagon();
    
                case Hexagon:
                    return new Hexagon();
    
                default:
                    return null;
            }
        }
    }
```
-    Ejecute múltiples veces la clase ShapeMain, usando el plugin exec de maven con los siguientes parámetros y verifique la salida en consola para cada una:
     -     Sin parámetros
         -    ![image](https://github.com/JuanDpr99/CVDS-lab-2/assets/77819591/fd7e6351-f418-4b28-9bb2-cf3b20ddb396)

     -     Parámetro: qwerty
         -    ![image](https://github.com/JuanDpr99/CVDS-lab-2/assets/77819591/8b53f472-2654-48e3-ac14-f77491cee414)
    
     -     Parámetro: pentagon
         -    ![image](https://github.com/JuanDpr99/CVDS-lab-2/assets/77819591/033b7a3c-8e30-4b82-a33c-979d64aa12ba)

     -     Parámetro: Hexagon
         -    ![image](https://github.com/JuanDpr99/CVDS-lab-2/assets/77819591/b12c5268-2ebc-42d1-b7ae-15b560e5692a)

       





