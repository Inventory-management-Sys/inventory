package com.ims.dao;

import org.springframework.data.repository.CrudRepository;

import com.ims.model.Product;

public interface ProductDao extends CrudRepository<Product,Integer>{
	

}
