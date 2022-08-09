package oop.inherit8;

public class Elf extends RPG{

	public Elf(String id, int level) {
		super(id, level);
		
	}

	@Override
	public void attack() {
		System.out.println("엘프가 활로 공격합니다!");
	}
	@Override
	public void move() {
		System.out.println("엘프가 이동합니다!");
	}
	public void print() {
		System.out.println("캐릭터 정보");
		System.out.println("아이디: "+id);
		System.out.println("레벨 : "+level);
		System.out.println();
	}
}
