USE BONUS_TRACK;
-- > 2 
SELECT * FROM TOP_SPOTIFY;
-- > 3
SELECT ARTISTA, TITULO, GENERO FROM TOP_SPOTIFY;
-- > 4
SELECT ARTISTA, TITULO, GENERO FROM TOP_SPOTIFY ORDER BY GENERO;
-- > 5
SELECT ARTISTA, TITULO, GENERO FROM TOP_SPOTIFY ORDER BY GENERO, ARTISTA;
