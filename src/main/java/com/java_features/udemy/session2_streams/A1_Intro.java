package com.java_features.udemy.session2_streams;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class A1_Intro {

	public void m1() {
		ExecutorService s = Executors.newFixedThreadPool(5);
		//for(int i = 0;i>10;i++) {
			Runnable runnableTask = () ->{
				
			};
		//}
		
		
		s.execute(runnableTask);
		s.shutdown();
	}
}
