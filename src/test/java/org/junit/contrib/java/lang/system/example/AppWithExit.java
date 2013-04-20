package org.junit.contrib.java.lang.system.example;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class AppWithExit {
        public static final String TEST_EXIT = "exit ...";
        
	public static String message = null;

	public static void doSomethingAndExit() {
		message = TEST_EXIT;
		System.exit(1);
	}

	public static void doNothing() {
	}
        
        public static void doSomethingInThreadAndExit() {
            Executor e = Executors.newSingleThreadExecutor();
            
            e.execute(new Runnable() {

                public void run() {
                    message = TEST_EXIT;
                    System.exit(1);
                }
                
            });
        }
}
