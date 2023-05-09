package bmicalc;

import java.util.HashMap;
import java.util.Map;

public class IMCHospitalAdapter implements IMCHospital {
    private static final BMICalcImpl singleInst = BMICalcImpl.getInstancia();

    @Override
    public Map<Double,  ObesityCategory> imc(double altura, double peso) {
    	
    	Map<Double,  ObesityCategory> m = new HashMap<Double,  ObesityCategory>();
    	double bmi = singleInst.calculateBodyMassIndex(altura, peso);
    	 ObesityCategory cat = singleInst.getObesityCategory(bmi);
    	
    	m.put(bmi, cat);
    	
        return m;
    }

    @Override
    public boolean tieneObesidadAbdominal(char genero, double circunferencia) {
        return singleInst.abdominalObesity(circunferencia,genero);
    }
}

