
public class Aerodeslizador implements VehiculoTierra, VehiculoAgua {
	private String nombre;
	private int numeroRuedas;
	private int maxPasajeros;
	private int maxVelocidad;
	private boolean amarrado;
	
	public Aerodeslizador() {
		this.nombre = "Turbodeslizador3000";
		this.numeroRuedas = 8;
		this.maxPasajeros = 5;
		this.maxVelocidad = 180;
		this.amarrado = true;
	}
	public Aerodeslizador(String nombre, int numeroRuedas, int maxPasajeros,int maxVelocidad) {
		this.nombre = nombre;
		this.numeroRuedas = numeroRuedas;
		this.maxPasajeros = maxPasajeros;
		this.maxVelocidad = maxVelocidad;
		this.amarrado = true;
	}
	@Override
	public String getNombre() {
		return this.nombre;
	}
	@Override
	public int getMaxPasajeros() {
		return this.maxPasajeros;
	}
	@Override
	public int getMaxVelocidad() {
		return this.maxVelocidad;
	}
	public boolean isAmarrado() {
		return amarrado;
	}
	@Override
	public String soltarAmarras() {
		this.amarrado = false;
		return "Amarras soltadas";
	}
	@Override
	public int getNumeroRuedas() {
		return this.numeroRuedas;
	}
	@Override
	public void agregarRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
		
	}
	@Override
	public String conducir() {
		return "Conduce al vehiculo" + nombre;
	}
}
