package com.cg;

public class VargsEx {

	public static void main(String[] args) {
		
				System.out.println(add(10,20));
				System.out.println(add(3,5,8));
				int result=add(1,2,3,4,5,6,7,8,955,3,322,2,67,78,55,44,78);
				System.out.println("Result : "+result);
				int arr[]= {67,457,36,26,57,99};
				result=add(arr);
				System.out.println("Result is "+result);
				f1(10,"Albin","Ramesh","Ajith","Revathi");
		}
	
			static int add(int a,int b) {
				return a+b;
			}
			static int add(int a,int b,int c) {
				return a+b+c;
			}
			static int add(int ...a) { //internally act as array ..
				int sum=0;
				for(int i:a) { //for each loop
					sum=sum+i;
				}
				return sum;
			}
			static void f1(int a, String ...names) {
				for(String s:names) {
					System.out.println(s);
				}
			}
			//Its Error .varargs must be last parameter
			/*
			static void f2(String ...names, int a) {
				
			}
			*/
			/*
			static int add(int a[]) {
				return 0;
			}*/
}

