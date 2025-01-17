
public class PatrullaPolicia extends Sedan implements Emergencia  {
	private String nombre;
	private short maxPasajeros;
	private int maxVelocidad;
	private int numeroRuedas;
	
	public PatrullaPolicia(String nombre, short maxPasajeros, int maxVelocidad) {
		super(nombre,(short) maxPasajeros, maxVelocidad);
	}
	
	@Override
	public String sonarSirena() {
		return "Wiiii OOOOO, Wiiiii OOOOO";
	}
	public String toString() {
		return "Soy una patrulla, y voy a capturar al malhechor!";
		}
	@Override
	public int getVolumen() {
		return Emergencia.VOLUMEN;
	}

}
