<h1>💱 Conversor de Monedas</h1>
<p align="center">
<img src="https://img.shields.io/badge/Java-21%2B-%23ED8B00?color=%23ED8B00">
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
      <li>Modelos: Moneda y TasaDeCambio → datos obtenidos de la API.</li>
      <li>Servicios: ConsultaIntercambioDeMoneda → HTTP client, request y response.</li>
      <li>Utilidades: Configuracion → configuración de seguridad para API Key.</li>
      <li>Main: ConversorApp → manejo del flujo principal de la aplicación y la interacción con el usuario.</li>
    </ul>
  </li>
</ul>

<h3>💰 Divisas disponibles</h3>
  <code>ARS</code> - Peso Argentino<br>
  <code>BRL</code> - Real Brasileño<br>
  <code>COP</code> - Peso Colombiano<br>
  <code>MXN</code> - Peso Mexicano

<h3>🚀 Instalación y Uso</h3>
<ol>
  <li>Clona el repositorio:</li>
  ```bash
  git clone https://github.com.git```
  <li>Crea un archivo <code>config.properties</code> en la raíz del proyecto e introduce tu API Key de <a href="https://www.exchangerate-api.com/">ExchangeRate-API</a></li>
  ```bash
  API_KEY=tu_api_key```
  <li></li><em>Añadir</em></li>
  <li></li>
  <li><em>Sortear Amigo</em> $${\color{green}verde}$$.</li>
  <li></li>
</ol>

<h3>🛠️ Tecnologías</h3>
<ul>
  <li>Java 21+: Lenguaje principal.</li>
  <li>Gson 2.10+: Procesamiento JSON, parseo y análisis de respuestas. (<code>JsonParser</code>, <code>JsonObject</code>)</li>
  <li>ExchangeRate-API v6: Fuente de tasas de cambio.</li>
  <li>HttpServer (JDK): Servidor HTTP nativo. </li>
  <li>Postman: Pruebas APIs REST.</li>
</ul>

<hr/>
<em>Desarrollado por <a href="https://github.com/StephLlamas">Estefanía Llamas</a> como parte del programa <strong>Oracle Next Education</strong> impartido por <a href="https://www.aluracursos.com">Alura Latam</a>.</em>
