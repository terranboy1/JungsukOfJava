
public class Chap07_11 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	}
}

class MyTv2 {
	private boolean isPowerOn;
	private int prevChannel;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void gotoPrevChannel() {
//		int tmp = 0;
//		tmp = channel;
//		channel = prevChannel;
//		prevChannel = tmp;
		setChannel(prevChannel); //와 이것도 생각 못했다. 짱.
	}
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel<MIN_CHANNEL || channel>MAX_CHANNEL)
			return;
		
		prevChannel = this.channel;
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if(volume<MIN_VOLUME || volume>MAX_VOLUME)
			return;
		
		this.volume = volume;
	}
}