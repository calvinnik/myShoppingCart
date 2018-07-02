package com.myshoppingcart.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myshoppingcart.dao.CategoryDAO;
import com.myshoppingcart.entity.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	/*
	 * Defining SessionFactory object and using Autowired to create bean
	 */
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Category> getCatogoryList() {
		String hQuery = "FROM Category WHERE isActive = :active";
		Query<Category> theQ = sessionFactory.getCurrentSession().createQuery(hQuery, Category.class);
		theQ.setParameter("active", true);
		
		return theQ.getResultList();
	}

	@Override
	public Category getCatogory(int id) {
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override
	public Boolean addCategory(Category cat) {
		try {
		sessionFactory.getCurrentSession().save(cat);
		return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	/*
	 * Updating a Single Category
	 * */
	@Override
	public Boolean updateCategory(Category cat) {
		try {
			sessionFactory.getCurrentSession().update(cat);
			return true;
			}
			catch(Exception e){
				e.printStackTrace();
				return false;
			}
	}
	
	/*
	 * Deleting will be soft delete.
	 * that means that the isActive field will be set to false.
	 * */

	@Override
	public Boolean deleteCategory(Category cat) {
		
		cat.setIsActive(false);
		try {
			sessionFactory.getCurrentSession().update(cat);
			return true;
			}
			catch(Exception e){
				e.printStackTrace();
				return false;
			}
	}

}
