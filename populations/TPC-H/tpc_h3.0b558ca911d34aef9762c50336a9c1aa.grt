���$      �%grammarinator.tool.default_population��DefaultTree���)��}�(�root��grammarinator.runtime.rule��UnparserRule���)��}�(�name��select_statement��parent�N�children�]�(h�UnlexerRule���)��}�(h�SELECT�hh	h]��src��SELECT�ubh)��}�(h�column_list�hh	h]�(h)��}�(h�	columnref�hhh]�(h)��}�(h�	table_ref�hhh]�h)��}�(h�
Identifier�hh h]�h�l�ubaubh)��}�(h�DOT�hhh]�h�.�ubh)��}�(hh&hhh]�h�
l_orderkey�ubeubh)��}�(h�COMMA�hhh]�h�,�ubh)��}�(hhhhh]�(h)��}�(h�f_expr�hh7h]�(h)��}�(hh&hh:h]�h�SUM�ubh)��}�(h�
OPEN_PAREN�hh:h]�h�(�ubh)��}�(h�c_expr�hh:h]�h)��}�(hhhhGh]�(h)��}�(hhhhKh]�(h)��}�(hh"hhNh]�h)��}�(hh&hhQh]�hh(ubaubh)��}�(hh+hhNh]�hh-ubh)��}�(hh&hhNh]�h�l_extendedprice�ubeubh)��}�(h�	binary_op�hhKh]�h)��}�(h�STAR�hh^h]�h�*�ubaubh)��}�(hhIhhKh]�h)��}�(hhhhgh]�h)��}�(hh<hhjh]�(h)��}�(hhDhhmh]�hhFubh)��}�(hhIhhmh]�h)��}�(hhhhsh]�(h)��}�(hhhhvh]�h)��}�(h�Integral�hhyh]�h�1�ubaubh)��}�(hh`hhvh]�h)��}�(h�MINUS�hh�h]�h�-�ubaubh)��}�(hhIhhvh]�h)��}�(hhhh�h]�(h)��}�(hh"hh�h]�h)��}�(hh&hh�h]�hh(ubaubh)��}�(hh+hh�h]�hh-ubh)��}�(hh&hh�h]�h�
l_discount�ubeubaubeubaubh)��}�(h�CLOSE_PAREN�hhmh]�h�)�ubeubaubaubeubaubh)��}�(hh�hh:h]�hh�ubeubh)��}�(h�AS�hh7h]�h�AS�ubh)��}�(h�collabel�hh7h]�h)��}�(hh&hh�h]�h�revenue�ubaubeubh)��}�(hh4hhh]�hh6ubh)��}�(hhhhh]�(h)��}�(hh"hh�h]�h)��}�(hh&hh�h]�h�o�ubaubh)��}�(hh+hh�h]�hh-ubh)��}�(hh&hh�h]�h�o_orderdate�ubeubh)��}�(hh4hhh]�hh6ubh)��}�(hhhhh]�(h)��}�(hh"hh�h]�h)��}�(hh&hh�h]�hh�ubaubh)��}�(hh+hh�h]�hh-ubh)��}�(hh&hh�h]�h�o_shippriority�ubeubeubh)��}�(h�FROM�hh	h]�h�FROM�ubh)��}�(h�	from_list�hh	h]�h)��}�(hh"hh�h]�(h)��}�(hh&hh�h]�h�customer�ubh)��}�(hh�hh�h]�h�AS�ubh)��}�(hh&hh�h]�h�c�ubeubaubh)��}�(h�join_clause�hh	h]�(h)��}�(h�JOIN�hh�h]�h�JOIN�ubh)��}�(hhhh�h]�(h)��}�(hh&hh�h]�h�orders�ubh)��}�(hh�hh�h]�h�AS�ubh)��}�(hh�hh�h]�h)��}�(hh&hj  h]�hh�ubaubeubh)��}�(h�ON�hh�h]�h�ON�ubh)��}�(hhIhh�h]�h)��}�(hhhj  h]�(h)��}�(hhhj  h]�(h)��}�(hh"hj  h]�h)��}�(hh&hj  h]�hh�ubaubh)��}�(hh+hj  h]�hh-ubh)��}�(hh&hj  h]�h�	c_custkey�ubeubh)��}�(hh`hj  h]�h)��}�(h�EQUAL�hj%  h]�h�=�ubaubh)��}�(hhIhj  h]�h)��}�(hhhj-  h]�(h)��}�(hh"hj0  h]�h)��}�(hh&hj3  h]�hh�ubaubh)��}�(hh+hj0  h]�hh-ubh)��}�(hh&hj0  h]�h�	o_custkey�ubeubaubeubaubh)��}�(hh�hh�h]�h�JOIN�ubh)��}�(hhhh�h]�(h)��}�(hh&hjD  h]�h�lineitem�ubh)��}�(hh�hjD  h]�h�AS�ubh)��}�(hh�hjD  h]�h)��}�(hh&hjO  h]�hh(ubaubeubh)��}�(hj  hh�h]�h�ON�ubh)��}�(hhIhh�h]�h)��}�(hhhjY  h]�(h)��}�(hhhj\  h]�(h)��}�(hh"hj_  h]�h)��}�(hh&hjb  h]�hh�ubaubh)��}�(hh+hj_  h]�hh-ubh)��}�(hh&hj_  h]�h�
o_orderkey�ubeubh)��}�(hh`hj\  h]�h)��}�(hj*  hjo  h]�hj,  ubaubh)��}�(hhIhj\  h]�h)��}�(hhhju  h]�(h)��}�(hh"hjx  h]�h)��}�(hh&hj{  h]�hh(ubaubh)��}�(hh+hjx  h]�hh-ubh)��}�(hh&hjx  h]�h�
l_orderkey�ubeubaubeubaubeubh)��}�(h�WHERE�hh	h]�h�WHERE�ubh)��}�(hhIhh	h]�h)��}�(hhhj�  h]�(h)��}�(hhhj�  h]�(h)��}�(hh"hj�  h]�h)��}�(hh&hj�  h]�hh�ubaubh)��}�(hh+hj�  h]�hh-ubh)��}�(hh&hj�  h]�h�c_mktsegment�ubeubh)��}�(hh`hj�  h]�h)��}�(hj*  hj�  h]�hj,  ubaubh)��}�(hhIhj�  h]�h)��}�(hhhj�  h]�(h)��}�(hhhj�  h]�h)��}�(h�StringConstant�hj�  h]�h�
'BUILDING'�ubaubh)��}�(hh`hj�  h]�h)��}�(h�AND�hj�  h]�h�AND�ubaubh)��}�(hhIhj�  h]�h)��}�(hhhj�  h]�(h)��}�(hhhj�  h]�(h)��}�(hh"hj�  h]�h)��}�(hh&hj�  h]�hh�ubaubh)��}�(hh+hj�  h]�hh-ubh)��}�(hh&hj�  h]�h�o_orderdate�ubeubh)��}�(hh`hj�  h]�h)��}�(h�LT�hj�  h]�h�<�ubaubh)��}�(hhIhj�  h]�h)��}�(hhhj�  h]�(h)��}�(hhhj�  h]�(h)��}�(h�typeidentifier�hj�  h]�h)��}�(hh&hj�  h]�h�DATE�ubaubh)��}�(hj�  hj�  h]�h�'1995-03-15'�ubeubh)��}�(hh`hj�  h]�h)��}�(hj�  hj�  h]�h�AND�ubaubh)��}�(hhIhj�  h]�h)��}�(hhhj�  h]�(h)��}�(hhhj�  h]�(h)��}�(hh"hj�  h]�h)��}�(hh&hj  h]�hh(ubaubh)��}�(hh+hj�  h]�hh-ubh)��}�(hh&hj�  h]�h�
l_shipdate�ubeubh)��}�(hh`hj�  h]�h)��}�(h�GT�hj  h]�h�>�ubaubh)��}�(hhIhj�  h]�h)��}�(hhhj  h]�(h)��}�(hj�  hj  h]�h)��}�(hh&hj  h]�h�DATE�ubaubh)��}�(hj�  hj  h]�h�'1995-03-15'�ubeubaubeubaubeubaubeubaubeubaubeubaubh)��}�(h�group_clause�hh	h]�(h)��}�(h�GROUP_P�hj(  h]�h�GROUP�ubh)��}�(h�BY�hj(  h]�h�BY�ubh)��}�(h�group_by_list�hj(  h]�(h)��}�(hhhj6  h]�(h)��}�(hh"hj:  h]�h)��}�(hh&hj=  h]�hh(ubaubh)��}�(hh+hj:  h]�hh-ubh)��}�(hh&hj:  h]�h�
l_orderkey�ubeubh)��}�(hh4hj6  h]�hh6ubh)��}�(hhhj6  h]�(h)��}�(hh"hjM  h]�h)��}�(hh&hjP  h]�hh�ubaubh)��}�(hh+hjM  h]�hh-ubh)��}�(hh&hjM  h]�h�o_orderdate�ubeubh)��}�(hh4hj6  h]�hh6ubh)��}�(hhhj6  h]�(h)��}�(hh"hj`  h]�h)��}�(hh&hjc  h]�hh�ubaubh)��}�(hh+hj`  h]�hh-ubh)��}�(hh&hj`  h]�h�o_shippriority�ubeubeubeubh)��}�(h�sort_clause�hh	h]�(h)��}�(h�ORDER�hjp  h]�h�ORDER�ubh)��}�(hj3  hjp  h]�h�BY�ubh)��}�(h�sortby_list�hjp  h]�(h)��}�(h�sortby�hj}  h]�(h)��}�(hhhj�  h]�h)��}�(hh&hj�  h]�h�revenue�ubaubh)��}�(h�DESC�hj�  h]�h�DESC�ubeubh)��}�(hh4hj}  h]�hh6ubh)��}�(hj�  hj}  h]�h)��}�(hhhj�  h]�(h)��}�(hh"hj�  h]�h)��}�(hh&hj�  h]�hh�ubaubh)��}�(hh+hj�  h]�hh-ubh)��}�(hh&hj�  h]�h�o_orderdate�ubeubaubeubeubh)��}�(h�limit_clause�hh	h]�(h)��}�(h�LIMIT�hj�  h]�h�LIMIT�ubh)��}�(hh~hj�  h]�h�10�ubeubeub�nodes_by_name�}�(h��(h	�h��(h�h��(h�h��(j�  hNj�  jM  hyhj�  j�  h�j�  j�  j\  j�  j�  h�j�  j�  jx  hKj�  h�jD  hvh�j  j`  h7j0  j�  j_  hjj  j:  j  �h"��(jP  h hQjc  h�j�  jb  j�  j  h�h�j  j�  h�j3  j{  j=  �h&��(h�j�  h�j   j�  jk  j�  j�  h�j  jG  h�h�hZj  jl  h�h�h>j  h$j~  j�  jS  jF  j@  jf  jR  h�h.je  h�j�  h�j�  j  jY  j<  hTj�  j�  j!  j6  �h+��(j9  jV  j�  j  h�jC  j�  ji  hWj�  h�h�j  j�  h)jh  �h4��(j]  j�  h�h�h2jJ  �h<��(h:hm�hD��(hphB�hI��(h�jY  hgj�  hsju  j�  j�  j�  j  j-  j�  hGj  �h`��(j�  j  h^jo  j�  j�  j�  j%  h��hd��(hb�h~��(h|j�  �h���(h��h���(h�h��h���(jK  j   h�h��h���(h�j  jO  �hڏ�(hؐhߏ�(hݐh�(h�h���(j@  h��j  ��(jU  j
  �j*  ��(jr  j(  j�  �j�  ��(j�  �j�  ��(j�  j$  j�  �j�  ��(j�  j�  �j�  ��(j�  �j�  ��(j  j�  �j  ��(j  �j*  ��(j(  �j.  ��(j,  �j3  ��(jy  j1  �j8  ��(j6  �jr  ��(jp  �jv  ��(jt  �j  ��(j}  �j�  ��(j�  j�  �j�  ��(j�  �j�  ��(j�  �j�  ��(j�  �u�node_levels�}�(h	K hKhKhKh Kh$Kh)Kh.Kh2Kh7Kh:Kh>KhBKhGKhKKhNKhQKhTKhWKhZKh^KhbKhgKhjKhmKhpK	hsK	hvK
hyKh|Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kh�K	h�Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kh�Kj   Kj  Kj  Kj
  Kj  Kj  Kj  Kj  Kj  Kj  Kj!  Kj%  Kj(  Kj-  Kj0  Kj3  Kj6  Kj9  Kj<  Kj@  KjD  KjG  KjK  KjO  KjR  KjU  KjY  Kj\  Kj_  Kjb  Kje  Kjh  Kjk  Kjo  Kjr  Kju  Kjx  Kj{  Kj~  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  K	j�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  K	j�  K
j�  Kj�  K
j�  K	j�  K
j�  K	j�  K
j�  Kj  Kj  Kj  Kj  Kj  Kj  Kj  Kj  Kj  Kj   Kj$  Kj(  Kj,  Kj1  Kj6  Kj:  Kj=  Kj@  KjC  KjF  KjJ  KjM  KjP  KjS  KjV  KjY  Kj]  Kj`  Kjc  Kjf  Kji  Kjl  Kjp  Kjt  Kjy  Kj}  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Kj�  Ku�node_depths�}�(h	KhK hKhKh Kh$K h)K h.K h2K h7Kh:Kh>K hBK hGK
hKK	hNKhQKhTK hWK hZK h^KhbK hgKhjKhmKhpK hsKhvKhyKh|K h�Kh�K h�Kh�Kh�Kh�K h�K h�K h�K h�K h�K h�Kh�K h�K h�Kh�Kh�K h�K h�K h�K h�Kh�Kh�K h�K h�K h�K h�Kh�Kh�K h�K h�K h�Kh�K h�Kh�K j   K j  Kj  K j
  K j  Kj  Kj  Kj  Kj  K j  K j!  K j%  Kj(  K j-  Kj0  Kj3  Kj6  K j9  K j<  K j@  K jD  KjG  K jK  K jO  KjR  K jU  K jY  Kj\  Kj_  Kjb  Kje  K jh  K jk  K jo  Kjr  K ju  Kjx  Kj{  Kj~  K j�  K j�  K j�  K j�  Kj�  Kj�  Kj�  Kj�  K j�  K j�  K j�  Kj�  K j�  Kj�  K
j�  Kj�  K j�  Kj�  K j�  K	j�  Kj�  Kj�  Kj�  K j�  K j�  K j�  Kj�  K j�  Kj�  Kj�  Kj�  Kj�  K j�  K j�  Kj�  K j�  Kj�  Kj�  Kj  Kj  K j  K j  K j  Kj  K j  Kj  Kj  Kj   K j$  K j(  Kj,  K j1  K j6  Kj:  Kj=  Kj@  K jC  K jF  K jJ  K jM  KjP  KjS  K jV  K jY  K j]  K j`  Kjc  Kjf  K ji  K jl  K jp  Kjt  K jy  K j}  Kj�  Kj�  Kj�  K j�  K j�  K j�  Kj�  Kj�  Kj�  K j�  K j�  K j�  Kj�  K j�  K uub.