# CVDS - LAB02
## Julian Santiago Cárdenas Cubaque
## Sebastian Galvis Briceño

## La herramienta Maven

### - Fases de Maven:
Las fases de Maven son las etapas secuenciales en el ciclo de vida de construcción de un proyecto. Maven organiza el proceso de construcción en fases, donde cada fase realiza una tarea específica y se ejecuta en un orden determinado. Las fases se agrupan en diferentes ciclos de vida, siendo el ciclo de vida predeterminado el más común y utilizado.

### - Ciclo de vida de la construcción:
El ciclo de vida de la construcción son las fases del proceso que sigue Maven para construir, probar, empaquetar y desplegar una aplicación.
Hay tres ciclos de vida principales en Maven:
- Ciclo de vida de la construcción predeterminado (default).
- Ciclo de vida de limpieza (clean).
- Ciclo de vida de implementación (site).

Explicaremos el ciclo de vida de la construcción predeterminado.

**1. Validar:**
Esta fase verifica que el proyecto esté correctamente configurado y que todos los parámetros y dependencias necesarias estén presentes. Si falta algún elemento esencial, Maven generará un error.

_Ejemplo: Si en el archivo pom.xml se tienen dependencias que no existen o están mal configuradas, Maven avisará durante esta fase._

**2. Compilar:**
En esta fase, el código fuente del proyecto (normalmente en el directorio src/main/java) se compila y se transforma en archivos .class (archivos bytecode de Java).

_Ejemplo: Si se tiene una clase llamada MiClase.java, Maven la compilará para generar MiClase.class._

**3. Probar:**
Una vez que el código ha sido compilado, Maven ejecuta las pruebas unitarias que estén definidas en el proyecto (por ejemplo, usando JUnit). Esta fase asegura que el código funciona correctamente y cumple con los requisitos de calidad.

_Ejemplo: Si se tienen pruebas unitarias en la carpeta src/test/java, Maven las ejecutará durante esta fase._

**4. Empaquetar:**
Esta fase empaqueta el código compilado en un formato adecuado para su distribución. El tipo de empaquetado dependerá de la configuración del proyecto (por ejemplo, un .jar, .war, .ear, etc.).

_Ejemplo: Si el proyecto es una aplicación Java, Maven generará un archivo myapp.jar durante esta fase._

**5. Verificar:** 
En esta fase se realiza una verificación adicional para asegurarse de que el proyecto ha sido correctamente empaquetado y que cumple con todos los requisitos antes de continuar.

_Ejemplo: Si el proyecto tiene configuraciones adicionales o un perfil específico para la verificación, Maven lo comprobará en esta fase._

**6. Instalar:**
Durante esta fase, Maven instala el artefacto (por ejemplo, el archivo .jar, .war, etc.) en el repositorio local de Maven (en la máquina de desarrollo) para que pueda ser utilizado por otros proyectos que dependan de él.

_Ejemplo: Si el proyecto genera un archivo .jar, Maven lo copiará al repositorio local en el directorio .m2/repository._

**7. Desplegar:**
En esta fase, Maven despliega el artefacto empaquetado en un repositorio remoto, como un repositorio de Maven central o un repositorio privado. Este paso es utilizado generalmente en entornos de integración continua y producción.

_Ejemplo: El archivo .jar que se ha generado se sube a un servidor de repositorios como Nexus o Artifactory._

**Flujo de ejecución:**
Maven sigue estas fases en un flujo de ejecución secuencial. Si se ejecuta una fase intermedia, como compile, Maven ejecutará automáticamente todas las fases anteriores (por ejemplo, validate). 

Por ejemplo, si se ejecuta:
```bash
mvn clean install
```

1. Ejecutará el ciclo de vida clean, eliminando los archivos generados anteriormente (como los .class).
2. Luego ejecutará el ciclo de vida default, que incluirá todas las fases desde validate, compile, test, package, verify hasta install.

### - ¿Para qué sirven los plugins?
Los plugins en Maven son componentes que permiten ampliar y personalizar las funcionalidades del ciclo de vida de la construcción. En otras palabras, los plugins en Maven realizan tareas específicas en cada fase del ciclo de vida del proyecto, como compilar el código, ejecutar pruebas, empaquetar el artefacto, generar documentación, entre otras. Sin plugins, Maven no sería tan flexible y eficiente, ya que los plugins permiten automatizar y personalizar una gran cantidad de tareas.

Los plugins se configuran en el archivo _pom.xml_ del proyecto. En este archivo, se puede definir qué plugins se quieren usar, qué fases del ciclo de vida del proyecto ejecutan y qué configuraciones específicas requieren esos plugins.