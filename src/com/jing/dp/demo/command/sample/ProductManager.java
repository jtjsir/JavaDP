package com.jing.dp.demo.command.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author jingsir ���������
 **
 */
public class ProductManager {

	private static final int MAX_TASK_LEN = 5;

	// ���е����������
	private List<TaskCommand> taskCommands;

	// ���е����������
	private List<Programmer> programmers;

	public ProductManager() {
		taskCommands = new ArrayList<>();
		programmers = new ArrayList<>();
	}

	public void receiveCommand(TaskCommand command) {
		taskCommands.add(command);
	}

	public void addGrammer(Programmer gammmer) {
		programmers.add(gammmer);
	}

	public void dispatchCommand() {
		TaskCommand[] copy = new TaskCommand[taskCommands.size() > MAX_TASK_LEN ? taskCommands.size() - MAX_TASK_LEN
				: 0];

		int programmerLen = programmers.size();

		Random random = new Random();
		// �ַ���������
		for (int i = 0; i < MAX_TASK_LEN; i++) {
			programmers.get(random.nextInt(programmerLen)).processCommand(taskCommands.get(i));
		}

		System.arraycopy(taskCommands.toArray(),
				taskCommands.size() < MAX_TASK_LEN ? taskCommands.size() : MAX_TASK_LEN, copy, 0, copy.length);

		taskCommands = Arrays.asList(copy);
	}

	public void printFreecommands() {
		for(int i = 0 ; i < taskCommands.size();i++){
			taskCommands.get(i).displaySender();
		}
	}
}
