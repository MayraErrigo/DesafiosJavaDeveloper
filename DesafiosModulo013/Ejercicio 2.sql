use bonus_track;

select *, 'Anterior' as estado from top_spotify where titulo like '%Break%'
union 
select *, 'Ultimo' as estado from ultimos_lanzamientos where titulo like '%Break%' order by titulo; 

