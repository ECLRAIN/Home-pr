package day01;

public class Work0802 {
	public static void main(String[] args) {
		int[] data = new int[] {30, 10, 20, 50, 40}; //배열 데이터
		//최소값 찾기
	
		for(int i= 0; i<data.length-1; i++) {
			int min=0;
			for(int q= i+1; q<data.length; q++) {
				if(data[min]<data[q]) {
					min=q;
				}
			}
		int backup= data[i];
		data[i]=data[min];
		data[min]=backup;
		}		
		for(int i= 0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}	
}
