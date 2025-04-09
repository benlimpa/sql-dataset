SELECT table_name.column_name , SUM ( table_name.column_name * ( 1 - table_name.column_name ) ) AS column_label , table_name.column_name , table_name.column_name FROM table_name AS table_name WHERE table_name.column_name >= DATE '1993-07-01' AND table_name.column_name < DATE '1993-10-01' AND EXISTS ( SELECT 1 FROM table_name AS table_name WHERE table_name.column_name = table_name.column_name AND table_name.column_name < table_name.column_name ) GROUP BY table_name.column_name ORDER BY table_name.column_name 