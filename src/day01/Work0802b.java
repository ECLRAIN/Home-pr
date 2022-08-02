package day01;

public class Work0802b {
	public static void main(String[] args) {
		int[] data = new int[] {30, 10, 20, 50, 40}; //배열 데이터
		
	
		for(int i= 0; i<data.length; i++) {
			
			for(int q= i+1; q<data.length; q++) {
				if(data[i]>data[q]) { //i가 q보다 클때 백업 명령
					int backup= data[i];
					data[i]=data[q];
					data[q]=backup;
				}
			}
		
		}		
		for(int i= 0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}	
}