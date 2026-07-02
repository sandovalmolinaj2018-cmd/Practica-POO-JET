# Readme.md

Este documento tendra el Documento de Vision/ERS para este proyecto, diseccionado en los siguientes puntos a tener en cuenta.

1. Propósito del Sistema
El propósito de este proyecto es desarrollar el motor lógico y la interfaz para un videojuego de estrategia táctica por turnos. El sistema permitirá al jugador gestionar un escuadrón en escenarios de combate basados en cuadrículas, enfatizando el posicionamiento estratégico mediante el uso de coberturas y ventajas de altura para superar los encuentros.

2. Alcance del Proyecto
El software abarcará las mecánicas de combate central. Incluirá la gestión de un equipo de hasta 4 personajes simultáneos por partida. El motor del juego procesará un sistema de turnos donde cada entidad poseerá 2 instancias de acción (puntos de acción para movimiento o habilidades). El mapa táctico incluirá cálculo de rutas, validación de coberturas estáticas (media y completa) y un sistema de elevación de terreno (coordenada Z) que alterará matemáticamente las estadísticas de combate.

3. Requisitos Funcionales (RF)
(Estas son las funciones exactas que deberemos programar en la lógica del juego)

RF01 - Gestión de Turnos: El sistema debe alternar el control cíclicamente, reiniciando los puntos de acción (2 por personaje) al inicio del turno del usuario.

RF02 - Sistema de Movimiento: El código debe calcular y resaltar el área de movimiento posible de un personaje en la cuadrícula basándose en sus puntos de acción restantes, bloqueando casillas ocupadas por obstáculos u otras entidades.

RF03 - Cálculo de Cobertura: El motor lógico debe aplicar modificadores defensivos a los personajes si el código detecta que se encuentran adyacentes a un objeto definido como "Cobertura Media" o "Cobertura Completa" en la línea de visión del atacante.

RF04 - Ventaja de Altura: El sistema debe otorgar bonificaciones matemáticas de precisión a las entidades que ejecuten una acción desde una casilla con una altura mayor a la de su objetivo.

4. Requisitos No Funcionales (RNF)
(Estas son las restricciones técnicas y de arquitectura de nuestro código)

RNF01 - Arquitectura de Software: El código fuente debe estar estructurado obligatoriamente utilizando el patrón de diseño Modelo-Vista-Controlador (MVC) para mantener una separación estricta entre la lógica táctica y la interfaz de usuario.

RNF02 - Lenguaje y Entorno: El desarrollo de las clases lógicas se realizará en el lenguaje de programación Java, empleando componentes Swing para la construcción y el renderizado de las ventanas e interfaces gráficas.

RNF03 - Persistencia de Datos: La información persistente del juego, como los atributos base de las clases de personajes y el catálogo de habilidades, debe almacenarse y consultarse en tiempo real mediante una base de datos relacional PostgreSQL.
