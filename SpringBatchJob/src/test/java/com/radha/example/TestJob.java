package com.radha.example;


	import junit.framework.Assert;

	
	 import java.io.File;

	import org.junit.Test;
	
	import org.junit.runner.RunWith;
	
	import org.springframework.batch.core.BatchStatus;
	
	import org.springframework.batch.core.JobExecution;
	
	import org.springframework.batch.test.JobLauncherTestUtils;
	
	import org.springframework.beans.factory.annotation.Autowired;
	
	import org.springframework.test.context.ContextConfiguration;
	import org.springframework.test.context.TestExecutionListeners;
	
	
	
	import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
	
	 
	import org.springframework.test.context.support.*;
	
	 
	@RunWith(SpringJUnit4ClassRunner.class)
	@ContextConfiguration(locations={"classpath:META-INF/spring/context.config.xml",
			
			                                 "classpath:META-INF/spring/job-config.xml"})

	
	//@ContextConfiguration(locations={"C:\\Users\\radha\\workspace\\SpringBatchJob\\src\\test\\resources\\META_INF\\spring\\context.config.xml",
			
   // "C:\\Users\\radha\\workspace\\SpringBatchJob\\src\\test\\resources\\META_INF\\spring\\job-config.xml"})
	@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class })
	//@ContextConfiguration(locations = {"classpath:/WEB-INF/applicationContext.xml"})
	
	
	public class TestJob {
	
	     
	
	    @Autowired
	
	    private JobLauncherTestUtils launcher;
	
	 
	
	    @Test
	
	    public void testJob(){
	
	        try {
	
	            JobExecution execution = launcher.launchJob();
	
	            Assert.assertEquals(BatchStatus.COMPLETED, execution.getStatus());
	            
	
	        } catch (Exception e) {        
	
	            e.printStackTrace();
	            
	        }
	
	    }
	
	     
	
	    @Test
	
	    public void testStep(){
	
	        JobExecution execution = launcher.launchStep("batchStep");
	
	        Assert.assertEquals(BatchStatus.COMPLETED, execution.getStatus());
	
	    }
	
	}



