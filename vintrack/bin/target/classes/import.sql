-- Insertar roles

INSERT INTO roles (nombre, descripcion) VALUES ('COMERCIAL', 'Puede realizar ventas a clientes y revisar todas ventas de un cliente.');
INSERT INTO roles (nombre, descripcion) VALUES ('ENCARGADO', 'Tiene los mismos beneficios del comercial y tambien puede gestionar compras a bodegas.');
INSERT INTO roles (nombre, descripcion) VALUES ('ADMINISTRATIVO', 'Tiene todos los privilegios.');

-- Insertar empleados

-- Empleado 1: Comercial
INSERT INTO empleados (nombre, apellido, username, email, fecha_nacimiento) VALUES ('Juan', 'Pérez', 'juanperez', 'juan@example.com', '1990-05-15');
-- Asignar rol de COMERCIAL al empleado Juan Pérez
INSERT INTO empleados_roles (empleados_id, roles_id) VALUES (1, 1);

-- Empleado 2: Encargado
INSERT INTO empleados (nombre, apellido, username, email, fecha_nacimiento) VALUES ('María', 'García', 'mariagarcia', 'maria@example.com', '1985-08-20');
-- Asignar rol de ENCARGADO al empleado María García
INSERT INTO empleados_roles (empleados_id, roles_id) VALUES (2, 2);

-- Empleado 3: Administrativo
INSERT INTO empleados (nombre, apellido, username, email, fecha_nacimiento) VALUES ('Pedro', 'López', 'pedrolopez', 'pedro@example.com', '1995-03-10');
-- Asignar rol de ADMINISTRATIVO al empleado Pedro López
INSERT INTO empleados_roles (empleados_id, roles_id) VALUES (3, 3);

-- Insertar clientes

INSERT INTO clientes (nombre, apellido, email, telefono) VALUES ('Cliente', '1', 'cliente1@gmail.com', '664236723');

-- Insertar tipos de vino

INSERT INTO tipo_vinos (nombre) VALUES ('TINTO');
INSERT INTO tipo_vinos (nombre) VALUES ('BLANCO');
INSERT INTO tipo_vinos (nombre) VALUES ('ROSADO');

-- Insertar variedades de uva

INSERT INTO uvas (nombre, descripcion) VALUES ('TEMPRANILLO', 'El Tempranillo es una de las variedades de uva más importantes en la vinicultura española.');
INSERT INTO uvas (nombre, descripcion) VALUES ('Pinot Noir', 'La Pinot Noir es una variedad de uva tinta utilizada en la producción de vino tinto.');
INSERT INTO uvas (nombre, descripcion) VALUES ('Sauvignon Blanc', 'La Sauvignon Blanc es una variedad de uva blanca utilizada en la producción de vino blanco seco y afrutado.');
INSERT INTO uvas (nombre, descripcion) VALUES ('Cabernet Sauvignon', 'Cabernet Sauvignon es una de las variedades de uva más conocidas y utilizadas en la producción de vino tinto.');
INSERT INTO uvas (nombre, descripcion) VALUES ('Merlot', 'Merlot es una variedad de uva tinta que produce vinos suaves y afrutados.');
INSERT INTO uvas (nombre, descripcion) VALUES ('Chardonnay', 'Chardonnay es una variedad de uva blanca que produce vinos blancos secos y espumosos.');
INSERT INTO uvas (nombre, descripcion) VALUES ('Syrah', 'Syrah es una variedad de uva tinta que produce vinos intensos y especiados.');
INSERT INTO uvas (nombre, descripcion) VALUES ('Malbec', 'Malbec es una variedad de uva tinta conocida por sus vinos oscuros y afrutados.');
INSERT INTO uvas (nombre, descripcion) VALUES ('Garnacha', 'Garnacha es una variedad de uva tinta que produce vinos suaves y afrutados.');
INSERT INTO uvas (nombre, descripcion) VALUES ('Riesling', 'Riesling es una variedad de uva blanca que produce vinos blancos aromáticos y afrutados.');
INSERT INTO uvas (nombre, descripcion) VALUES ('Zinfandel', 'Zinfandel es una variedad de uva tinta conocida por sus vinos ricos y especiados.');
INSERT INTO uvas (nombre, descripcion) VALUES ('Nebbiolo', 'Nebbiolo es una variedad de uva tinta que produce vinos con cuerpo y taninos firmes.');
INSERT INTO uvas (nombre, descripcion) VALUES ('Barbera', 'Barbera es una variedad de uva tinta que produce vinos frescos y afrutados.');
INSERT INTO uvas (nombre, descripcion) VALUES ('Sangiovese', 'Sangiovese es una variedad de uva tinta utilizada en la producción de vinos italianos.');

-- Insertar tipos de crianza

INSERT INTO crianza_vinos (nombre) VALUES ('JOVEN');
INSERT INTO crianza_vinos (nombre) VALUES ('CRIANZA');
INSERT INTO crianza_vinos (nombre) VALUES ('RESERVA');
INSERT INTO crianza_vinos (nombre) VALUES ('GRAN RESERVA');

-- Insertar países

INSERT INTO paises (nombre) VALUES ('ESPAÑA');
INSERT INTO paises (nombre) VALUES ('FRANCIA');
INSERT INTO paises (nombre) VALUES ('ITALIA');
INSERT INTO paises (nombre) VALUES ('ARGENTINA');
INSERT INTO paises (nombre) VALUES ('CHILE');
INSERT INTO paises (nombre) VALUES ('ESTADOS UNIDOS');
INSERT INTO paises (nombre) VALUES ('AUSTRALIA');
INSERT INTO paises (nombre) VALUES ('SUDÁFRICA');
INSERT INTO paises (nombre) VALUES ('ALEMANIA');
INSERT INTO paises (nombre) VALUES ('NUEVA ZELANDA');

-- Insertar bodegas

INSERT INTO bodegas (nombre, web, direccion, email, telefono, pais_id) VALUES ('Bodegas Torres', 'www.torres.es', 'Barcelona, España', 'info@torres.es', '937123456', 1);
INSERT INTO bodegas (nombre, web, direccion, email, telefono, pais_id) VALUES ('Bodegas Vega Sicilia', 'www.vega-sicilia.com', 'Valladolid, España', 'info@vega-sicilia.com', '983123456', 1);
INSERT INTO bodegas (nombre, web, direccion, email, telefono, pais_id) VALUES ('Bodegas Muga', 'www.bodegasmuga.com', 'La Rioja, España', 'info@bodegasmuga.com', '941123456', 1);
INSERT INTO bodegas (nombre, web, direccion, email, telefono, pais_id) VALUES ('Bodegas Marqués de Riscal', 'www.marquesderiscal.com', 'Álava, España', 'info@marquesderiscal.com', '945123456', 1);
INSERT INTO bodegas (nombre, web, direccion, email, telefono, pais_id) VALUES ('Bodegas Protos', 'www.bodegasprotos.com', 'Valladolid, España', 'info@bodegasprotos.com', '983123456', 1);
INSERT INTO bodegas (nombre, web, direccion, email, telefono, pais_id) VALUES ('Bodegas Ramón Bilbao', 'www.bodegasramonbilbao.com', 'La Rioja, España', 'info@bodegasramonbilbao.com', '941123456', 1);
INSERT INTO bodegas (nombre, web, direccion, email, telefono, pais_id) VALUES ('Bodegas Faustino', 'www.bodegasfaustino.com', 'Álava, España', 'info@bodegasfaustino.com', '945123456', 1);
INSERT INTO bodegas (nombre, web, direccion, email, telefono, pais_id) VALUES ('Bodegas Campo Viejo', 'www.campoviejo.com', 'La Rioja, España', 'info@campoviejo.com', '941123456', 1);
INSERT INTO bodegas (nombre, web, direccion, email, telefono, pais_id) VALUES ('Bodegas Pesquera', 'www.bodegaspesquera.com', 'Valladolid, España', 'info@bodegaspesquera.com', '983123456', 1);
INSERT INTO bodegas (nombre, web, direccion, email, telefono, pais_id) VALUES ('Bodegas Marqués de Cáceres', 'www.marquesdecaceres.com', 'La Rioja, España', 'info@marquesdecaceres.com', '941123456', 1);
INSERT INTO bodegas (nombre, web, direccion, email, telefono, pais_id) VALUES ('Château Margaux', 'www.chateau-margaux.com', 'Bordeaux, Francia', 'info@chateau-margaux.com', '557123456', 2);
INSERT INTO bodegas (nombre, web, direccion, email, telefono, pais_id) VALUES ('Château Lafite Rothschild', 'www.lafite.com', 'Bordeaux, Francia', 'info@lafite.com', '557123456', 2);
INSERT INTO bodegas (nombre, web, direccion, email, telefono, pais_id) VALUES ('Château Mouton Rothschild', 'www.chateau-mouton-rothschild.com', 'Bordeaux, Francia', 'info@chateau-mouton-rothschild.com', '557123456', 2);
INSERT INTO bodegas (nombre, web, direccion, email, telefono, pais_id) VALUES ('Château Latour', 'www.chateau-latour.com', 'Bordeaux, Francia', 'info@chateau-latour.com', '557123456', 2);
INSERT INTO bodegas (nombre, web, direccion, email, telefono, pais_id) VALUES ('Château Haut-Brion', 'www.haut-brion.com', 'Bordeaux, Francia', 'info@haut-brion.com', '557123456', 2);
INSERT INTO bodegas (nombre, web, direccion, email, telefono, pais_id) VALUES ('Marchesi Antinori', 'www.antinori.it', 'Florencia, Italia', 'info@antinori.it', '557123456', 3);
INSERT INTO bodegas (nombre, web, direccion, email, telefono, pais_id) VALUES ('Tenuta San Guido', 'www.tenutasanguido.com', 'Toscana, Italia', 'info@tenutasanguido.com', '557123456', 3);
INSERT INTO bodegas (nombre, web, direccion, email, telefono, pais_id) VALUES ('Bodegas Catena Zapata', 'www.catenawines.com', 'Mendoza, Argentina', 'info@catenawines.com', '261123456', 4);
INSERT INTO bodegas (nombre, web, direccion, email, telefono, pais_id) VALUES ('Viña Concha y Toro', 'www.conchaytoro.com', 'Santiago, Chile', 'info@conchaytoro.com', '226123456', 5);
INSERT INTO bodegas (nombre, web, direccion, email, telefono, pais_id) VALUES ('Robert Mondavi Winery', 'www.robertmondaviwinery.com', 'California, EE.UU.', 'info@robertmondaviwinery.com', '707123456', 6);

-- Insertar vinos

-- Vinos Tintos
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Torres Mas La Plana', 'Un vino tinto de alta gama de Bodegas Torres', 50.0, 2017, 14.0, 750, 50, 'torres_mas_la_plana.jpg', 1, 1, 4, 1, 3, 35.0, 0);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Vega Sicilia Único', 'El vino más emblemático de Vega Sicilia', 300.0, 2011, 14.5, 750, 30, 'vega_sicilia_unico.jpg', 1, 1, 1, 2, 4, 200.0, 10);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Muga Reserva', 'Un clásico de La Rioja', 15.0, 2015, 13.5, 750, 200, 'muga_reserva.jpg', 1, 1, 1, 3, 2, 10.0, 0);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Marqués de Riscal Reserva', 'Un vino tinto reserva de Marqués de Riscal', 20.0, 2016, 14.0, 750, 150, 'marques_de_riscal_reserva.jpg', 1, 1, 1, 4, 2, 15.0, 5);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Protos Crianza', 'Un vino tinto crianza de Protos', 18.0, 2016, 14.0, 750, 150, 'protos_crianza.jpg', 1, 1, 1, 5, 2, 12.0, 0);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Ramón Bilbao Edición Limitada', 'Un vino tinto edición limitada de Ramón Bilbao', 25.0, 2018, 14.5, 750, 100, 'ramon_bilbao_edicion_limitada.jpg', 1, 1, 1, 6, 2, 18.0, 20);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Faustino I Gran Reserva', 'Un vino gran reserva de Faustino', 35.0, 2009, 13.5, 750, 80, 'faustino_i_gran_reserva.jpg', 1, 1, 1, 7, 4, 25.0, 0);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Campo Viejo Reserva', 'Un vino tinto reserva de Campo Viejo', 15.0, 2015, 13.5, 750, 200, 'campo_viejo_reserva.jpg', 1, 1, 1, 8, 2, 10.0, 0);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Pesquera Crianza', 'Un vino tinto crianza de Pesquera', 20.0, 2016, 14.0, 750, 150, 'pesquera_crianza.jpg', 1, 1, 1, 9, 2, 15.0, 0);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Marqués de Cáceres Gran Reserva', 'Un vino gran reserva de Marqués de Cáceres', 30.0, 2010, 14.0, 750, 100, 'marques_de_caceres_gran_reserva.jpg', 1, 1, 1, 10, 4, 20.0, 0);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Château Margaux 2015', 'Un vino tinto de alta gama de Château Margaux', 500.0, 2015, 13.5, 750, 20, 'chateau_margaux_2015.jpg', 1, 2, 13, 11, 3, 350.0, 0);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Château Lafite Rothschild 2014', 'Un vino tinto de alta gama de Château Lafite Rothschild', 600.0, 2014, 13.5, 750, 20, 'chateau_lafite_rothschild_2014.jpg', 1, 2, 13, 12, 3, 400.0, 0);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Château Mouton Rothschild 2016', 'Un vino tinto de alta gama de Château Mouton Rothschild', 700.0, 2016, 13.5, 750, 15, 'chateau_mouton_rothschild_2016.jpg', 1, 2, 13, 13, 3, 450.0, 0);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Château Latour 2012', 'Un vino tinto de alta gama de Château Latour', 550.0, 2012, 13.5, 750, 20, 'chateau_latour_2012.jpg', 1, 2, 13, 14, 3, 375.0, 0);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Château Haut-Brion 2013', 'Un vino tinto de alta gama de Château Haut-Brion', 650.0, 2013, 13.5, 750, 18, 'chateau_haut_brion_2013.jpg', 1, 2, 13, 15, 3, 425.0, 0);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Tignanello 2015', 'Un vino tinto de alta gama de Marchesi Antinori', 120.0, 2015, 14.0, 750, 60, 'tignanello_2015.jpg', 1, 3, 14, 16, 3, 80.0, 0);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Sassicaia 2016', 'Un vino tinto de alta gama de Tenuta San Guido', 200.0, 2016, 14.0, 750, 40, 'sassicaia_2016.jpg', 1, 3, 14, 17, 3, 150.0, 0);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Catena Zapata Malbec Argentino 2017', 'Un vino tinto de alta gama de Bodegas Catena Zapata', 100.0, 2017, 14.5, 750, 80, 'catena_zapata_malbec_argentino_2017.jpg', 1, 4, 8, 18, 3, 65.0, 0);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Don Melchor 2015', 'Un vino tinto de alta gama de Viña Concha y Toro', 90.0, 2015, 14.0, 750, 80, 'don_melchor_2015.jpg', 1, 5, 4, 19, 3, 60.0, 0);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Robert Mondavi Cabernet Sauvignon 2016', 'Un vino tinto de alta gama de Robert Mondavi Winery', 70.0, 2016, 14.5, 750, 100, 'robert_mondavi_cabernet_sauvignon_2016.jpg', 1, 6, 4, 20, 3, 45.0, 0);
