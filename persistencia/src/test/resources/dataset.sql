insert into ciudad values(3, "Armenia");
insert into ciudad values(2, "Medellin");
insert into ciudad values(1, "Cartagena");

insert into administrador values ("2054", "admin@gmail.com", "Admin", "0000");

insert into administrador_hotel values ("1099", "admin1@gmail.com", "Admin1", "0001");
insert into administrador_hotel values ("1005", "admin2@gmail.com", "Admin2", "0002");

insert into cliente values ("1094", "nn1@gmail.com", "nn1", "1234", 1);
insert into cliente values ("1095", "nn2@gmail.com", "nn2", "124", 2);
insert into cliente values ("1096", "nn3@gmail.com", "nn3", "12", 3);


insert into cama values (1, "doble");
insert into cama values (2, "sencilla");
insert into cama values (3, "doble");

insert into hotel values(1, "caltagena menol calle 5 avenida nome olvides", 5, "Los indios", "7324051", "1099", 1);
insert into hotel values(2, "pruebalo bien en la 6ta de mil amores", 5, "Los indios2.0", "7324052", "1005", 3);

insert into habitacion values (1, 2, 196400, 1);
insert into habitacion values (2, 6, 540000, 1);
insert into habitacion values (3, 10, 1050000, 2);

insert into reserva values (1, 6, 1, "2022-06-01", "2022-05-20", "2022-04-21", 889785,"1096" );

insert into reserva_habitaciones values (1,2);

insert into vuelo values (10, "vivaColombia", 1);


insert into silla values (1, "10", 432232, 10);

insert into silla_reservas values (1,1);

insert into actividad values (1, "paseo en lancha", 158432, 1);
insert into actividad values (2, "pesca deportiva", 5000, 1);

insert into caracteristica values (0, "nn", "2", 1,1);
insert into caracteristica values (2, "nn", "2", 2,2);


insert into comentario values (1, 4, "Muy bueno", "2022-04-05","1094", 1);

insert into vehiculo values ("bot670", 12235, "automovil", 1);
