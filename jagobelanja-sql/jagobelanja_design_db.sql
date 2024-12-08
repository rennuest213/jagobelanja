CREATE TABLE users(
	id INT PRIMARY KEY IDENTITY(1,1),
	username VARCHAR(255) UNIQUE NOT NULL,
	[password] VARCHAR(255) NOT NULL,
	email VARCHAR(255) UNIQUE NOT NULL,
	first_name VARCHAR(255) NOT NULL,
	last_name VARCHAR(255),
	phone_number VARCHAR(20),
	[address] VARCHAR(255),
	created_at DATETIME,
	updated_at DATETIME
);

CREATE INDEX ix_users_username ON users(username);

CREATE TABLE roles(
	id INT PRIMARY KEY IDENTITY(1,1),
	[name] VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE user_roles(
	user_id INT FOREIGN KEY REFERENCES users(id),
	role_id INT FOREIGN KEY REFERENCES roles(id)
);

CREATE TABLE categories(
	id INT PRIMARY KEY IDENTITY(1,1),
	[name] VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE products(
	id INT PRIMARY KEY IDENTITY(1,1),
	[name] VARCHAR(255) NOT NULL,
	[description] TEXT,
	price DECIMAL(10,2) NOT NULL,
	stock INT NOT NULL,
	image_url VARCHAR(255),
	category_id INT FOREIGN KEY REFERENCES categories(id),
	seller_id INT FOREIGN KEY REFERENCES users(id),
	created_at DATETIME,
	updated_at DATETIME
);

CREATE INDEX ix_products_name ON products([name]);

CREATE TABLE orders(
	id INT PRIMARY KEY IDENTITY(1,1),
	user_id INT FOREIGN KEY REFERENCES users(id),
	order_date DATETIME NOT NULL,
	total_amount DECIMAL(10,2) NOT NULL,
	[status] VARCHAR(255) NOT NULL,
	shipping_address VARCHAR(255),
	payment_method VARCHAR(255)
);

CREATE TABLE order_items(
	id INT PRIMARY KEY IDENTITY(1,1),
	order_id INT FOREIGN KEY REFERENCES orders(id),
	product_id INT FOREIGN KEY REFERENCES products(id),
	quantity INT NOT NULL,
	price DECIMAL(10,2) NOT NULL
);