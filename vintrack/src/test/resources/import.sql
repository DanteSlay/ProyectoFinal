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

-- Insertar vinos

-- Vinos Tintos
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Torres Mas La Plana', 'Un vino tinto de alta gama de Bodegas Torres', 50.0, 2017, 14.0, 750, 50, 'torres_mas_la_plana.jpg', 1, 1, 4, 1, 3, 35.0, 0);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Vega Sicilia Único', 'El vino más emblemático de Vega Sicilia', 300.0, 2011, 14.5, 750, 30, 'vega_sicilia_unico.jpg', 1, 1, 1, 2, 4, 200.0, 10);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Muga Reserva', 'Un clásico de La Rioja', 15.0, 2015, 13.5, 750, 200, 'muga_reserva.jpg', 1, 1, 1, 3, 2, 10.0, 0);
INSERT INTO vinos (nombre, descripcion, precio_venta, año_produccion, grados_alcohol, volumen_botella, cantidad, imagen, tipo_vino_id, pais_id, tipo_uva_id, bodega_id, crianza_id, precio_costo, descuento) VALUES ('Marqués de Riscal Reserva', 'Un vino tinto reserva de Marqués de Riscal', 20.0, 2016, 14.0, 750, 150, 'marques_de_riscal_reserva.jpg', 1, 1, 1, 4, 2, 15.0, 5);
