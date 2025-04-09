SELECT column_name , column_name , SUM ( column_name ) AS column_label , SUM ( column_name ) AS column_label , SUM ( column_name * ( 1 - column_name ) ) AS column_label , SUM ( column_name * ( SUM ( CASE WHEN table_name.column_name LIKE 'PROMO%' THEN table_name.column_name * ( 1 - table_name.column_name ) ELSE 0 END ) / SUM ( table_name.column_name * ( 1 - table_name.column_name ) ) AS column_label ) * ( 1 + column_name ) ) AS column_label , AVG ( column_name ) AS column_label , AVG ( column_name ) AS column_label , AVG ( column_name ) AS column_label , COUNT ( * ) AS column_label FROM table_name WHERE column_name <= DATE '1998-12-01' - INTERVAL '90 days' GROUP BY column_name , column_name ORDER BY column_name , column_name 