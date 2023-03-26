package com.bridgelabz;

public class Generics<T extends Comparable<T>> {
//	public void FindMaxInt(Integer a, Integer b, Integer c) {
//		int max = a;
//		if ((b.compareTo(max)) > 0) {
//			max = b;
//		}
//		if ((c.compareTo(max)) > 0) {
//			max = c;
//		}
//		System.out.println("Maximum of " + a + "," + b + " and " + c + " is: " + max);
//
//	}

//	public void FindMaxFloat(Float a, Float b, Float c){
//		float max = a;
//		if((b.compareTo(max))>0)
//		{
//			max=b;
//		}
//		if((c.compareTo(max))>0){
//			max=c;
//		}
//		System.out.println("Maximum of "+a+ ","+b+" and "+c+ " is: "+max);
//	}

	public void FindMaxString(String a,String b,String c){
		String max=a;
		if((b.compareTo(max))>0)
		{
			max=b;
		}
		if((c.compareTo(max))>0){
			max=c;
		}
		System.out.println("Maximum of "+a+ ", "+b+" and "+c+ " is: "+max);
	}

	public static void main(String[] args) {
		Generics genericsProgram = new Generics();
//		Integer a = 40, b = 5, c = 3;
//		// test case 1 :- Given Max Number at 1st Position return the Same Number
//		genericsProgram.FindMaxInt(a, b, c);
//		// test case 2 :- Given Max Number at 2nd Position return the Same Number
//		genericsProgram.FindMaxInt(b, a, c);
//		// test case 3 :- Given Max Number at 3rd Position return the Same Number
//		genericsProgram.FindMaxInt(c, b, a);

//		Float d = 12.5F ,e=5.5F,f=2.6F;
//		// test case 1 :- Given Max Number at 1st Position return the Same Number
//		genericsProgram.FindMaxFloat(d,e,f);
//		// test case 2 :- Given Max Number at 2nd Position return the Same Number
//		genericsProgram.FindMaxFloat(e,d,f);
//		// test case 3 :- Given Max Number at 3rd Position return the Same Number
//		genericsProgram.FindMaxFloat(d,f,d);

		String g="Anjali",h="Rawke",i="Zain";
		// test case 1 :- Given Max Number at 1st Position return the Same Number
		genericsProgram.FindMaxString(i,h,g);
		// test case 2 :- Given Max Number at 2nd Position return the Same Number
		genericsProgram.FindMaxString(h,i,g);
		// test case 3 :- Given Max Number at 3rd Position return the Same Number
		genericsProgram.FindMaxString(g,h,i);
	}
}
