# Calculadora Spring Boot

Calculadora básica desarrollada con **Spring Boot** en el backend y **HTML/CSS** en el frontend.

## Características

- Suma
- Resta
- Multiplicación
- División
- Interfaz moderna y responsive
- Validación de errores (división por cero, campos vacíos)
- API REST

## Requisitos

- Java 17 o superior
- Maven 3.6+: Instalar desde terminal con winget o desde la pagina de Maven (https://maven.apache.org/download.cgi)
- Navegador web moderno

## Vericación de Requisitos

1. **Java**
```bash
javac --version
```

2. **Maven**
```bash
mvn -version
```
Nota: Si no reconoce el comando Maven o Java, verifica si la carpeta bin esta en el Path de Variables del Sistema.

## Instalación y Ejecución

1. **Clonar el repositorio**
```bash
git clone https://github.com/BVAndy259/calculadoraSpringBoot.git
cd calculadoraSpringBoot
```

2. **Compilar el proyecto**
```bash
mvn clean install
```

3. **Ejecutar la aplicación**
```bash
mvn spring-boot:run
```

4. **Abrir en el navegador**
```
http://localhost:8080
```

## Estructura del Proyecto

```
calculadoraSpringBoot/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── calculator/
│       │               ├── CalculatorApplication.java
│       │               └── controller/
│       │                   └── CalculatorController.java
│       └── resources/
│           ├── static/
│           │   └── css/
│           │       └── styles.css
│           ├── templates/
│           │   └── index.html
│           └── application.properties
└── pom.xml
```

## Tecnologías

- **Backend**: Spring Boot 3.2.0
- **Frontend**: HTML5, CSS3, JavaScript (Vanilla)
- **Build Tool**: Maven
- **Java**: 17

## API Endpoints

### POST /calculate
Realiza operaciones matemáticas básicas.

**Request Body:**
```json
{
  "num1": 10,
  "num2": 5,
  "operation": "sumar"
}
```

**Response:**
```json
{
  "result": 15,
  "error": null
}
```

**Operaciones disponibles:** `sumar`, `restar`, `multiplicar`, `dividir`

## Captura de Pantalla

La calculadora presenta una interfaz moderna con gradiente morado, botones animados y un display grande para visualizar los resultados.

## Contribuir

Las contribuciones son bienvenidas. Por favor, abre un issue o un pull request.

## Licencia

Este proyecto es de código abierto y está disponible bajo la Licencia MIT.