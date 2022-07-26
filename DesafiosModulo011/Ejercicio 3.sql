use libreria;
-- > 1
select concat(apellido, ', ', nombre) Empleado, 
year(fecha_ingreso) as Ingreso,
timestampdiff(year, fecha_ingreso, curdate()) as Antiguedad 
from empleados order by Ingreso desc;
-- > 2
select min(precio) as 'Menor Precio' from libros;
-- > 3
select min(precio) as 'Menor Precio', max(precio) as 'Mayor Precio'  from libros;
-- > 4
select min(precio) as 'Menor Precio', max(precio) as 'Mayor Precio',
round(avg(precio), 2) as 'Precio Promedio' from libros;
-- > 5
select categoria, min(precio) 'Menor Precio', max(precio) 'Mayor Precio',
 round(avg(precio), 2) 'Precio Promedio'
from libros group by categoria;
-- > 6
select categoria, min(precio) 'Menor Precio', max(precio) 'Mayor Precio',
round(avg(precio), 2) 'Precio Promedio' from libros group by categoria having categoria <> 'Sin asignar' ;