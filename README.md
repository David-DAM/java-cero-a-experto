# 📚 Java Moderno: De Cero a Experto

Un curso completo de Java que abarca desde los conceptos básicos hasta los temas más avanzados del lenguaje, utilizando
las características modernas de Java.

## 🎯 Objetivo del Curso

Este curso está diseñado para llevarte desde un nivel principiante hasta convertirte en un desarrollador Java experto,
cubriendo tanto los fundamentos como las características más modernas del lenguaje.

## 🛠️ Tecnologías Utilizadas

- **Java SDK 21** - La versión LTS más reciente
- **Maven** - Gestión de dependencias y construcción del proyecto
- **IntelliJ IDEA** - IDE de desarrollo

## 📖 Contenido del Curso

### 1. Fundamentos de Java

- Variables y tipos de datos
- Operadores
- Estructuras de control
- Arrays y colecciones

### 2. Programación Orientada a Objetos (POO)

- **Clases y objetos**
- **Herencia**
- **Encapsulación**
- **Polimorfismo**
- **Abstracción**

#### Enumeraciones

- **GenderType** - Ejemplo de enum para tipos de género con métodos personalizados

### 3. Características Avanzadas

- Excepciones
- Generics
- Streams API
- Lambda expressions
- Optional

### 4. Java Moderno

- Características de Java 8+
- Nuevas APIs
- Mejoras en rendimiento

## 🚀 Cómo Ejecutar el Proyecto

### Prerrequisitos

- Java 21 o superior
- Maven 3.6+
- IntelliJ IDEA (recomendado)

### Pasos para ejecutar

1. **Clonar el repositorio:**

```bash 
git clone https://github.com/David-DAM/java-cero-a-experto.git
cd java-cero-a-experto
``` 

2. **Compilar el proyecto:**

```bash
 mvn clean compile
``` 

3. **Ejecutar pruebas:**

```bash
mvn test
```

1. **Ejecutar la aplicación:**

``` bash
mvn exec:java -Dexec.mainClass="com.davinchicoder.Main"
```

## 📝 Ejemplos de Código

### Enumeración GenderType

``` java
public enum GenderType {
    MALE("M"),
    FEMALE("F");

    private final String name;

    GenderType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static GenderType fromName(String name) {
        for (GenderType gender : GenderType.values()) {
            if (gender.getName().equals(name)) {
                return gender;
            }
        }
        return null;
    }
}
```

## 🔧 Configuración del Proyecto

El proyecto utiliza Maven como sistema de construcción. Las principales configuraciones se encuentran en el archivo :
`pom.xml`

- **Versión de Java:** 21
- **Encoding:** UTF-8
- **Dependencias:** Se irán añadiendo según el progreso del curso

## 📚 Recursos Adicionales

- [Documentación oficial de Java](https://docs.oracle.com/en/java/)
- [Guía de Maven](https://maven.apache.org/guides/)
- [IntelliJ IDEA Documentation](https://www.jetbrains.com/help/idea/)

## 🤝 Contribuciones

Este es un proyecto educativo. Si encuentras errores o tienes sugerencias de mejora, no dudes en crear un issue o pull
request.

## 📄 Licencia

Este proyecto tiene fines educativos.

## 👨‍💻 Autor

**DavinchiCoder** - Instructor del curso Java Moderno de Cero a Experto
_¡Feliz aprendizaje! 🎉_
