package bmicalc;


public class IMCHospitalDecarator implements BMICalc, IMCStats {
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
	public String category(double bmi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean abdominalObesity(double waistCircumference, char gender) {
		// TODO Auto-generated method stub
		return false;
	}
}

