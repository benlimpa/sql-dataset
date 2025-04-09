SELECT table_name.column_name , SUM ( CASE WHEN table_name.column_name = '1-URGENT' OR table_name.column_name = '2-HIGH' THEN 1 ELSE 0 END ) AS column_label , SUM ( CASE WHEN table_name.column_name <> '1-URGENT' AND table_name.column_name <> '2-HIGH' THEN 1 ELSE 0 END ) AS column_label FROM table_name AS table_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name WHERE   column_label GROUP BY table_name.column_name ORDER BY table_name.column_name 