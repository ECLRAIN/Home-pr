package oop.inherit8;

public abstract class RPG { //추상클래스
	//필드
	protected String id;
	protected int level;
	//메소드,겟터,셋터
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		if(level>0) //레벨을 1이상 설정
			{this.level = level;}
		else {
			this.level=1;
		}
	}
	
	//생성자 생성 시 아이디만 설정 가능합니다(레벨은 1로 설정)
	public RPG(String id,int level) {
		this.id = id;
		this.level = level;
	}
	public abstract void attack();//추상 메소드
	public abstract void move();//추상 메소드
	
}
