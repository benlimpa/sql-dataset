SELECT 100.00 * SUM ( CASE WHEN table_name.column_name LIKE 'PROMO%' THEN table_name.column_name * ( 1 - table_name.column_name ) ELSE 0 END ) / SUM ( table_name.column_name * ( 1 - table_name.column_name ) ) AS column_label FROM table_name AS table_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name WHERE column_name > 0.00 AND SUBSTRING ( column_name FROM 1 FOR 2 ) IN ( '13' , '31' , '23' , '29' , '30' , '18' , '17' ) >= DATE '1995-09-01' AND table_name.column_name < DATE '1995-10-01' 