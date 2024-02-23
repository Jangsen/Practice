package ch13.sec01;

public class Audio implements RemoteControl {
	private int volume;
	private int memVol;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}

	@Override
	public void setVolume(int Volume) {
		if (Volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (Volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = Volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}

	@Override
	public void setMute(boolean Mute) {
		if (Mute) {
			System.out.println("무음처리");
			this.memVol = this.volume;
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음해제");
			setVolume(this.memVol);
		}
	}
}
