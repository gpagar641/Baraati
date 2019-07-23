/**
 * 
 */
package com.mavrik.baraati.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mavrik.baraati.model.SubCategories;

/**
 * @author kaushiku
 *
 */
public interface SubCategoryRepository extends JpaRepository<SubCategories, Integer>{
	
	List<SubCategories> findByIsUsed(int isUsed);

}
