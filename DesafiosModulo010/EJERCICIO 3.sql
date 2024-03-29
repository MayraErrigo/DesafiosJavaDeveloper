USE LIBRERIA;
-- > 1 
SELECT * FROM AUTORES WHERE CIUDAD = 'BUENOS AIRES';
-- > 2
SELECT * FROM LIBROS WHERE PRECIO > 30 ORDER BY PRECIO DESC;
-- > 3
SELECT * FROM AUTORES WHERE PROVINCIA <> 'BA'  ORDER BY PROVINCIA ;
-- > 4
SELECT * FROM LIBROS WHERE CATEGORIA = 'CUENTOS' AND PRECIO < 20 ORDER BY TITULO;
-- > 5
SELECT * FROM LIBROS WHERE CATEGORIA = 'NOVELAS' OR CATEGORIA = 'ENSAYOS' ORDER BY TITULO;
-- > 6
SELECT * FROM LIBROS WHERE PRECIO BETWEEN 20 AND 35 ORDER BY PRECIO;
-- > 7
SELECT * FROM AUTORES WHERE NOMBRE IN('JORGE LUIS', 'VICTORIA', 'ERNESTO', 'ADOLFO') ORDER BY APELLIDO;
-- > 8
SELECT * FROM LIBROS WHERE TITULO LIKE '%MUNDO%' ORDER BY TITULO;
-- > 9
SELECT * FROM LIBROS WHERE TITULO LIKE '% DE %' ORDER BY TITULO;
-- > 10
SELECT * FROM LIBROS WHERE PRECIO IS NULL ORDER BY TITULO;