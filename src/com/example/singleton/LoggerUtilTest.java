package com.example.singleton;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LoggerUtilTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		LoggerUtil loggerUtil1 = LoggerUtil.getInstance();
		loggerUtil1.log("Logger1");
		LoggerUtil loggerUtil2 = null; //= LoggerUtil.getInstance();
		System.out.println(loggerUtil1 == loggerUtil2);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\M1034567\\Desktop\\TestFolder\\Singleton.ser")));
		objectOutputStream.writeObject(loggerUtil1);
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\M1034567\\Desktop\\TestFolder\\Singleton.ser")));
		loggerUtil2 = (LoggerUtil) objectInputStream.readObject();
		System.out.println(loggerUtil1 == loggerUtil2);
		loggerUtil1.log("Logger2");
		//LoggerTaskThread task1 = new LoggerTaskThread(new LoggerTask(), "Task1");
		//task1.start();
		//LoggerTaskThread task2 = new LoggerTaskThread(new LoggerTask(), "Task2");
		//task2.start();
	}
}

class LoggerTask {
	public void doTask() {
		LoggerUtil loggerUtil2 = LoggerUtil.getInstance();
		System.out.println(loggerUtil2);
	}
}

class LoggerTaskThread extends Thread {
	private LoggerTask loggerTask;
	private String name;
	public LoggerTaskThread(LoggerTask loggerTask, String name) {
		this.loggerTask = loggerTask;
		this.name = name;
	}
	@Override
	public void run() {
		for(int i = 1; i<=100; i++) {
			//try {
				//Thread.sleep(1000);
				System.out.println(this.name +"."+ i + " is executing");
				loggerTask.doTask();
				System.out.println(this.name + "."+ i + " execution completed");
			//} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
		//	}
		}	
	}
}
