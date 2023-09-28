-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
SELECT nombre FROM jugadores ORDER BY nombre ASC;
-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por nombre alfabéticamente.
SELECT nombre FROM jugadores WHERE Posicion LIKE '%C%' AND peso > 200 ORDER BY nombre ASC;
-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
SELECT nombre FROM equipos ORDER BY nombre ASC;
-- 4. Mostrar el nombre de los equipos del este (East).
SELECT nombre FROM equipos WHERE Conferencia = 'East';
-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
SELECT * FROM equipos WHERE Ciudad LIKE 'C%' ORDER BY nombre ASC;
-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
SELECT * FROM jugadores INNER JOIN equipos e ON Nombre_equipo = e.Nombre ORDER BY Nombre_equipo;
-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
SELECT * FROM jugadores WHERE Nombre_equipo = 'Raptors' ORDER BY Nombre;
-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
SELECT Puntos_por_partido FROM estadisticas e INNER JOIN jugadores j ON e.jugador = j.codigo WHERE j.nombre = 'Pau Gasol';
-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
SELECT Puntos_por_partido FROM estadisticas e INNER JOIN jugadores j ON e.jugador = j.codigo WHERE j.nombre = 'Pau Gasol' AND temporada = '04/05';
-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.
SELECT ROUND(SUM(Puntos_por_partido)) AS puntos, jugador FROM estadisticas GROUP BY jugador;
-- 11. Mostrar el número de jugadores de cada equipo.
SELECT COUNT(codigo) AS Numero_de_jugadores, Nombre_equipo FROM jugadores GROUP BY Nombre_equipo;
-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
SELECT ROUND(SUM(Puntos_por_partido)) AS puntos, jugador FROM estadisticas GROUP BY jugador ORDER BY ROUND(SUM(Puntos_por_partido)) DESC LIMIT 1;
-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
SELECT Nombre_equipo, Conferencia, Division FROM jugadores j INNER JOIN equipos e ON Nombre_equipo = e.Nombre ORDER BY Altura DESC LIMIT 1;
-- 14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
SELECT equipo_local, equipo_visitante, ABS(puntos_local - puntos_visitante) AS diferencia FROM partidos WHERE ABS(puntos_local - puntos_visitante) = (SELECT ABS(puntos_local - puntos_visitante) FROM partidos ORDER BY ABS(puntos_local - puntos_visitante) DESC LIMIT 1) ORDER BY ABS(puntos_local - puntos_visitante) DESC;
-- 15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.
SELECT codigo, equipo_local, equipo_visitante, equipo_local AS equipo_ganador FROM partidos WHERE puntos_local > puntos_visitante;
SELECT codigo, equipo_local, equipo_visitante, equipo_visitante AS equipo_ganador FROM partidos WHERE puntos_local < puntos_visitante;
SELECT codigo, equipo_local, equipo_visitante, null AS equipo_ganador FROM partidos WHERE puntos_local = puntos_visitante;

SELECT codigo, equipo_local, equipo_visitante, CASE WHEN puntos_local > puntos_visitante THEN equipo_local WHEN puntos_local < puntos_visitante THEN equipo_visitante ELSE NULL END AS equipo_ganador FROM partidos;
