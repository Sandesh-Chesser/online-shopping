package com.sandesh.shoppingbackend.dao;

import java.util.List;

import com.sandesh.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	boolean add(Category category);
	List<Category> list();
	Category get(Integer id);
	boolean update(Category category);
	boolean delete(Category category);
}
