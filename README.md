# jsf-spring-boot
JSF 2.3 + Spring Boot 2 sample application

## Instructions
Build it with maven and run the war as if it was an standard jar:

`java -jar target/la-mejor-cocina-1.0.0.jar`

It will launch a JSF and Spring powered website that you can access at http://localhost:8080/la-mejor-cocina/factura-query.xhtml



for testing
select * from (select c.nombre, c.apellido1, c.apellido2,sum(df.importe) total_consumido 
from cliente c, factura f, detalle_factura df 
where c.id_cliente=f.id_cliente and f.id_factura=df.id_factura 
group by c.nombre, c.apellido1, c.apellido2) sc where  sc.total_consumido>=100000


insert into cliente (id_cliente,nombre, apellido1, apellido2) values (1,'jorge eliecer', 'sierra', 'torres');
insert into cliente (id_cliente,nombre, apellido1, apellido2) values (2,'javier', 'perez', 'torres');
insert into cliente (id_cliente,nombre, apellido1, apellido2) values (3,'miguel', 'hernandez', 'torres');
insert into camarero (id_camarero,nombre, apellido1, apellido2) values (1,'john', 'bolanos', 'diaz');
insert into mesa (id_mesa,num_max_comensales) values (1,1);
insert into factura (id_factura,id_camarero,id_cliente,id_mesa,fecha_factura) values (1,1,2,1,current_date);
insert into factura (id_factura,id_camarero,id_cliente,id_mesa,fecha_factura) values (2,1,1,1,current_date);
insert into factura (id_factura,id_camarero,id_cliente,id_mesa,fecha_factura) values (3,1,3,1,current_date);
insert into cocinero (nombre,apellido1,apellido2) values ('edixon','morales','rodriguez');
insert into detalle_factura (id_factura,id_cocinero,plato,importe) values (2,1,'arroz',80000);
insert into detalle_factura (id_factura,id_cocinero,plato,importe) values (2,1,'jugo',10000);
insert into detalle_factura (id_factura,id_cocinero,plato,importe) values (1,1,'arroz',80000);
insert into detalle_factura (id_factura,id_cocinero,plato,importe) values (1,1,'jugo',10000);
insert into detalle_factura (id_factura,id_cocinero,plato,importe) values (1,1,'papas',10000);
insert into detalle_factura (id_factura,id_cocinero,plato,importe) values (3,1,'arroz',80000);
insert into detalle_factura (id_factura,id_cocinero,plato,importe) values (3,1,'jugo',10000);
insert into detalle_factura (id_factura,id_cocinero,plato,importe) values (3,1,'arroz',80000);