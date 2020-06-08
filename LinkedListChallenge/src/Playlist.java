import java.util.ArrayList;

public class Playlist {
	private String name;
	
	ArrayList<Album> albums = new ArrayList<Album>();
	
	public Playlist(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public ArrayList<Album> getAlbums() {
		return this.albums;
	}

	

}
