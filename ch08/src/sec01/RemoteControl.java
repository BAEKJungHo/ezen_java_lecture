package sec01;

public interface RemoteControl {
	
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0 ;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	default void setVolume(boolean mute) {
		if(mute) {
			System.out.println("무음");
		}
		else {
			System.out.println("무음 해제");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지 교환");
	}

}
