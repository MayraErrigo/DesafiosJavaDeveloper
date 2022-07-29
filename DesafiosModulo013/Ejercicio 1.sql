use bonus_track;
-- > 1
select artista, titulo from ultimos_lanzamientos where ano = (select max(ano) from ultimos_lanzamientos) order by artista, titulo;
-- > 2
select titulo from top_spotify where permanencia = (select max(permanencia) from top_spotify)
and artista = 'Lady Gaga' order by titulo;
-- > 3
select titulo, artista,
case 
when genero like '%Pop%' then 'Pop'
when genero like '%Electro%' or genero like '%House%' then 'Electrónica'
else 'otro'
end as tipo from top_spotify order by artista, titulo;