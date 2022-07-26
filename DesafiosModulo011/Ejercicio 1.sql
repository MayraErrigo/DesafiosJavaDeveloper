use bonus_track;
-- > 1
select concat(artista,' - ', titulo) as Cancion, genero from top_spotify order by cancion;
-- > 2
select concat_ws(' - ', artista, titulo) as Cancion, genero from top_spotify order by cancion;
-- > 3
select concat_ws(' - ', artista, titulo) as Cancion, upper(genero) as genero from top_spotify order by cancion;
-- > 4
select concat_ws(' - ', artista, titulo) as Cancion, upper(genero) as genero,
year(curdate()) - ano as Año
from top_spotify order by cancion;
-- > 5
select count(*) canciones from top_spotify;
-- > 6
select ano, count(*) canciones  from top_spotify  group by ano ;
-- > 7
select ano, count(*) canciones from top_spotify  group by ano having canciones >= 50;