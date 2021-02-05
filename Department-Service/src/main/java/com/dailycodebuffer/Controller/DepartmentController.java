/**
 * 
 */
package com.dailycodebuffer.Controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.Model.Department;
import com.dailycodebuffer.Service.DepartmentService;

/**
 * @author Praveena
 *
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	@Autowired
	public static final Logger log=LoggerFactory.getLogger(DepartmentService.class);	
	
	
	@PostMapping("/")
	public Department InsertMethod(@RequestBody Department depts) {
		log.info("Controller Inserted");
		return departmentService.insert(depts);
	}
	
	@GetMapping("/{Id}")
	public Optional<Department> find(@PathVariable Long Id) {
		return departmentService.findById(Id);
	}
	
	
}
