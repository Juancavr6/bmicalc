package bmicalc;


public class IMCHospitalDecarator implements MetabolicMetrics,CardiovascularMetrics, IMCStats {
    private static final BMICalcImpl single = BMICalcImpl.getInstancia();
  

    

    @Override
    public int alturaMedia() {
        return 0;
    }

    @Override
    public double pesoMedio() {
    	 return 0;    }

    @Override
    public double imcMedio() {
    	 return 0;
    }

    @Override
    public double numPacientes() {
    	 return 0;
    }

	@Override
	public double calculateBodyMassIndex(double mass, double height) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public  ObesityCategory getObesityCategory(double bmi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean abdominalObesity(double waistCircumference, Gender gender) {
		// TODO Auto-generated method stub
		return false;
	}
}

