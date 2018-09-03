package com.kxt.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;


/**
 * 创建并发线程
 * @author Administrator
 *
 */
public class CountDownLatchTest {
	
	public static final List<Integer> datas = new ArrayList<>();
	public static  CountDownLatch latch=new CountDownLatch(20);//定义发令枪,20个线程
	public static int count=0;
	public static void main(String[] args) {
		
		
		
		
		
		for(int i=0;i<20;i++)
		{
			
			new Thread(new countTest()).start();
			
			latch.countDown();//每个任务提交完毕后执行
		}
		
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//如果list大小<=2000说明是并发线程，线程并发争抢资源肯定有线程没有执行完就结束了
		System.out.println(datas.size());
	}
	
	 public static class countTest implements Runnable{

		@Override
		public void run() {
			
			try {
				latch.await();//这里等待其他线程就绪后开始放行
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 for (int i = 0; i < 1000; i++) {
		            datas.add(i);
		        }

			System.out.println("当前线程："+Thread.currentThread().getName());
		}
		
	}

}
