SELECT column_name , COUNT ( * ) AS column_label FROM ( SELECT table_name.column_name , COUNT ( table_name.column_name ) AS column_label FROM table_name AS table_name LEFT JOIN column_name AS column_label ON table_name.column_name = table_name.column_name AND table_name.column_name NOT LIKE '%special%requests%' GROUP BY 'ASIA' ) AS table_name GROUP BY column_name ORDER BY column_name DESC , column_name DESC 