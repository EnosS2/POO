package atividadeinventar;

public class Musica {
	private String artista;
	private boolean hit;
	private String compositor;
	private boolean hitsolo;

	public Musica(String artista, boolean hit, String compositor, boolean hitsolo) {
		super();
		this.artista = artista;
		this.hit = hit;
		this.compositor = compositor;
		this.hitsolo = hitsolo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public boolean isHit() {
		return hit;
	}

	public void setHit(boolean hit) {
		this.hit = hit;
	}

	public String getCompositor() {
		return compositor;
	}

	public void setCompositor(String compositor) {
		this.compositor = compositor;
	}

	public boolean isHitsolo() {
		return hitsolo;
	}

	public void setHitsolo(boolean hitsolo) {
		this.hitsolo = hitsolo;
	}

	@Override
	public String toString() {
		return "Musica [artista=" + artista + ", hit=" + hit + ", compositor=" + compositor + ", hitsolo=" + hitsolo
				+ "]";
	}

}
