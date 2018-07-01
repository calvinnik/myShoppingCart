package com.myshoppingcart.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.myshoppingcart.dao.CategoryDAO;
import com.myshoppingcart.entity.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	/*
	 * Defining a Static List for categories. this is just for test purpose.
	 */

	private static List<Category> catList = new ArrayList<>();

	static {
		Category category = new Category();

		// First Category
		category.setId(1);
		category.setName("Mobile");
		category.setDescription("This category has differnt Mobiles.");
		category.setImgURL("CAT_1");

		catList.add(category);

		// First Category
		category = new Category();
		category.setId(2);
		category.setName("Books");
		category.setDescription("This category has differnt Books.");
		category.setImgURL("CAT_2");

		catList.add(category);

		// Third Category
		category = new Category();
		category.setId(3);
		category.setName("Laptops");
		category.setDescription("This category has differnt laptops.");
		category.setImgURL("CAT_3");

		catList.add(category);

	}

	@Override
	public List<Category> getCatogoryList() {
		System.out.println(catList);
		return catList;
	}

}
