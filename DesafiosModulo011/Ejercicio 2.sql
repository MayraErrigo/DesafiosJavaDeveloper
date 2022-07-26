use libreria;
-- > 1
select  concat( apellido, ', ', nombre ) as Autor, provincia from autores order by apellido;
-- > 2
select  concat_ws(', ', apellido, nombre) as Autor, provincia from autores order by apellido;
-- > 3
select  upper(concat_ws(', ', apellido, nombre)) as Autor, provincia from autores order by apellido;
-- > 4
select  upper(concat( apellido,', ',  left(nombre, 1), '. ')) as Autor, provincia from autores order by apellido;
-- > 5
select concat(apellido, ', ', nombre) Empleado,
year(fecha_ingreso) as Ingreso
from empleados order by Ingreso desc;
