SELECT column_name , column_name , SUM ( column_name ) AS column_label , SUM ( column_name ) AS column_label , SUM ( column_name * ( 1 - column_name ) ) AS column_label , SUM ( column_name * ( 1 - column_name ) * ( 1 + column_name ) ) AS column_label , AVG ( column_name ) AS column_label , AVG ( column_name ) AS column_label , AVG ( table_name.column_name = 'MED BOX' AND table_name.column_name < ( SELECT 0.2 * AVG ( table_name.column_name ) FROM table_name AS table_name WHERE table_name.column_name = table_name.column_name ) ) AS column_label , COUNT ( * ) AS column_label FROM table_name WHERE column_name <= DATE '1998-12-01' - INTERVAL '90 days' GROUP BY column_name , column_name ORDER BY column_name , column_name 