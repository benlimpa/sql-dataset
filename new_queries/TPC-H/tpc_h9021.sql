SELECT table_name.column_name , table_name.column_name IN ( SELECT table_name.column_name FROM table_name AS table_name GROUP BY table_name.column_name HAVING SUM ( table_name.column_name ) > 300 ) FROM table_name AS table_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name WHERE table_name.column_name = 'ASIA' AND table_name.column_name >= DATE '1994-01-01' AND table_name.column_name < DATE '1995-01-01' GROUP BY table_name.column_name ORDER BY column_name DESC 