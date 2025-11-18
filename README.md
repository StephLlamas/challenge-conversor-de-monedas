<h1>💱 Conversor de Monedas</h1>
<p align="center">
<img src="https://img.shields.io/badge/Java-17%2B-%23ED8B00?color=%23ED8B00">
<img src="https://img.shields.io/badge/Gson-2.10%2B-%2388e339?logo=google&logoColor=%23f5f5f5&color=%2388e339">
<img src="https://img.shields.io/badge/Postman-Testing-%23FF6C37?logo=postman&logoColor=%23f5f5f5">
<img src="https://img.shields.io/badge/License-MIT-0173b4">
</p>

<h3>📝 Descripción</h3>
<p>Aplicación con interfaz de consola intuitiva y fácil de usar, desarrollada en Java que permite convertir cualquier monto a diferentes divisas latinoamericanas, utilizando tasas de cambio en tiempo real de <a href="https://www.exchangerate-api.com/">ExchangeRate-API</a>.
<ul>
  <li>Conceptos fundamentales de POO (Programación Orientada a Objetos).</li>
  <li>Consumo de APIs REST.</li>
  <li>Procesamiento de respuestas JSON mediante Gson.</li>
  <li>Manejo de excepciones.</li>
  <li>Prueba de APIs con Postman.</li>
</ul>
</p>

<h3>⚙️ Funcionalidades</h3>
<ul>
  <li>12 conversiones disponibles.</li>
  <li>Conexión en tiempo real con ExchangeRate API.</li>
  <li>Menú interactivo con lista de conversiones e historial de búsqueda.</li>
  <li>Bucle de navegación.</li>
  <li>Validación de datos.</li>
  <li>Manejo de errores.</li>
  <li>Estructura modular: 
    <ul>
      <li>Modelos: <code>Moneda</code> y <code>TasaDeCambio</code> → datos obtenidos de la API.</li>
      <li>Servicios: <code>ConsultaIntercambioDeMoneda</code> → HTTP client, request y response.</li>
      <li>Utilidades: <code>Configuracion</code> → configuración de seguridad para API Key.</li>
      <li>Main: <code>ConversorApp</code> → manejo del flujo principal de la aplicación y la interacción con el usuario.</li>
    </ul>
  </li>
</ul>

<h3>💰 Divisas disponibles</h3>
  <code>ARS</code> - Peso Argentino<br>
  <code>BRL</code> - Real Brasileño<br>
  <code>COP</code> - Peso Colombiano<br>
  <code>MXN</code> - Peso Mexicano

### 🚀 Instalación y Uso
1. Clona el repositorio:
```bash
 git clone https://github.com/StephLlamas/challenge-conversor-de-monedas.git
```
2. Asegúrate de tener JDK 17 o superior instalado.
3. Abre el proyecto en IntelliJ IDEA.
4. Verifica que la librería Gson esté agregada al classpath, (archivo <code>gson-2.10.1.jar</code>).
5. Crea un archivo <code>config.properties</code> en la raíz del proyecto e introduce tu API Key de <a href="https://www.exchangerate-api.com/">ExchangeRate-API</a>:
```properties
  API_KEY=tu_api_key
```
6. Ejecuta el proyecto en <code>ConversorApp.java</code> → <code>Run 'ConversorApp.main()'</code>.
7. Selecciona una opción del menú:<br>
<img width="513" height="505" alt="menu-conversor" src="https://github.com/user-attachments/assets/c2317596-8e31-4db3-8186-cb59298269bf" /><br>
Ejemplo:<br>
<img width="516" height="84" alt="numero-conversion-menu" src="https://github.com/user-attachments/assets/c0daf203-36bb-4de8-bb08-077d8e8ffa94" /><br>
8. Ingresa la cantidad que deseas convertir y el programa mostrará el resultado.<br>
Ejemplo:<br>
<img width="513" height="85" alt="cantidad" src="https://github.com/user-attachments/assets/0092bb17-a96b-40fe-9fbc-a6156e0d1fec" /><br>
9. Ejemplo de historial de conversiones:<br>
<img width="478" height="163" alt="historial" src="https://github.com/user-attachments/assets/5287e92e-004e-4a1c-9fd2-ff6f7519cfd4" /><br>

<h3>🛠️ Tecnologías</h3>
<ul>
  <li>Java 17+: Lenguaje principal.</li>
  <li>Gson 2.10+: Procesamiento JSON, parseo y análisis de respuestas. (<code>JsonParser</code>, <code>JsonObject</code>)</li>
  <li>ExchangeRate-API v6: Fuente de tasas de cambio.</li>
  <li>HttpServer (JDK): Servidor HTTP nativo. </li>
  <li>Postman: Pruebas APIs REST.</li>
</ul>

<hr/>
<em>Desarrollado por <a href="https://github.com/StephLlamas">Estefanía Llamas</a> como parte del programa <strong>Oracle Next Education</strong> impartido por <a href="https://www.aluracursos.com">Alura Latam</a>.</em>
