package oop.inherit8;

public class Test01 {
	public static void main(String [] args) {
		Warrior a= new Warrior("김전사",26);
		a.attack();
		a.move();
		a.print();
		
		Magician b= new Magician("나법사",29);
		b.attack();
		b.move();
		b.print();
		
		Elf c= new Elf("엘프1",2);
		c.attack();
		c.move();
		c.print();
	}
}
