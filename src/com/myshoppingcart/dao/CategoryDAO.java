package com.myshoppingcart.dao;

import java.util.List;

import com.myshoppingcart.entity.Category;

public interface CategoryDAO {
	

	public Category getCatogory(int id);
	public List<Category> getCatogoryList();
	
	public Boolean addCategory(Category cat);
	public Boolean updateCategory(Category cat);
	public Boolean deleteCategory(Category cat);
}
