SELECT column_name , column_name , SUM ( column_name ) AS column_label FROM ( SELECT table_name.column_name , EXTRACT ( YEAR FROM table_name.column_name ) AS column_label , table_name.column_name * ( 1 - table_name.column_name ) - table_name.column_name * table_name.column_name AS column_label FROM table_name AS table_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name AND table_name.column_name = table_name.column_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name WHERE table_name.column_name LIKE '%green%' ) AS table_name GROUP BY column_name , column_name ORDER BY column_name , column_name DESC 