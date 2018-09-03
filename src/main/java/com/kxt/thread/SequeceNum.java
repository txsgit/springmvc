package com.kxt.thread;
/**
 * 使用threadLocal的变量seqNum
 * @author Administrator
 *
 */
public class SequeceNum {
 
	//①通过匿名内部类覆盖ThreadLocal的initialValue()方法，指定初始值
	private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>(){
	public Integer initialValue(){
	return 0;
	}
	};
	//②获取下一个序列值
	public int getNextNum(){
	seqNum.set(seqNum.get()+1);
	return seqNum.get();
	}
}
