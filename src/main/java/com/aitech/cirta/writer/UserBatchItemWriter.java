package com.aitech.cirta.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.aitech.cirta.model.Users;




/**
 * Item Writer
 * 
 * @author Nassim AIT BRAHAM
 *
 */

public class UserBatchItemWriter implements ItemWriter<Users>{
	
	
	
	public void write(List<? extends Users> items) throws Exception {
		for (Users personne : items) {
			final Object object [] = {personne.getNom(),personne.getPrenom(), personne.getAddresse(),personne.getId()};
			
			System.out.println(personne.toString());
			
			
		}
	}

	
	
	
	

}
