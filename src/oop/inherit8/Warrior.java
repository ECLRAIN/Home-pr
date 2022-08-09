package oop.inherit8;

public class Warrior extends RPG{

	public Warrior(String id,int level) {
		super(id, level);
	}

	@Override
	public void attack() {
		System.out.println("전사가 칼로 공격합니다!");
	}

	@Override
	public void move() {
		System.out.println("전사가 뛰어서 이동합니다!");
	}
	
	public void print() {
		System.out.println("캐릭터 정보");
		System.out.println("아이디: "+id);
		System.out.println("레벨 : "+level);
		System.out.println();
	}
}
