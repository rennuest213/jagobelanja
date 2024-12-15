package com.jagobelanja.service;

import com.jagobelanja.entity.Product;


import java.util.List;


public interface ProductService {
    //get all product
    List<Product> getProducts();

    //get product by id
    Product getProduct(long id);

    //add product
    Product addProduct(Product product);

    //update product
    Product updateProduct(Product product);

    //delete product
    void deleteProduct(long id);
}
