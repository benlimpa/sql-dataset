SELECT column_name , COUNT ( * ) AS column_label FROM ( SELECT table_name.column_name , COUNT ( table_name.column_name ) AS column_label FROM table_name AS table_name                      GROUP BY table_name.column_name ) AS table_name GROUP BY column_name ORDER BY column_name DESC , column_name DESC 