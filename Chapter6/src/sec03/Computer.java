package sec03;

public class Computer implements Controllable{
	public void turnOn() {
		System.out.println(("��ǻ�͸� �Ҵ�."));
	}
	
	@Override
	public void turnOff() {
		System.out.println("��ǻ�͸� ����.");
	}
}
