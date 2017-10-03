package com.sandesh.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sandesh.shoppingbackend.config.HibernateConfig;
import com.sandesh.shoppingbackend.dao.CategoryDAO;
import com.sandesh.shoppingbackend.dto.Category;

public class CategoryTestCase {
	private static CategoryDAO categoryDAO;
	private static AnnotationConfigApplicationContext appContext;
	private Category category;
	
	
	@BeforeClass
	public static void init() {
		appContext = new AnnotationConfigApplicationContext(HibernateConfig.class);
		appContext.scan("com.sandesh.shoppingbackend");
		categoryDAO = (CategoryDAO) appContext.getBean("categoryDAO");
	}
	
//	@Test
	public void testAddCategory() {
		category = new Category();
		category.setActive(true);
		category.setDescription("This is a sample description");
		category.setImageUrl("SAMPLE_URL");
		category.setName("Sample Name");
		assertEquals("Record successfully added ...", true, categoryDAO.add(category));
	}
	
//	@Test
	public void testGetCategory() {
		category = categoryDAO.get(1);
		assertEquals(Integer.valueOf(1), category.getId());
	}
	
//	@Test
	public void testUpdateCategory() {
		category = categoryDAO.get(3);
		category.setName("Sample Name Modified");
		assertEquals("Record successfully updated ...", true, categoryDAO.update(category));
	}
	
//	@Test
	public void testDeleteCategory() {
		category = categoryDAO.get(5);
		assertEquals("Record successfully deleted ...", true, categoryDAO.delete(category));
	}
	
//	@Test
	public void testGetAllCategory() {
		System.out.println(categoryDAO.list());
	}
	
}
