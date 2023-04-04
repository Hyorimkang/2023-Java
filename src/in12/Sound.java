package in12;

public interface Sound { //인터페이스는 추상메소드만 작성하게끔 설계되어있음 (default제외)
	public void SoundUp(int level); //추상메소드
	public void SoundDown(int level);
}
