SELECT table_name.column_name , SUM ( table_name.column_name * table_name.column_name ) AS value FROM table_name AS table_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name WHERE table_name.column_name = 'GERMANY' GROUP BY column_name           column_label   HAVING SUM ( table_name.column_name * table_name.column_name ) > ( SELECT SUM ( table_name.column_name * table_name.column_name ) * 0.0001 FROM table_name AS table_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name JOIN column_name AS column_label ON table_name.column_name = table_name.column_name WHERE table_name.column_name = 'GERMANY' ) ORDER BY value DESC 