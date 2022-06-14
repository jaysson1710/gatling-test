permite la ejecucion de pruebas de carga sobre un sitio web

realiza una peticion no solo a las apis sino tambien a cualquier componente que tenga que descargar del servidor





## download
https://gatling.io/thank-you/
## tutorial inicio rapido 
https://gatling.io/docs/gatling/tutorials/quickstart/

## configuracion de certificados
https://gatling.io/docs/gatling/reference/current/http/recorder/

## variables de estorno

la variable de entorno GATLING_HOME no se tiene q crear, la app la establece


caracteristicas de la ejecucion:
- hace peticiones respetando la secuencia
- registra los tiempos de espera tomados por los usuarios
- permite establecer una cantidad de usuario recurrentes
- no requiere levantar el navegador con Ui para la ejecucion,
- estas pruebasson ejecutadscon java 11
- genera reportes en html

linea de comandos
gatling.sh -> aplicacion de la prueba 
recorder.sh -| grabacion de las pruebas