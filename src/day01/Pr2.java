package day01;

public class Pr2 {
	public static void main(String[] args) {
		//준비
		int shour= 12; int sminute= 40;
		int ehour= 16; int eminute= 10;
		int priceperM=1000;
		//계산 시간에 60을 곱해야 분으로 계산가능함
		int start= shour*60+sminute;
		int end= ehour*60+eminute;
		int time = end-start;
		int price = time/10*priceperM;
		//System.out.println(price);
		
	}
}
