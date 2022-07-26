use bonus_track;
-- > 1
set sql_safe_updates = 0;
update top_spotify set titulo = upper(titulo), artista = upper(artista);
-- > 2
alter table top_spotify add permanencia int;
update top_spotify set permanencia = year(curdate()) - ano;
-- > 3
create table ultimos_lanzamientos select * from top_spotify where permanencia <= 3;
delete from top_spotify where permanencia <= 3;
-- > 4
insert into top_spotify values(id = 610, titulo = 'God Control',
 artista = 'Madonna', genero = 'pop', ano = 2018, permanencia = 3);
-- > 5
insert into ultimos_lanzamientos (id, titulo, artista, genero, ano, permanencia)
select id, titulo, artista, genero, ano, permanencia from top_spotify
where permanencia <= 3;
delete from top_spotify where permanencia <= 3;