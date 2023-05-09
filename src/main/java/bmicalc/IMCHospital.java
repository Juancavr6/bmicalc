package bmicalc;

import java.util.Map;

public interface IMCHospital {

	
	public Map<Double, ObesityCategory> imc(double altura, double peso);
	public boolean tieneObesidadAbdominal(Gender genero, double circunferencia);
	
}
