-- 1. Mostrar el nombre de todos los pokemon.
SELECT nombre FROM pokemon;
-- 2. Mostrar los pokemon que pesen menos de 10k.
SELECT * FROM pokemon WHERE peso < 10000;
-- 3. Mostrar los pokemon de tipo agua.
SELECT p.nombre FROM pokemon p 
INNER JOIN pokemon_tipo pt ON p.numero_pokedex = pt.numero_pokedex
INNER JOIN tipo t ON pt.id_tipo = t.id_tipo
WHERE t.nombre = 'Agua';
-- 4. Mostrar los pokemon de tipo agua, fuego o tierra ordenados por tipo.
SELECT p.nombre FROM pokemon p 
INNER JOIN pokemon_tipo pt ON p.numero_pokedex = pt.numero_pokedex
INNER JOIN tipo t ON pt.id_tipo = t.id_tipo
WHERE t.nombre IN ('Agua', 'Fuego', 'Tierra') ORDER BY t.nombre;
-- 5. Mostrar los pokemon que son de tipo fuego y volador.
SELECT p.nombre, t1.nombre, t2.nombre FROM pokemon p 
JOIN pokemon_tipo pt1 ON p.numero_pokedex = pt1.numero_pokedex
JOIN pokemon_tipo pt2 ON p.numero_pokedex = pt2.numero_pokedex
JOIN tipo t1 ON pt1.id_tipo = t1.id_tipo
JOIN tipo t2 ON pt2.id_tipo = t2.id_tipo
WHERE t1.nombre = 'Fuego' AND t2.nombre = 'Volador';
-- 6. Mostrar los pokemon con una estadística base de ps mayor que 200.
SELECT * FROM pokemon 
WHERE numero_pokedex = (SELECT numero_pokedex FROM estadisticas_base WHERE ps > 200);
-- 7. Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok.
SELECT * FROM pokemon 
WHERE numero_pokedex = (SELECT e.pokemon_origen FROM pokemon p 
JOIN evoluciona_de e ON p.numero_pokedex = e.pokemon_evolucionado 
WHERE p.nombre = 'Arbok');
-- 8. Mostrar aquellos pokemon que evolucionan por intercambio.
SELECT p.* FROM pokemon p 
JOIN pokemon_forma_evolucion pfe ON p.numero_pokedex = pfe.numero_pokedex 
JOIN forma_evolucion fe ON pfe.id_forma_evolucion = fe.id_forma_evolucion 
JOIN tipo_evolucion te ON fe.tipo_evolucion = te.id_tipo_evolucion 
WHERE te.tipo_evolucion = 'Intercambio';
-- 9. Mostrar el nombre del movimiento con más prioridad.
SELECT * FROM movimiento ORDER BY prioridad DESC LIMIT 1;
-- 10. Mostrar el pokemon más pesado.
SELECT * FROM pokemon ORDER BY peso DESC LIMIT 1;
-- 11. Mostrar el nombre y tipo del ataque con más potencia.
SELECT m.nombre, ta.tipo FROM movimiento m
JOIN tipo t ON m.id_tipo = t.id_tipo
JOIN tipo_ataque ta ON t.id_tipo_ataque = ta.id_tipo_ataque
ORDER BY potencia DESC LIMIT 1;
-- 12. Mostrar el número de movimientos de cada tipo.
SELECT COUNT(id_movimiento), t.nombre FROM movimiento m
JOIN tipo t ON m.id_tipo = t.id_tipo
GROUP BY m.id_tipo;
-- 13. Mostrar todos los movimientos que puedan envenenar.
SELECT m.* FROM movimiento m
LEFT JOIN movimiento_efecto_secundario mes ON m.id_movimiento = mes.id_movimiento
LEFT JOIN efecto_secundario es ON mes.id_efecto_secundario = es.id_efecto_secundario
WHERE descripcion LIKE '%Envenena%' OR es.efecto_secundario = 'Envenenamiento leve';
-- 14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.
SELECT * FROM movimiento WHERE potencia != 0 OR descripcion LIKE '%daño%' ORDER BY nombre ASC;
-- 15. Mostrar todos los movimientos que aprende pikachu.
SELECT DISTINCT m.* FROM movimiento m 
JOIN pokemon_movimiento_forma pmf ON m.id_movimiento = pmf.id_movimiento 
WHERE numero_pokedex = (SELECT numero_pokedex FROM pokemon WHERE nombre = 'Pikachu');
-- 16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).
SELECT m.*, t.* FROM pokemon p
JOIN pokemon_movimiento_forma pmf ON p.numero_pokedex = pmf.numero_pokedex 
JOIN movimiento m ON pmf.id_movimiento = m.id_movimiento
JOIN forma_aprendizaje fa ON pmf.id_forma_aprendizaje = fa.id_forma_aprendizaje
JOIN tipo_forma_aprendizaje tfa ON fa.id_tipo_aprendizaje = tfa.id_tipo_aprendizaje
WHERE p.nombre = 'Pikachu' AND tfa.tipo_aprendizaje = 'MT';
-- 17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.
SELECT m.* FROM pokemon p
JOIN pokemon_movimiento_forma pmf ON p.numero_pokedex = pmf.numero_pokedex 
JOIN movimiento m ON pmf.id_movimiento = m.id_movimiento
JOIN forma_aprendizaje fa ON pmf.id_forma_aprendizaje = fa.id_forma_aprendizaje
JOIN tipo_forma_aprendizaje tfa ON fa.id_tipo_aprendizaje = tfa.id_tipo_aprendizaje
JOIN tipo t ON m.id_tipo = t.id_tipo
WHERE p.nombre = 'Pikachu' AND tfa.tipo_aprendizaje = 'Nivel' AND t.nombre = 'Normal';
-- 18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.
SELECT m.* FROM movimiento m
JOIN movimiento_efecto_secundario mes ON m.id_movimiento = mes.id_movimiento
WHERE mes.probabilidad > 30;
SELECT * FROM movimiento_efecto_secundario;
-- 19. Mostrar todos los pokemon que evolucionan por piedra.
SELECT DISTINCT p.* FROM pokemon p
JOIN pokemon_forma_evolucion pfe ON p.numero_pokedex = pfe.numero_pokedex
JOIN forma_evolucion fe ON pfe.id_forma_evolucion = fe.id_forma_evolucion
JOIN tipo_evolucion te ON fe.tipo_evolucion = te.id_tipo_evolucion 
WHERE te.tipo_evolucion = 'Piedra';
-- 20. Mostrar todos los pokemon que no pueden evolucionar.
SELECT * FROM pokemon WHERE numero_pokedex NOT IN (SELECT numero_pokedex FROM pokemon_forma_evolucion);
-- 21. Mostrar la cantidad de los pokemon de cada tipo.
SELECT t.nombre, COUNT(numero_pokedex) FROM pokemon_tipo pt
JOIN tipo t ON pt.id_tipo = t.id_tipo
GROUP BY t.nombre;
