package com.kh.arry;

import java.util.Arrays;
import java.util.Scanner;

public class C_DimensionalArray {
	//2차원 배열
	// 일차원 배열 여러개를 하나로 묶은 것
	// 3차원 4차원.... n차원 가능
	public void method1() {
		//일차원 배열 선언
		int[] arr1;
		int arr2[];
		
		//이차원 배열 선언
		int[][] arr3;
		int arr4 [][];
		int[] arr5 [];//이렇게는 잘 안함
		
		//이차원 배열선언과 동시에 할당
		int[][] arr = new int[3][5];
		
		System.out.println(arr);//[[I@7637f22
		System.out.println(arr[0]);//[I@3830f1c0
		System.out.println(arr[0][0]);//0
		System.out.println(Arrays.toString(arr[0]));//[0, 0, 0, 0, 0]
		
		//각 행별 열의 길이
		System.out.println("0번 열의 길이 : "+ arr[0].length);
		System.out.println("1번 열의 길이 : "+ arr[1].length);
		System.out.println("2번 열의 길이 : "+ arr[2].length);
		/*
		 * 출력( arr[0][0] -> 1행 1열 출력( arr[0][1] -> 1행 2열 ..... 출력( arr[0][4] -> 1행 5열
		 * .....
		 *
		 * 출력( arr[2][4] -> 3행 5열
		 * 
		 * 바깥쪽 for문 => 행에 대해 지정(0행~ 2행) == (0행 ~ 행의크기 -1 ) == (0행 ~ arr.length-1)
		 * 안쪽 for문 => 열에 대해 지정(0열 ~ 4열) == (0열 ~ 각 행별 열의크기 -1)
		 * == (0열 ~ arr[행의 인덱스].length -1)
		 */
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void method2() {
		// 순서대로 1,2,3,4..15 값을 넣어보기
		int[][] arr = new int[3][5];// arr[0][0] = 1, arr[0][1] = 2 ... arr[2][4] = 15
		int a = 1;
		//값을 대입, 출력

		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = a++;
				//System.out.print(arr[i][j] + " ");
				System.out.printf("%-3d", arr[i][j]);
			}
			System.out.println();
		}
	}
	public void method3() {
		//일차원 배열 선언 및 할당과 동시에 초기화
		int[] arr = {1, 2, 3, 4, 5};
		
		//이차원 배열 선언 및 할당과 동시에 초기화
		int[][] arr2 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };// [3][5]

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public void method4() {
		
		/*
		 * 가변 배열
		 * 행의 크기는 고정(정해져있음) 각각의 행별로 열의 갯수가 정해져 있지 않은 상태
		 * 이차원 배열 == 일차원 배열 여러개 묶은 형태
		 * 즉, 묶여있는 일차원 배열의 길이가 꼭 같을 필요는 없다.
		 * 
		 * 단, 행 크기는 생략이 불가, 반드시 지정해야함
		 * 열크기는 생략이 가능. => 각 행의 열의 길이가 변경 가능함
		 * 
		 */
		
		int[][] arr = new int[3][];//가변배열 (행의 크기는 3행)
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr.length);
		//System.out.println(arr[0].length);//null인데 length물으면 NullPointerException 에러난다
		//System.out.println(arr[0][2]); 
		// 아직 각 행별로 열의 크기가 지정되지 않았으므로 null값이 대입된 상태에서
		//특정 인덱스로 접근하려했기때문에 이것도 널타입오류
		
		arr[0] = new int[2];// 0 0
		arr[1] = new int[] {5, 6, 8};// 5 6 8
		arr[2] = new int[4];// 0 0 0 0
		int value = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length;j++) {
				arr[i][j] = value++; 
			}
		}
		
		for(int i = 0;i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}
	public void method5() {
		//char[][] 가변 배열 생성
		char[][] arr = new char[3][];
		/*
		 *  a b c
		 *  d e
		 *  f g h i j k
		 */
		arr[0] = new char[3];
		arr[1] = new char[2];
		arr[2] = new char[6];
		char value = 97;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length;j++) {
				arr[i][j]= value++;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void method6() {
		//3행3열짜리 String 배열 생성 후 
		//중첩 반복문을 이용해 현재 행, 열의 순번(인덱스)를 출력
		//(0,0),(0,1)
		
		String[][] arr = new String [3][3];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("(%d , %d) ", i,j);
			}
			System.out.println();
		}	
	}
	public void method7() {
		// int형 2차원 배열을 만들어
		// 0번행 = 국어점수를 3개 입력
		// 1번행 = 영어점수를 3개 입력
		// 각각 반복문을 활용해서 출력
		// 입력예시 : xx점수를 입력하세요 : 
		// 출력예시 : xx 점수 : xx xx xx
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int [2][3];
		
		System.out.print("국어 점수를 입력하세요 : ");
		for(int i = 0; i< arr[0].length;i++) {
			arr[0][i] = sc.nextInt();
		}
		
		System.out.print("영어 점수를 입력하세요 : ");
		for(int i = 0; i< arr[0].length;i++) {
			arr[1][i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(i==0) {
				System.out.print("영어 점수 : ");
			}else if (i==1) {
				System.out.print("국어 점수 : ");
			}
			for (int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
