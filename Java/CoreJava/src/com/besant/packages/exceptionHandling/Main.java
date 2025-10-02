package com.besant.packages.exceptionHandling;

public class Main {

	public static void main(String[] args) {
		try {
			int i[] = {1,2,3};
			System.out.println(i[2]); //after getting this error, execution jumps to catch block
			System.out.println(10/0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array index is out of bounds!");
		}catch (ArithmeticException e) {
			System.err.println("Divide by 0 not allowed!");
		}catch(Exception e) {
			System.out.println("Not allowed");
		}
		finally {
			System.out.println("Execptions handled");
		}	

	}

}
