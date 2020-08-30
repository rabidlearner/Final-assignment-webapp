package com.example.demo;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DonorService {
	@Autowired
	DonorRepository objDonerRepo;
	
	public List<Doner> getAllDonors() {
		
		ArrayList<Doner>  allDonors = new ArrayList<>();
		objDonerRepo.findAll().forEach(allDonors::add);
		
		return allDonors;
	}
	
	
	public void addDonor(Doner d) {
		objDonerRepo.save(d);
	
	}
	public void deleteDonor(String phone) {
		objDonerRepo.deleteById(phone);
	}
	public void updateDonor(Doner updatedDonor,String phone) {
		
		objDonerRepo.save(updatedDonor);
	}

}
