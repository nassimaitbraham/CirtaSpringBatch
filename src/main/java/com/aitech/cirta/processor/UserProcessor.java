package com.aitech.cirta.processor;

import org.springframework.batch.item.ItemProcessor;

import com.aitech.cirta.model.Users;

/**
 * PersonClass qui permet de faire des traitements sur les donnees avant d etre persister par le itemWriter
 * 
 * @author Nassim AIT BRAHAM
 *
 */
public class UserProcessor implements ItemProcessor<Users, Users>{

	public Users process(final Users userInput) throws Exception {
		Users personneOutput = new Users();
		personneOutput.setAddresse(userInput.getAddresse());
		personneOutput.setId(userInput.getId());
		personneOutput.setNom(userInput.getNom());
		personneOutput.setPrenom(userInput.getPrenom());
		
		return personneOutput;
	}
	
	

}
