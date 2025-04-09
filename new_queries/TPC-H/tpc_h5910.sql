SELECT table_name.column_name , COUNT ( * ) AS column_label FROM table_name AS table_name WHERE table_name.column_name < ( SELECT 0.2 * AVG ( table_name.column_name ) FROM table_name AS table_name WHERE table_name.column_name = table_name.column_name ) GROUP BY table_name.column_name ORDER BY table_name.column_name 