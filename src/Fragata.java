
public class Fragata implements VehiculoAgua {
	private String nombre;
	private int maxPasajeros;
	private int maxVelocidad;
	private boolean amarrado;
	
	public Fragata() {
		this("F-25-Colosal500", 350, 120);
		this.amarrado = true;
	}
	public Fragata(String nombre, int maxPasajeros, int maxVelocidad) {
		this.nombre = nombre;
		this.maxPasajeros = maxPasajeros;
		this.maxVelocidad = maxVelocidad;
	}
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}
	public boolean isAmarrado() {
		return this.amarrado;
	}
	@Override
	public int getMaxPasajeros() {
		// TODO Auto-generated method stub
		return this.maxPasajeros;
	}

	@Override
	public int getMaxVelocidad() {
		// TODO Auto-generated method stub
		return this.maxVelocidad;
	}

	@Override
	public String soltarAmarras() {
		this.amarrado = false;
		return "Amarras soltadas";
	}
	

}
