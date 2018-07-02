CREATE TABLE category(
	id int auto_increment,
    name varchar(30) not null,
    description varchar(200) not null,
    img_url varchar(20) not null,
    is_active boolean,
    
    constraint pk_category_id primary key(id)
);	

INSERT INTO category (name, description, img_url, is_active) VALUES ('Mobiles','This category has different mobiles','mob_1.jpg',true);
INSERT INTO category (name, description, img_url, is_active) VALUES ('Laptops','This category has different laptops','lap_1.jpg',true);
INSERT INTO category (name, description, img_url, is_active) VALUES ('TV','This category has different TVs','tv_1.jpg',true);
INSERT INTO category (name, description, img_url, is_active) VALUES ('Smart Watch','This category has different smart watches','swatch_1.jpg',true);


CREATE TABLE users(
	id int auto_increment,
	first_name varchar(25),
	last_name varchar(25),
	role varchar(25),
    enable boolean,
	password varchar(25),
	email varchar(25),
	contact_num varchar(25),
    
    constraint pk_users_id primary key(id)
);
INSERT INTO users (first_name, last_name, role, enable, password, email, contact_num) VALUES ('Calvin','Tomy','admin',true, 'admin', 'ct@example.com', '120019000');
INSERT INTO users (first_name, last_name, role, enable, password, email, contact_num) VALUES ('Ritwika','Kanungoe','supplier',true, 'btsbest', 'rk@example.com', '120019283');
INSERT INTO users (first_name, last_name, role, enable, password, email, contact_num) VALUES ('Nikhil','Tomy','supplier',true, 'cnt04', 'nt@example.com', '120019200');



CREATE TABLE product(
	id int auto_increment,
	code varchar(25),
	name varchar(25),
    brand varchar(25),
    description varchar(250),
    u_price decimal(10,2),
    quantity int,
    is_active boolean,
    category_id int,
    supplier_id int,
    purchaches int default 0,
    views int default 0,
    
    constraint pk_product_id primary key(id),
    constraint fk_product_category_id foreign key(category_id) references category(id),
    constraint fk_product_supplier_id foreign key(supplier_id) references users(id)
);

INSERT INTO product (code, name, brand, description, u_price, quantity, is_active, category_id, supplier_id) VALUES ('PRDABC123DEFX','iPhone 5s','Apple', 'This is one of the best phone available in the market right now!', 18000, 5, true, 1, 2);
INSERT INTO product (code, name, brand, description, u_price, quantity, is_active, category_id, supplier_id) VALUES ('PRDDEF123DEFX','Samsung Galaxy S8','Samsung', 'This is one of the best phone available in the market right now!', 18000, 8, true, 1, 3);
INSERT INTO product (code, name, brand, description, u_price, quantity, is_active, category_id, supplier_id) VALUES ('PRDPQR123WGTX','MacBook Pro','Apple', 'This is one of the best phone available in the market right now!', 120000, 10, true, 2, 2);
INSERT INTO product (code, name, brand, description, u_price, quantity, is_active, category_id, supplier_id) VALUES ('PRDMNO123PQRX','LG TV','LG', 'This is one of the best phone available in the market right now!', 26000, 2, true, 3, 3);
INSERT INTO product (code, name, brand, description, u_price, quantity, is_active, category_id, supplier_id) VALUES ('PRDABCXYZDEFX','Samsung Gear S3','Samsung', 'This is one of the best phone available in the market right now!', 15000, 5, true, 4, 3);
