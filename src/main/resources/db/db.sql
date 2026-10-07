CREATE TABLE Tiendadb.products (
    product_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(255),
    product_code VARCHAR(255),
    product_description VARCHAR(255),
    product_price DOUBLE
);
