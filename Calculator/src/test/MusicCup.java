package test;

public class MusicCup implements Cup,MusicPlayer {

	@Override
	public void addWater(int w) {
		// TODO Auto-generated method stub
		this.water=this.water+w;
	}

	@Override
	public void drinkWater(int w) {
		// TODO Auto-generated method stub
		this.water=this.water-w;
	}
	
	public int waterContent(){
		return this.water;
	}
	private int water=0;
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("ÅÌ“ª∂Œmusic!!!");
		
	}

}
