-- Consultas sobre una tabla
-- 1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.
SELECT codigo_oficina, ciudad FROM oficina;
-- 2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
SELECT ciudad, telefono FROM oficina WHERE pais = 'España';
-- 3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7.
SELECT nombre, apellido1, apellido2, email FROM empleado WHERE codigo_jefe = 7;
-- 4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.
SELECT puesto, nombre, apellido1, apellido2, email FROM empleado WHERE codigo_jefe IS NULL;
-- 5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean representantes de ventas.
SELECT nombre, apellido1, apellido2, puesto FROM empleado WHERE puesto != 'Representante Ventas';
-- 6. Devuelve un listado con el nombre de los todos los clientes españoles.
SELECT nombre_cliente FROM cliente WHERE pais = 'Spain';
-- 7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.
SELECT estado FROM pedido GROUP BY estado;
-- 8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago en 2008. Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan repetidos. Resuelva la consulta:
-- 		o Utilizando la función YEAR de MySQL.
SELECT codigo_cliente FROM pago WHERE YEAR(fecha_pago) = 2008 GROUP BY codigo_cliente;
-- 		o Utilizando la función DATE_FORMAT de MySQL.
SELECT codigo_cliente FROM pago WHERE DATE_FORMAT(fecha_pago, '%y') = 08 GROUP BY codigo_cliente;
-- 		o Sin utilizar ninguna de las funciones anteriores.
SELECT codigo_cliente FROM pago WHERE fecha_pago LIKE '2008%' GROUP BY codigo_cliente;
-- 9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos que no han sido entregados a tiempo.
SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega FROM pedido WHERE fecha_entrega > fecha_esperada;
-- 10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha esperada.
-- 		o Utilizando la función ADDDATE de MySQL.
SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega FROM pedido WHERE fecha_esperada >= ADDDATE(fecha_entrega, 2);
-- 		o Utilizando la función DATEDIFF de MySQL.
SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega FROM pedido WHERE DATEDIFF(fecha_esperada, fecha_entrega) >= 2;
-- 11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.
SELECT * FROM pedido WHERE YEAR(fecha_pedido) = 2009 AND estado = 'Rechazado';
-- 12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de cualquier año.
SELECT * FROM pedido WHERE MONTH(fecha_pedido) = 01 AND estado = 'Entregado';
-- 13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal. Ordene el resultado de mayor a menor.
SELECT * FROM pago WHERE forma_pago = 'PayPal' AND YEAR(fecha_pago) = 2008 ORDER BY total DESC;
-- 14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en cuenta que no deben aparecer formas de pago repetidas.
SELECT DISTINCT forma_pago FROM pago;
-- 15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que tienen más de 100 unidades en stock. 
-- El listado deberá estar ordenado por su precio de venta, mostrando en primer lugar los de mayor precio.
SELECT * FROM producto WHERE gama = 'Ornamentales' AND cantidad_en_stock > 100 ORDER BY precio_venta DESC;
-- 16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo representante de ventas tenga el código de empleado 11 o 30.
SELECT * FROM cliente WHERE ciudad = 'Madrid' AND codigo_empleado_rep_ventas IN (11, 30);

-- Consultas multitabla (Composición interna) - resolver con INNER JOIN
-- 1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas.
SELECT c.nombre_cliente, e.nombre, e.apellido1, e.apellido2 FROM cliente c INNER JOIN empleado e ON codigo_empleado_rep_ventas = codigo_empleado;
-- 2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus representantes de ventas.
SELECT c.nombre_cliente, e.nombre FROM pago p INNER JOIN cliente c ON p.codigo_cliente = c.codigo_cliente INNER JOIN empleado e ON codigo_empleado_rep_ventas = codigo_empleado GROUP BY nombre_cliente, nombre;
SELECT c.nombre_cliente, e.nombre FROM cliente c INNER JOIN empleado e ON codigo_empleado_rep_ventas = codigo_empleado WHERE c.codigo_cliente IN (SELECT p.codigo_cliente FROM pago p) GROUP BY nombre_cliente, nombre;
-- 3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas.
SELECT c.nombre_cliente, e.nombre FROM cliente c INNER JOIN empleado e ON codigo_empleado_rep_ventas = codigo_empleado WHERE c.codigo_cliente NOT IN (SELECT p.codigo_cliente FROM pago p) GROUP BY nombre_cliente, nombre;
-- 4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
SELECT c.nombre_cliente, e.nombre, o.ciudad FROM cliente c INNER JOIN empleado e ON codigo_empleado_rep_ventas = codigo_empleado INNER JOIN oficina o ON e.codigo_oficina = o.codigo_oficina WHERE c.codigo_cliente IN (SELECT p.codigo_cliente FROM pago p);
-- 5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
SELECT c.nombre_cliente, e.nombre, o.ciudad FROM cliente c INNER JOIN empleado e ON codigo_empleado_rep_ventas = codigo_empleado INNER JOIN oficina o ON e.codigo_oficina = o.codigo_oficina WHERE c.codigo_cliente NOT IN (SELECT p.codigo_cliente FROM pago p);
-- 6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.
SELECT o.linea_direccion1, o.linea_direccion2 FROM cliente c INNER JOIN empleado e ON codigo_empleado_rep_ventas = codigo_empleado INNER JOIN oficina o ON e.codigo_oficina = o.codigo_oficina WHERE c.ciudad = 'Fuenlabrada';
-- 7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
SELECT c.nombre_cliente, e.nombre, o.ciudad FROM cliente c INNER JOIN empleado e ON codigo_empleado_rep_ventas = codigo_empleado INNER JOIN oficina o ON e.codigo_oficina = o.codigo_oficina WHERE c.codigo_cliente;
-- 8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.
SELECT e.nombre AS Nombre_empleado, em.nombre AS Nombre_jefe FROM empleado e JOIN empleado em on e.codigo_jefe = em.codigo_empleado;
-- 9. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.
SELECT nombre_cliente FROM pedido p INNER JOIN cliente c ON p.codigo_cliente = c.codigo_cliente WHERE fecha_entrega > fecha_esperada GROUP BY nombre_cliente;
-- 10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.
SELECT gama, nombre_cliente FROM producto pr INNER JOIN detalle_pedido dp ON pr.codigo_producto = dp.codigo_producto INNER JOIN pedido pe ON dp.codigo_pedido = pe.codigo_pedido INNER JOIN cliente c ON pe.codigo_cliente = c.codigo_cliente GROUP BY gama, nombre_cliente;

-- Consultas multitabla (Composición externa) - Resolver utilizando LEFT JOIN, RIGHT JOIN, JOIN.
-- 1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
SELECT * FROM pago p RIGHT JOIN cliente c ON p.codigo_cliente = c.codigo_cliente WHERE p.codigo_cliente IS NULL;
-- 2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pedido.
SELECT * FROM pedido p RIGHT JOIN cliente c ON p.codigo_cliente = c.codigo_cliente WHERE p.codigo_cliente IS NULL;
-- 3. Devuelve un listado que muestre los clientes que no han realizado ningún pago y los que no han realizado ningún pedido.
SELECT * FROM pago pa RIGHT JOIN cliente c ON pa.codigo_cliente = c.codigo_cliente LEFT JOIN pedido pe ON c.codigo_cliente = pe.codigo_cliente WHERE pa.codigo_cliente IS NULL OR pe.codigo_cliente IS NULL;
-- 4. Devuelve un listado que muestre solamente los empleados que no tienen una oficina asociada.
SELECT * FROM empleado e LEFT JOIN oficina o ON e.codigo_oficina = o.codigo_oficina WHERE e.codigo_oficina IS NULL;
-- 5. Devuelve un listado que muestre solamente los empleados que no tienen un cliente asociado.
SELECT * FROM empleado e LEFT JOIN cliente c ON e.codigo_empleado = c.codigo_empleado_rep_ventas WHERE c.codigo_cliente IS NULL;
-- 6. Devuelve un listado que muestre los empleados que no tienen una oficina asociada y los que no tienen un cliente asociado.
SELECT * FROM cliente c RIGHT JOIN empleado e ON e.codigo_empleado = c.codigo_empleado_rep_ventas LEFT JOIN oficina o ON e.codigo_oficina = o.codigo_oficina WHERE e.codigo_oficina IS NULL OR c.codigo_cliente IS NULL;
-- 7. Devuelve un listado de los productos que nunca han aparecido en un pedido.
SELECT * FROM detalle_pedido dp RIGHT JOIN producto p ON dp.codigo_producto = p.codigo_producto WHERE dp.codigo_producto IS NULL;
-- 8. Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los representantes de ventas de algún cliente que haya realizado la compra de algún producto de la gama Frutales.
SELECT * FROM oficina;
SELECT 
    gama, o.codigo_oficina
FROM
    producto pr
        JOIN
    detalle_pedido dp ON pr.codigo_producto = dp.codigo_producto
        JOIN
    pedido pe ON dp.codigo_pedido = pe.codigo_pedido
        JOIN
    cliente c ON pe.codigo_cliente = c.codigo_cliente
        JOIN
    empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
        RIGHT JOIN
    oficina o ON e.codigo_oficina = o.codigo_oficina
WHERE
    gama IS NULL
GROUP BY o.codigo_oficina , gama;
SELECT * FROM detalle_pedido WHERE codigo_producto LIKE 'FR%';
-- 9. Devuelve un listado con los clientes que han realizado algún pedido, pero no han realizado ningún pago.
SELECT * FROM pago pa RIGHT JOIN cliente c ON pa.codigo_cliente = c.codigo_cliente JOIN pedido pe ON c.codigo_cliente = pe.codigo_cliente WHERE pa.codigo_cliente IS NULL;
-- 10. Devuelve un listado con los datos de los empleados que no tienen clientes asociados y el nombre de su jefe asociado.
SELECT e.nombre AS Nombre_empleado, em.nombre AS Nombre_jefe FROM cliente c RIGHT JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado LEFT JOIN empleado em on e.codigo_jefe = em.codigo_empleado WHERE c.codigo_cliente IS NULL;

-- Consultas resumen
-- 1. ¿Cuántos empleados hay en la compañía?
SELECT COUNT(codigo_empleado) FROM empleado;
-- 2. ¿Cuántos clientes tiene cada país?
SELECT COUNT(codigo_cliente), pais FROM cliente GROUP BY pais;
-- 3. ¿Cuál fue el pago medio en 2009?
SELECT AVG(total) AS pago_promedio FROM pago WHERE YEAR(fecha_pago) = 2009;
-- 4. ¿Cuántos pedidos hay en cada estado? Ordena el resultado de forma descendente por el número de pedidos.
SELECT COUNT(codigo_pedido), estado FROM pedido GROUP BY estado ORDER BY COUNT(codigo_pedido) DESC;
-- 5. Calcula el precio de venta del producto más caro y más barato en una misma consulta.
SELECT MAX(precio_venta), MIN(precio_venta) FROM producto;
-- 6. Calcula el número de clientes que tiene la empresa.
SELECT COUNT(codigo_cliente) FROM cliente;
-- 7. ¿Cuántos clientes tiene la ciudad de Madrid?
SELECT COUNT(codigo_cliente) FROM cliente WHERE ciudad = 'Madrid';
-- 8. ¿Calcula cuántos clientes tiene cada una de las ciudades que empiezan por M?
SELECT COUNT(codigo_cliente), ciudad FROM cliente WHERE ciudad LIKE 'M%' GROUP BY ciudad;
-- 9. Devuelve el nombre de los representantes de ventas y el número de clientes al que atiende cada uno.
SELECT COUNT(codigo_cliente), codigo_empleado, nombre FROM empleado e INNER JOIN cliente c ON e.codigo_empleado = c.codigo_empleado_rep_ventas WHERE puesto = 'Representante Ventas' GROUP BY codigo_empleado;
-- 10. Calcula el número de clientes que no tiene asignado representante de ventas.
SELECT COUNT(codigo_cliente) FROM cliente WHERE codigo_empleado_rep_ventas IS NULL;
-- 11. Calcula la fecha del primer y último pago realizado por cada uno de los clientes. El listado deberá mostrar el nombre y los apellidos de cada cliente.
SELECT p.codigo_cliente, MIN(fecha_pago), MAX(fecha_pago), nombre_contacto, apellido_contacto FROM pago p INNER JOIN cliente c ON p.codigo_cliente = c.codigo_cliente GROUP BY codigo_cliente;
-- 12. Calcula el número de productos diferentes que hay en cada uno de los pedidos.
SELECT COUNT(codigo_producto), codigo_pedido FROM detalle_pedido GROUP BY codigo_pedido;
-- 13. Calcula la suma de la cantidad total de todos los productos que aparecen en cada uno de los pedidos.
SELECT SUM(cantidad) FROM detalle_pedido;
-- 14. Devuelve un listado de los 20 productos más vendidos y el número total de unidades que se han vendido de cada uno. El listado deberá estar ordenado por el número total de unidades vendidas.
SELECT codigo_producto, SUM(cantidad) FROM detalle_pedido GROUP BY codigo_producto ORDER BY SUM(cantidad) DESC LIMIT 20;
-- 15. La facturación que ha tenido la empresa en toda la historia, indicando la base imponible, el IVA y el total facturado.
-- La base imponible se calcula sumando el coste del producto por el número de unidades vendidas de la tabla detalle_pedido. El IVA es el 21 % de la base imponible, y el total la suma de los dos campos anteriores.
SELECT SUM(cantidad * precio_unidad) AS base_imponible, SUM(cantidad * precio_unidad * .21) AS IVA, SUM(cantidad * precio_unidad * 1.21) AS Total FROM detalle_pedido;
-- 16. La misma información que en la pregunta anterior, pero agrupada por código de producto.
SELECT codigo_producto, SUM(cantidad * precio_unidad) AS base_imponible, SUM(cantidad * precio_unidad * .21) AS IVA, SUM(cantidad * precio_unidad * 1.21) AS Total FROM detalle_pedido GROUP BY codigo_producto;
-- 17. La misma información que en la pregunta anterior, pero agrupada por código de producto filtrada por los códigos que empiecen por OR.
SELECT codigo_producto, SUM(cantidad * precio_unidad) AS base_imponible, SUM(cantidad * precio_unidad * .21) AS IVA, SUM(cantidad * precio_unidad * 1.21) AS Total FROM detalle_pedido WHERE codigo_producto LIKE 'OR%' GROUP BY codigo_producto;
-- 18. Lista las ventas totales de los productos que hayan facturado más de 3000 euros. Se mostrará el nombre, unidades vendidas, total facturado y total facturado con impuestos (21% IVA)
SELECT codigo_producto, SUM(cantidad * precio_unidad * 1.21) AS Total FROM detalle_pedido GROUP BY codigo_producto HAVING SUM(cantidad * precio_unidad * 1.21) > 3000;

-- Subconsultas con operadores básicos de comparación
-- 1. Devuelve el nombre del cliente con mayor límite de crédito.
SELECT * FROM cliente ORDER BY limite_credito DESC LIMIT 1;
-- 2. Devuelve el nombre del producto que tenga el precio de venta más caro.
SELECT * FROM producto ORDER BY precio_venta DESC LIMIT 1;
-- 3. Devuelve el nombre del producto del que se han vendido más unidades. (Tenga en cuenta que tendrá que calcular cuál es el número total de unidades que se han vendido de cada producto a partir de los datos 
-- de la tabla detalle_pedido. Una vez que sepa cuál es el código del producto, puede obtener su nombre fácilmente.)
SELECT * FROM producto WHERE codigo_producto = (SELECT codigo_producto FROM detalle_pedido GROUP BY codigo_producto ORDER BY SUM(cantidad) DESC LIMIT 1);
-- 4. Los clientes cuyo límite de crédito sea mayor que los pagos que haya realizado. (Sin utilizar INNER JOIN).
SELECT * FROM cliente c WHERE limite_credito > (SELECT SUM(total) FROM pago WHERE codigo_cliente = c.codigo_cliente GROUP BY codigo_cliente);
-- 5. Devuelve el producto que más unidades tiene en stock.
SELECT * FROM producto ORDER BY cantidad_en_stock DESC LIMIT 1;
-- 6. Devuelve el producto que menos unidades tiene en stock.
SELECT * FROM producto ORDER BY cantidad_en_stock ASC LIMIT 1;
-- 7. Devuelve el nombre, los apellidos y el email de los empleados que están a cargo de Alberto Soria.
SELECT * FROM empleado WHERE codigo_jefe = (SELECT codigo_empleado FROM empleado WHERE nombre = 'Alberto' AND apellido1 = 'Soria');

-- Subconsultas con ALL y ANY
-- 1. Devuelve el nombre del cliente con mayor límite de crédito.
SELECT * FROM cliente WHERE limite_credito = ANY (SELECT limite_credito FROM cliente) ORDER BY limite_credito DESC LIMIT 1;
-- 2. Devuelve el nombre del producto que tenga el precio de venta más caro.
SELECT * FROM producto ORDER BY precio_venta DESC LIMIT 1;
-- 3. Devuelve el producto que menos unidades tiene en stock.
SELECT * FROM producto ORDER BY cantidad_en_stock ASC LIMIT 1;

-- Subconsultas con IN y NOT IN
-- 1. Devuelve el nombre, apellido1 y cargo de los empleados que no representen a ningún cliente.
SELECT * FROM empleado WHERE codigo_empleado NOT IN (SELECT codigo_empleado_rep_ventas FROM cliente);
-- 2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
SELECT * FROM cliente WHERE codigo_cliente NOT IN (SELECT codigo_cliente FROM pago);
-- 3. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
SELECT * FROM cliente WHERE codigo_cliente IN (SELECT codigo_cliente FROM pago);
-- 4. Devuelve un listado de los productos que nunca han aparecido en un pedido.
SELECT * FROM producto WHERE codigo_producto NOT IN (SELECT codigo_producto FROM detalle_pedido);
-- 5. Devuelve el nombre, apellidos, puesto y teléfono de la oficina de aquellos empleados que no sean representante de ventas de ningún cliente.
SELECT nombre, apellido1, apellido2, puesto, telefono FROM empleado e INNER JOIN oficina o ON e.codigo_oficina = o.codigo_oficina WHERE codigo_empleado NOT IN (SELECT codigo_empleado_rep_ventas FROM cliente);

-- Subconsultas con EXISTS y NOT EXISTS
-- 1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
SELECT * FROM cliente c WHERE NOT EXISTS (SELECT * FROM pago p WHERE c.codigo_cliente = p.codigo_cliente);
-- 2. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
SELECT * FROM cliente c WHERE EXISTS (SELECT * FROM pago p WHERE c.codigo_cliente = p.codigo_cliente);
-- 3. Devuelve un listado de los productos que nunca han aparecido en un pedido.
SELECT * FROM producto pr WHERE NOT EXISTS (SELECT * FROM detalle_pedido dp WHERE pr.codigo_producto = dp.codigo_producto);
-- 4. Devuelve un listado de los productos que han aparecido en un pedido alguna vez.
SELECT * FROM producto pr WHERE EXISTS (SELECT * FROM detalle_pedido dp WHERE pr.codigo_producto = dp.codigo_producto);
