package com.progress.learning.basic.Chapter5;

public class breakAndContinue extends Thread{
	public static void main(String[] args) throws InterruptedException {
		doWhileContinious(args);
	}

	public static void forLoopTimeLimitation(String[] args) {
		for (int process = 0; process < 50; process++) {
			try{
				Thread.sleep(500);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			System.out.println("Process used " + process);
			if (process == 30){
				System.out.println("Process out of limit by : " + process);
				break;
			}
		}
		System.out.println("process exhausted");
	}

	public static void whileLoopIteration(String[] args) {
		int processThread = 0;

		do{
			System.out.println("Process thread " + processThread);
			processThread++;

			if (processThread == 45){
				System.out.println("Threads exhausted at : " + processThread);
				break;
			}
		} while (processThread < 50);
		System.out.println("Command Failed");
	}

	public static void continueStringLoop(String[] args) throws InterruptedException {
		for (int processContinuity = 0; processContinuity < 30; processContinuity++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException ignored){
				throw new InterruptedException("ignored");
			}
			System.out.println("Process Iterations : " + processContinuity);
			if (processContinuity == 15){
				System.out.println("Half, Process Exhausted at " + processContinuity);
				continue;
			}
			System.out.print(" process are in use");
		}
	}

	public static void doWhileContinious(String[] args) {
		int threads = 0;
		do{
			threads++;
			if (threads == 26){
				System.out.println("Warning, " + threads + " Threads are used");
				continue;
			}
			System.out.println("Threads " + threads);
		}while (threads < 30);
	}

}