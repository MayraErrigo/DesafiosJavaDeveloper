use  libreria;
-- > 1
create table empleados_anteriores select * from empleados where apellido in('Thomas', 'Pereira', 'Devo');
delete from empleados where apellido in('Thomas', 'Pereira', 'Devo');
-- > 2
insert into empleados_anteriores(empleado_id, nombre, apellido, puesto_id, editorial_id, fecha_ingreso, permanencia)
select empleado_id, nombre, apellido, puesto_id, editorial_id, fecha_ingreso, permanencia from empleados
where apellido = 'Cruz';
delete from empleados where apellido = 'Cruz';