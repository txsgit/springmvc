package com.kxt.thread;
/**
 * ʹ��threadLocal�ı���seqNum
 * @author Administrator
 *
 */
public class SequeceNum {
 
	//��ͨ�������ڲ��า��ThreadLocal��initialValue()������ָ����ʼֵ
	private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>(){
	public Integer initialValue(){
	return 0;
	}
	};
	//�ڻ�ȡ��һ������ֵ
	public int getNextNum(){
	seqNum.set(seqNum.get()+1);
	return seqNum.get();
	}
}
