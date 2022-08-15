package day15;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test05 {
	public static void main(String[] args) {
		try {	//플랜A
		Scanner sc= new Scanner(System.in);
		//입력받기
		System.out.print("이름: ");
		String name=sc.next();
		
		System.out.print("국어: ");
		int kor=sc.nextInt();
		
		System.out.print("수학: ");
		int math=sc.nextInt();
		
		System.out.print("영어: ");
		int eng=sc.nextInt();
		
		sc.close();
		//합계 평균
		int sum=kor+math+eng;
		
		double avg=sum/3.0;
		
		
		//이름 2에서 7글자
		String regex = "^[가-힣]{2,7}$";
		boolean nametest=Pattern.matches(regex, name);
		//점수 0~100
		boolean score= kor>=0 && kor<=100;
		score&= math>=0 && math<=100;
		score&= eng>=0 && eng<=100;
		//두 전제가 참과 거짓을 경우 
		if(nametest && score) { // 정상적으로 입력시 이름 총점 평균을 출력
			System.out.println("이름:"+name);
			System.out.println("총점:"+sum);
			System.out.println("평균:"+avg);
		}
		else { //거짓일 경우 프로그램 종료
			System.exit(0);
		}
		
		}//플랜 A 끝나는 선
		
		
		catch(Exception e) {//오류시 플랜B
			System.out.println("잘못된 입력입니다. 처음부터 다시 진행해주세요.");
		
		}
	}		
}
