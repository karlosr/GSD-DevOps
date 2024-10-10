# GSD-DevOps
Ejercicio - Solapamiento de rangos





REQUISITOS:

    Product Version: Apache NetBeans IDE 22
    Java: 17.0.12; Java HotSpot(TM) 64-Bit Server VM 17.0.12+8-LTS-286
    Runtime: Java(TM) SE Runtime Environment 17.0.12+8-LTS-286
    System: Windows 10 version 10.0 running on amd64; UTF-8; es_MX (nb)
    Apache Maven 3.9.8




CODIGO PARTE1:


    GIT:
        https://github.com/karlosr/GSD-DevOps.git                          BRANCH: feature/parte1   o main                          TAG: v1.0.1


    BUILD:
        $mvn clean package

    
    EJECUCION POR LINEA DE COMANDOS:

        Dentro de la carpeta GsdDevOps ejecutar la siguiente instrucción en línea de comandos (tomando en consideración los requisitos previos):

            $java -jar target\GsdDevOps-1.0-SNAPSHOT.jar


        la salida deberá ser como se indica en el documento.





CODIGO PARTE2:


    GIT:
        https://github.com/karlosr/GSD-DevOps.git                          BRANCH: feature/parte2   o main                          TAG: v2.0.0


    BUILD:        
        $mvn clean package

    ARRANQUE Y DESPLIEGUE EN LOCAL DEL SERVICIO WEB:
        $mvn spring-boot:run

    
    EJECUCION POR LINEA DE COMANDOS PARA EL CONSUMO DEL ENDPOINT:
    
         $curl -X POST http://localhost:8080/api/rangos/agrupar -H "Content-Type: application/json" -d '[
            {
                "inicioDelRango"    : "2024-01-01T15:30:00",
                "finDelRango"       : "2024-03-01T15:00:00"
            }, {
                "inicioDelRango"    : "2024-02-01T15:15:00",
                "finDelRango"       : "2024-05-01T14:45:00"
            }, {
                "inicioDelRango"    : "2023-10-01T13:00:00",
                "finDelRango"       : "2023-11-01T13:45:00"
            } ]'



