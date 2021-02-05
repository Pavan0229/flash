/**
 * 
 */
package com.dailycodebuffer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.Model.Department;

/**
 * @author Praveena
 *
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
