![2](https://github.com/TomasGonzaa/CoinConverter/assets/89737983/4ab5ee40-9b07-4bbc-aef8-7858d5a7beba)
<h1 align="center"> COIN CONVERTER </h1>

Este proyecto es una app de un conversor de monedas, desarrollado en Java e implementando el uso de una API para obtener información actualizada sobre las tasas de cambio de varias monedas del mundo.

## Características

- **Conversión de Monedas:** Permite convertir cantidades entre diferentes monedas utilizando tasas de cambio actualizadas obtenidas de una API.
- **Submenús Funcionales:** Ofrece tres funciones diferentes a elegir en el menú principal, cada una con submenús específicos para seleccionar las monedas sobre las que se desea operar.
- **Guardado de Consultas:** Opción para guardar las consultas realizadas en un archivo nuevo, para futuras referencias.
- **Navegación Intuitiva:** En cualquier momento, el usuario puede optar por retornar al menú principal.

## Requisitos

- Java 8 o superior.
- Conexión a internet para acceder a la API de tasas de cambio.

## Instalación

1. Clona este repositorio en tu máquina local.
   ```sh
   git clone https://github.com/TomasGonzaa/CoinConverter.git
   

  ## Uso

Al iniciar la aplicación, el usuario podrá elegir entre tres funciones diferentes desde el menú principal. Cada función lo llevará a un submenú donde podrá seleccionar las monedas para realizar la consulta.

- **Función 1:** Saber Cúal es la taza de conversión de un par de divisas.
- **Función 2:** Realizar la conversión de una cantidad especifica de una divisa a otra.
- **Función 3:** Saber Cúal es el codigo Estándar Internacional ISO de una divisa.

En cada submenú el usuario tendrá la opción de guardar en un nuevo archivo el historial de las consultas realizadas. Al finalizar, siempre podrá retornar al menú principal.

## API Utilizada

Este proyecto utiliza la API `ExchangeRate` para obtener las tasas de cambio actualizadas. Asegúrate de tener una clave de API válida y configurada en tu proyecto.


