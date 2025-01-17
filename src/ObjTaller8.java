import java.util.*;
    public class ObjTaller8 {
        public static void main (String[] args) {
        	Vehiculo s = new Sedan();
        	Vehiculo a = new Aerodeslizador();
        	Vehiculo f = new Fragata();
        	Vehiculo p = new PatrullaPolicia("Patrulla 001",(short) 5, 200);
        	((Sedan)s).agregarRuedas(8);
        	((PatrullaPolicia)p).agregarRuedas(6);
        	
	        ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
	        
	        listaVehiculos.add(s);
	        listaVehiculos.add(a);
	        listaVehiculos.add(f);
	        listaVehiculos.add(p);
	        
	        for (int i = 0; i < listaVehiculos.size(); i++) {
	            Vehiculo v = listaVehiculos.get(i);
	            if(v instanceof Sedan) {
	            	if (v instanceof PatrullaPolicia) {
	 	        	   System.out.println("WOOOOOW, UN POLICIA ENTRO AL CHAAAAT !!!! \n");
		            	System.out.println("Nombre = " + v.getNombre());
		            	System.out.println("Max Pasajeros = " + v.getMaxPasajeros());
		            	System.out.println("Max Velocidad = " + v.getMaxVelocidad());
		            	System.out.println(((PatrullaPolicia) v).conducir());
		            	System.out.println("Numero de ruedas: " + ((PatrullaPolicia)v).getNumeroRuedas());
		            	System.out.println(((PatrullaPolicia)v).sonarClaxon());
		            	System.out.println("Volumen de la Sirena: " + ((PatrullaPolicia)v).getVolumen());
		            	System.out.println("Sonido de la Sirena: " +((PatrullaPolicia)v).sonarSirena());
		            	System.out.println("toString: "+ ((PatrullaPolicia)v).toString()+"\n");
		            	break;
		            }
		        	   System.out.println("UN SEDAN! \n");
	            	System.out.println("Nombre = " + v.getNombre());
	            	System.out.println("Max Pasajeros = " + v.getMaxPasajeros());
	            	System.out.println("Max Velocidad = " + v.getMaxVelocidad());
	            	System.out.println(((Sedan) v).conducir());
	            	System.out.println("Numero de ruedas:" + ((Sedan)v).getNumeroRuedas());
	            	System.out.println(((Sedan)v).sonarClaxon());
	            	System.out.println("toString:"+ v.toString() + "\n");
	            }
	           if(v instanceof Aerodeslizador) {
	        	   System.out.println("ES REAL, UN AERODESLIZADOR!!! \n");
	        	   System.out.println(((Aerodeslizador)v).conducir());
	        	   System.out.println("Max Pasajeros: "+ v.getMaxPasajeros());
	        	   System.out.println("Max Velocidad: "+ v.getMaxVelocidad());
	        	   System.out.println("Nombre: "+v.getNombre());
	        	   System.out.println("Numero de Ruedas: "+ ((Aerodeslizador)v).getNumeroRuedas());
	        	   System.out.println("A continuacion soltaremos la amarras... \n" + ((Aerodeslizador)v).soltarAmarras() + "\n");
	           }
	           if (v instanceof Fragata) {
	        	   System.out.println("SE AVECINA UNA FRAGATA!! \n");
	        	   System.out.println("Max Pasajeros: "+ v.getMaxPasajeros());
	        	   System.out.println("Max Velocidad: "+ v.getMaxVelocidad());
	        	   System.out.println("Nombre: "+ v.getNombre());
	        	   System.out.println("A continuacion soltaremos la amarras... \n" + ((Fragata)v).soltarAmarras() + "\n");

	           }
	        }
    }
}