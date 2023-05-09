package bmicalc;

public class BMICalcImpl implements MetabolicMetrics,CardiovascularMetrics {
	
	private static BMICalcImpl singleInstance = null;
	
	private BMICalcImpl () {
		
	}
	
    public static BMICalcImpl getInstancia() {
        if (singleInstance == null) {
        	singleInstance = new BMICalcImpl();
        }
        return singleInstance;
    }
	

	public double calculateBodyMassIndex(double mass, double height) throws ArithmeticException {
		if(mass>0 && height>0)
			return mass / (height * height);
		else throw new ArithmeticException();
	}

	public ObesityCategory getObesityCategory(double bmi) {
		if (bmi<=0) return ObesityCategory.UNDERWEIGHT;
		
		else if(bmi<18.5) return ObesityCategory.UNDERWEIGHT;
		else if (bmi<=24.9) return ObesityCategory.NORMAL;
		else if (bmi<=29.9) return ObesityCategory.OVERWEIGHT;
		else return ObesityCategory.OBESE;

	}
	public boolean abdominalObesity(double waistCircumference, char gender) throws RuntimeException{
		
		
		if(waistCircumference <= 0 ) throw new RuntimeException("La circunferencia debe ser mayor que 0");
		else switch(gender) {
				case 'M' :
					if (waistCircumference>90) return true;				
					break;
				case 'F' :
					if (waistCircumference>80) return true;
					break;
				default:
					//System.out.println("Debe indicar el g�nero con F o M");	
					throw new RuntimeException("Debe indicar el g�nero con F o M");
			}
		
	 return false;
		
		
	}

}
