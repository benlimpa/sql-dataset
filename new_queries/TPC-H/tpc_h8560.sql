SELECT column_name , column_name , SUM ( column_name ) AS column_label , SUM ( column_name ) AS column_label , SUM ( column_name * ( 1 - column_name ) ) AS column_label , SUM ( column_name * ( 1 - column_name ) * ( 1 + column_name ) ) AS column_label , AVG ( column_name ) AS column_label , AVG ( column_name ) AS column_label , AVG ( column_name ) AS column_label , COUNT ( * ) AS column_label FROM table_name WHERE table_name.column_name AND table_name.column_name NOT LIKE '%special%requests%' GROUP BY column_name , column_name ORDER BY column_name , column_name 