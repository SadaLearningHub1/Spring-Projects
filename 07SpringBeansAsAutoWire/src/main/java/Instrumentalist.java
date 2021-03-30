import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Instrumentalist {
	private Guitar guitar;
	private SongSelector songSelector;
	@Autowired
	@Qualifier("g")
	public void setGuitar(Guitar guitar) {
		this.guitar = guitar;
	}
	@Autowired
	public void setSongSelector(SongSelector songSelector) {
		this.songSelector = songSelector;
	}
	public void show() {
		guitar.playGuitar();
		songSelector.playSong();
	}
	

}
