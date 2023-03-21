
import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import bmicalc.BMICalcImpl;


public class escenario1StepDefinitions {
	double resultado;
	@Given("Un usuario que desea calcular su BMI")
	   public void un_usuario_que_desea_calcular_su_BMI() {
		resultado=0;
	   }
	@When("Ingresa su peso y altura en la aplicación Calculadora BMI.")
	   public void ingresa_peso_altura_validos() {
		BMICalcImpl calc = new BMICalcImpl();
		
			 resultado= calc.bmi(0, 0);
			
		
	   }
	@Then("La aplicación realiza correctamente el cálculo del BMI utilizando la fórmula correspondiente")
	   public void devuelve_resultado() {
		assertEquals(resultado,25);
	   }
	

}
