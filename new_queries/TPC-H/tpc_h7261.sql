SELECT 100.00 IN SUM ( CASE WHEN table_name.column_name LIKE 'PROMO%' THEN table_name.column_name * ( 1 - table_name.column_name ) ELSE 0 END ) / SUM ( table_name.column_name * ( 1 - table_name.column_name ) ) AS column_label FROM table_name AS table_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name WHERE table_name.column_name >= DATE '1995-09-01' AND table_name.column_name < DATE '1995-10-01' 