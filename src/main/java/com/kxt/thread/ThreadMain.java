package com.kxt.thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadMain {

	public static void main(String[] args) {

		
		SequeceNum seqNum=new SequeceNum();
		
		ThreadLocalTest test1=new ThreadLocalTest(seqNum);
		ThreadLocalTest test2=new ThreadLocalTest(seqNum);
		ThreadLocalTest test3=new ThreadLocalTest(seqNum);
		
		test1.start();
		test2.start();
		test3.start();
		/*List<String> str3=new ArrayList<>();
		List<String> str1=new ArrayList<>();
		str1.add("1");
		str1.add("2");
		List<String> str2=new ArrayList<>();
		str2.add("3");
		str2.add("4");
		str3.addAll(str1);
		str3.addAll(str2);
		
		for(String str:str3)
		{
			System.out.println(str);
		}*/
	}

}
