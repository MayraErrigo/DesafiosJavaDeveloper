use libreria;
-- > 1
select * from libros where precio > (select  avg(precio) from libros) order by titulo;
-- > 2
select * from libros where categoria = 'Novelas' 
and precio > (select max(precio) from libros where categoria = 'Ensayos') order by precio desc;
-- > 3
select * from empleados where permanencia = (select max(permanencia) from empleados);
-- > 4
select * from empleados where puesto_id = (select max(puesto_id) from empleados);
-- > 5
select libro_id, titulo, categoria, precio_publico,
case 
when precio_publico < 15 then 'Economico'
when precio_publico <= 30 then 'Regular'
else 'Deluxe' 
end as tipo from libros where precio_publico is not null order by titulo;
-- > 6
select concat(apellido, ', ', nombre) empleado from empleados where puesto_id = 9
union
select concat(apellido, ', ', nombre) from empleados_anteriores where puesto_id = 9
order by empleado;
-- > 7
select ventas.libro_id, titulo, precio_publico, local_id, factura_nro, cantidad from libros, ventas
where libros.libro_id = ventas.libro_id order by libros.titulo;
-- > 8
select ventas.libro_id, titulo, precio_publico, local_id, factura_nro, cantidad, round(precio_publico * cantidad, 2) as total from libros,ventas 
where libros.libro_id = ventas.libro_id order by libros.titulo;
-- > 9
select libros.titulo from libros left join ventas on libros.libro_id = ventas.libro_id where factura_nro is null
order by titulo;
