package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {

	private ConcurrentLinkedQueue<Task> taskQueue;

	Worker(ConcurrentLinkedQueue<Task> taskQueue){
		this.taskQueue = taskQueue;

	}
	
	@Override
	public void run() {
		while(taskQueue.size() > 0) {
			Task task = taskQueue.remove();
			task.perform();
		}
	}


}
