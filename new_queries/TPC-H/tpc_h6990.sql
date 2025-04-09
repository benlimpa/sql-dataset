SELECT column_name , SUM ( CASE WHEN column_name = 'BRAZIL' THEN column_name ELSE 0 END ) / SUM ( column_name ) AS column_label FROM ( SELECT EXTRACT ( YEAR FROM table_name.column_name ) AS column_label , table_name.column_name * ( 1 - table_name.column_name ) AS column_label , table_name.column_name AS column_label FROM table_name AS table_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name JOIN column_name AS column_label ON table_name.column_name =  JOIN column_name AS column_label ON table_name.column_name = table_name.column_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name WHERE table_name.column_name = 'AMERICA' AND table_name.column_name BETWEEN DATE '1995-01-01' AND DATE '1996-12-31' AND table_name.column_name = 'ECONOMY ANODIZED STEEL' ) AS table_name GROUP BY column_name ORDER BY column_name 