package bmicalc;

import java.util.HashMap;
import java.util.Map;

public class IMCHospitalAdapter implements IMCHospital {
    private static final BMICalcImpl singleInst = BMICalcImpl.getInstancia();

    @Override
    public Map<Double, String> imc(double altura, double peso) {
    	
    	Map<Double, String> m = new HashMap<Double, String>();
    	double bmi = singleInst.bmi(altura, peso);
    	String cat = singleInst.category(bmi);
    	
    	m.put(bmi, cat);
    	
        return m;
    }

    @Override
    public boolean tieneObesidadAbdominal(char genero, double circunferencia) {
        return singleInst.abdominalObesity(circunferencia,genero);
    }
}

