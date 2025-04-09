SELECT table_name.column_name , SUM ( table_name.column_name * table_name.column_name ) AS value FROM table_name AS table_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name WHERE table_name.column_name = 'GERMANY' GROUP BY table_name.column_name HAVING SUM ( table_name.column_name * table_name.column_name ) > ( SELECT SUM ( table_name.column_name * column_name  column_label ) * 0.0001 FROM table_name AS table_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name WHERE table_name.column_name = 'GERMANY' ) ORDER BY value DESC 