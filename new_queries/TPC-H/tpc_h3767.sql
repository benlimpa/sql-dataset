SELECT table_name.column_name , SUM ( table_name.column_name * ( 1 - table_name.column_name ) ) AS column_label , table_name.column_name , table_name.column_name FROM table_name AS table_name JOIN column_name > ( SELECT AVG ( column_name ) FROM table_name WHERE column_name > 0.00 AND SUBSTRING ( column_name FROM 1 FOR 2 ) IN ( '13' , '31' , '23' , '29' , '30' , '18' , '17' ) ) ON table_name.column_name = table_name.column_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name WHERE table_name.column_name = 'BUILDING' AND table_name.column_name < DATE '1995-03-15' AND table_name.column_name > DATE '1995-03-15' GROUP BY table_name.column_name , table_name.column_name , table_name.column_name ORDER BY column_name DESC , table_name.column_name LIMIT 10 