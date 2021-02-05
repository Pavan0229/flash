/**
 * 
 */
package com.dailycodebuffer.Service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.Model.Department;
import com.dailycodebuffer.Repository.DepartmentRepository;

/**
 * @author Praveena
 *
 */
@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	public static final Logger log = LoggerFactory.getLogger(DepartmentRepository.class);

	public Department insert(Department dept) {
		dept.setDepartmentId(dept.getDepartmentId());
		dept.setDepartmentName(dept.getDepartmentName());
		dept.setDepartmentAddress(dept.getDepartmentAddress());
		dept.setDepartmentCode(dept.getDepartmentCode());
		log.info("Service the Inserted");
		return departmentRepository.save(dept);

	}
	
	public Optional<Department> findById(Long departmentid) {
		return departmentRepository.findById(departmentid);
		
		
	}

}
