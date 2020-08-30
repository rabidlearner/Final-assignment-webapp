package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DonorController {
	
	@Autowired
	private DonorService objDonorSevice;
	
	@CrossOrigin
	@RequestMapping("/donors")
	public java.util.List<Doner> getAllDonors() {
		
		return objDonorSevice.getAllDonors();
	
	}
	@CrossOrigin
	@RequestMapping(method=RequestMethod.POST, value= "/donors")
	public void addDonor(@RequestBody Doner newdoner) {
		objDonorSevice.addDonor(newdoner);
	}
	@CrossOrigin
	@RequestMapping(method=RequestMethod.DELETE, value= "/donors/{id}")
	public void deleteDonor(@PathVariable String id) {
		objDonorSevice.deleteDonor(id);
	}
	@CrossOrigin
	@RequestMapping(method=RequestMethod.PUT,value="/donors/{id}")
	public void updateDonor(@RequestBody Doner updatedDonor,@PathVariable String id) {
		objDonorSevice.updateDonor(updatedDonor,id);
	}

}
