package com.kxt.thread;

public class ThreadLocalTest extends Thread {

	private SequeceNum sequeceNum;

	public ThreadLocalTest(SequeceNum sequeceNum) {
		super();
		this.sequeceNum = sequeceNum;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {//��ÿ���̴߳��3������ֵ
			System.out.println("thread["+Thread.currentThread().getName()+
			"] sn["+sequeceNum.getNextNum()+"]");
			}
	}
	
	

}
