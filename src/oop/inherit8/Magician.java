package oop.inherit8;

public class Magician extends RPG{
	//상속 생성자 따라해야함
	public Magician(String id,int level) {
		super(id,level);
	}
	//추상 메소드 재정의
	public void attack() {
		System.out.println("마법사가 마법으로 공격합니다!");
	}
	public void move() {
		System.out.println("마법사가 날아서 이동합니다!");
	}
	public void print() {
		System.out.println("캐릭터 정보");
		System.out.println("아이디: "+id);
		System.out.println("레벨 : "+level);
		System.out.println();
	}
}
