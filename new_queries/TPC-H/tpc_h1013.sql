SELECT column_name , COUNT ( * ) AS column_label , SUM ( column_name ) AS column_label FROM ( SELECT SUBSTRING ( column_name FROM 1 FOR 2 ) AS column_label , column_name FROM table_name WHERE SUBSTRING ( column_name FROM 1 FOR 2 ) IN  '13' , '31' , '23' , '29' , '30' , '18' , '17' ) AND column_name > ( SELECT AVG ( column_name ) FROM table_name WHERE column_name > 0.00 AND SUBSTRING ( column_name FROM 1 FOR 2 ) IN ( '13' , '31' , '23' , '29' , '30' , '18' , '17' ) ) AND NOT EXISTS ( SELECT 1 FROM table_name WHERE column_name = column_name ) ) AS table_name GROUP BY column_name ORDER BY column_name 