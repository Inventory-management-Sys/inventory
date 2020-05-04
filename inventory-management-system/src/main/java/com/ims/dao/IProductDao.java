package com.ims.dao;

import org.springframework.data.repository.CrudRepository;

import com.ims.model.Product;

public interface IProductDao extends CrudRepository<Product,Integer> {

}
