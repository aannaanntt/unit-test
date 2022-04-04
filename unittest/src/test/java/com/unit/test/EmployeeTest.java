package com.unit.test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import java.rmi.UnexpectedException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.naming.NamingException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

	/*
	 * static Employee firstEmployee; static Employee secondEmployee;
	 * 
	 * @BeforeAll public static void initEmployee() { firstEmployee = new
	 * Employee("Amy", "Cruz", 1001, 'F', "Developer", 3000d, "Permanent");
	 * 
	 * secondEmployee=null; //secondEmployee = new Employee("Ben", "Vittori", 1011,
	 * 'M', "Tester", 2500d, "Contract");
	 * 
	 * }
	 * 
	 * 
	 * //@Test // public void assertTest() { //
	 * Assertions.assertTimeout(Duration.ofSeconds(5),
	 * ()->{firstEmployee.adjustSalary(30000); // // Employee secondEmployee = new
	 * Employee("Ben", "Vittori", 1011, 'M', "Tester", 2500d, "Contract"); // //
	 * secondEmployee.adjustSalary(10000); // // }); // }
	 * 
	 * @Test void assertTest() { Assertions.assertNotNull(firstEmployee); }
	 */
	/*
	 * @Test // public void assertTest() { //// employee.adjustSalary(5000d); ////
	 * Assertions.assertEquals(8000, employee.getSalary(),"Hello world"); // //
	 * Assertions.assertTrue(firstEmployee.getFirstName().equals(secondEmployee.
	 * getFirstName()), // // "have the same name"); // ////
	 * Assertions.assertFalse(firstEmployee.getRole().equals(secondEmployee.getRole(
	 * )), //// "Test both employees have same role"); // Employee firstShallowCopy
	 * = firstEmployee; // Employee firstSeperateCopy = new
	 * Employee(firstEmployee.getFirstName(), firstEmployee.getLastName(), //
	 * firstEmployee.getId(), firstEmployee.getGender(), firstEmployee.getRole(),
	 * firstEmployee.getSalary(), // firstEmployee.getType()); // //
	 * //Assertions.assertSame(firstEmployee, firstSeperateCopy, "This is to test");
	 * // //
	 * //Assertions.assertSame(firstShallowCopy.getRole(),firstSeperateCopy.getRole(
	 * ),"Testing it"); // // Assertions.assertNotSame(firstEmployee,
	 * firstShallowCopy); // // // }
	 */

	static Employee firstEmployee;
	static GregorianCalendar gc; 
	
	

	@BeforeAll
	static void initEmployee() {
		firstEmployee = new Employee("Amy", "Cruz", 1001, 'F', "Developer", 3000d, "Permanent");
			
		gc= new GregorianCalendar();
	}
//
//	@Test
//	void assertTest() {
//		assertThrows(NamingException.class, () -> {
//			firstEmployee.validateLastName();
//		}, "Testing exceptions");
//
//	}

//	@Test
//	void assertTests() {
//		firstEmployee.adjustSalary(40000);
//
//		Assertions.assertAll("Test Employee", () -> Assertions.assertEquals(300, firstEmployee.getSalary()),
//				() -> Assertions.assertNotNull(firstEmployee.getFirstName()),
//				() -> assertThrows(NamingException.class, () -> {
//					firstEmployee.validateLastName();
//				}, "Testing exceptions")
//
//		);
//	}
	
//	@Test
//	void assertTest() {
//		firstEmployee
//		.addProject("Blues");
//		firstEmployee.addProject("Blacks");
//		
//		ArrayList<String> compareList = new ArrayList<>();
//		compareList.add("Blues");
//		compareList.add("Blacks");
//		
//		Assertions.assertIterableEquals(compareList, firstEmployee.getProjects());
//	}
	
	
	@Test 
	void assumptionTest(){
		System.out.println("Current hour"+" "+gc.get(Calendar.HOUR_OF_DAY));
		Assumptions.assumeFalse(gc.get(Calendar.HOUR_OF_DAY)<20);
		
		firstEmployee.adjustSalary(300);
		//Assumptions.assumeTrue(200d,firstEmployee.getSalary());
		
		System.out.println("Assumption satisfied");
	}
	
}
