package com.aitech.cirta.launcher;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Classe qui va lancer le batch
 * 
 * @author Nassim AIT BRAHAM
 *
 */
public class GetUsersBatchLauncher {
	
	public static void main (String [] args) throws Exception {
		
		// Chargement du context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cirta-batch-context.xml");

		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		
		Job job = (Job) context.getBean("importUsers");
			
		// Constitution de l'identite de l'instance du job 
		JobParameters parameter = new JobParametersBuilder().addDate("date", new Date()).toJobParameters();
		
		jobLauncher.run(job, parameter);
	}

}
