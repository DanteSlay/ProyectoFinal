# Instalación del Proyecto

Para comenzar a trabajar con el proyecto, sigue estos pasos detallados a continuación:

## Clonar el Repositorio

1. Clona el repositorio desde GitHub ejecutando el siguiente comando en tu terminal:

   ```bash
   git clone https://github.com/DanteSlay/ProyectoFinal.git
   ```

2. Cambia al directorio del proyecto:
   ```bash
   cd ProyectoFinal
   ```

3. Construir y Desplegar el Proyecto con Docker
  Una vez clonado el repositorio, procede con la construcción y despliegue del proyecto utilizando Docker:

    Asegúrate de estar en la carpeta que contiene el archivo ```docker-compose.yml.```

    Construye las imágenes de Docker utilizando el siguiente comando:
     ```bash
    docker-compose build
    ```
   Despliega el proyecto utilizando Docker Compose:
   ```bash
   docker-compose up
    ```

   Una vez completados estos pasos, el proyecto estará desplegado y podrás acceder al backend a través de
   ```http://localhost:8081```.
