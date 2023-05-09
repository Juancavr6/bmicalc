package bmicalc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMICalcTest {
	
	BMICalcImpl c = BMICalcImpl.getInstancia();
	
	@Test
	@DisplayName("bmi_1")
	public void bmi_1() {
		boolean thrown = false;
		try {
			c.calculateBodyMassIndex(0, 0);
		}catch(ArithmeticException e) {
			thrown = true ;
		}
		assertEquals(thrown,true);	
	}
	@Test
	@DisplayName("bmi_2")
	public void bmi_2() {
		boolean thrown = false;
		try {
			c.calculateBodyMassIndex(-1, -1);
		}catch(ArithmeticException e) {
			thrown = true ;
		}
		assertEquals(thrown,true);	
		
	}
	@Test
	@DisplayName("bmi_3")
	public void bmi_3() {
	
		assertEquals(c.calculateBodyMassIndex(81,1.8), 25);
	}
	@Test
	@DisplayName("category_4")
	public void bmi_4() {
		assertEquals(c.getObesityCategory(0), ObesityCategory.UNDERWEIGHT);
	}
	@Test
	@DisplayName("category_5")
	public void bmi_5() {
		assertEquals(c.getObesityCategory(-1), ObesityCategory.UNDERWEIGHT);
	}
	@Test
	@DisplayName("category_6")
	public void bmi_6() {
		assertEquals(c.getObesityCategory(18), ObesityCategory.UNDERWEIGHT);
	}
	@Test
	@DisplayName("category_7")
	public void bmi_7() {
		assertEquals(c.getObesityCategory(18.5), ObesityCategory.NORMAL);
	}
	@Test
	@DisplayName("category_8")
	public void bmi_8() {
		assertEquals(c.getObesityCategory(24.9), ObesityCategory.NORMAL);
	}
	@Test
	@DisplayName("category_9")
	public void bmi_9() {
		assertEquals(c.getObesityCategory(25), ObesityCategory.OVERWEIGHT);
	}
	@Test
	@DisplayName("category_10")
	public void bmi_10() {
		assertEquals(c.getObesityCategory(29.9),  ObesityCategory.OVERWEIGHT);
	}
	@Test
	@DisplayName("category_11")
	public void bmi_11() {
		assertEquals(c.getObesityCategory(30),  ObesityCategory.OBESE);
	}
	@Test
	@DisplayName("admObsty_12")
	public void bmi_12() {
		boolean thrown = false;
		try {
			c.abdominalObesity(0, Gender.MALE);
		}catch(RuntimeException e) {
			thrown = true ;
		}
		assertEquals(thrown,true);	
		
	}
	@Test
	@DisplayName("admObsty_13")
	public void bmi_13() {
		boolean thrown = false;
		try {
			c.abdominalObesity(-1, Gender.MALE);
		}catch(RuntimeException e) {
			thrown = true ;
		}
		assertEquals(thrown,true);	
	}
	@Test
	@DisplayName("admObsty_14")
	public void bmi_14() {
		boolean thrown = false;
		try {
			c.abdominalObesity(80, Gender.FEMALE);
		}catch(RuntimeException e) {
			thrown = true ;
		}
		assertEquals(thrown,true);	
		
	}
	@Test
	@DisplayName("admObsty_15")
	public void bmi_15() {
		assertEquals(c.abdominalObesity(89, Gender.MALE), false);
	}
	@Test
	@DisplayName("admObsty_16")
	public void bmi_16() {
		assertEquals(c.abdominalObesity(90, Gender.MALE), false);
	}
	@Test
	@DisplayName("admObsty_17")
	public void bmi_17() {
		assertEquals(c.abdominalObesity(91, Gender.MALE), true);
	}
	@Test
	@DisplayName("admObsty_18")
	public void bmi_18() {
		assertEquals(c.abdominalObesity(79, Gender.FEMALE), false);
	}
	@Test
	@DisplayName("admObsty_19")
	public void bmi_19() {
		assertEquals(c.abdominalObesity(80,  Gender.FEMALE), false);
	}
	@Test
	@DisplayName("admObsty_20")
	public void bmi_20() {
		assertEquals(c.abdominalObesity(81,  Gender.FEMALE), true);
	}
	
}
