use libreria;
-- > 1
set sql_safe_updates = 0;
update autores set nombre = 'Esteban' where apellido = 'Echeverría';
-- > 2
alter table empleados add permanencia int;
update empleados set permanencia = timestampdiff(year, fecha_ingreso, curdate());
-- > 3
alter table libros add precio_publico float;
update libros set precio_publico = round(precio * 1.21, 2);
