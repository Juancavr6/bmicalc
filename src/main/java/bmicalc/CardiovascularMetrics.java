package bmicalc;


public interface CardiovascularMetrics {
	   double calculateBodyMassIndex(double weight, double height);
	   ObesityCategory getObesityCategory(double bmi);
	}


