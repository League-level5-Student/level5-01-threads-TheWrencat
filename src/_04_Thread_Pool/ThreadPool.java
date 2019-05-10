package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
	private Thread[] threads;
	private ConcurrentLinkedQueue<Task> taskQueue;
	
	ThreadPool(int totalThreads){
		for(int i = 0; i < threads.length; i++) {
			threads[i] = new Thread();
			
		}
	}
	
}
