import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.example.singleton.SingletonByExample;

class Task {
	public synchronized void doTask(String name) {
		synchronized(Task.class) {
		System.out.println("Starting of Thread " + name);
		for (int i = 0; i < 10; i++) {
			System.out.println("Printing :" + i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) { }
		}
		System.out.println("Completed " + name);
		}
	}
}

class ThreadTask extends Thread {
	private Task task;
	private String name;
	public ThreadTask(Task task, String name) {
		 this.task = task;
		 this.name = name;
	}
	@Override
	public void run() {
		 task.doTask(name);
	}
}

public class SingleThreadByExample {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SingletonByExample singleton1 = SingletonByExample.getInstance();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\M1034567\\Desktop\\singleton.ser")));
		objectOutputStream.writeObject(singleton1);
		SingletonByExample singleton2; //= SingletonByExample.getInstance();
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\M1034567\\Desktop\\singleton.ser")));
		singleton2  = (SingletonByExample) objectInputStream.readObject();
		System.out.println(singleton1 == singleton2);
		/*
		System.out.println("Main method started");
		Task task = new Task();
		//task.doTask();
		ThreadTask threadTask1 = new ThreadTask(task, "t1");
		ThreadTask threadTask2 = new ThreadTask(task, "t2");
		threadTask1.start();
		threadTask2.start();
		Task newTask = new Task();
		newTask.doTask("m1");
		System.out.println("Main method completed");
		*/
	}
	
	

}
