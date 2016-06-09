package finalProjecthealthCare_junitTest;
/** 
 * @author Misikir Mehari  
 * CS2050 - Patient Registry Application
 * JTest
 * 05/04/2016
 *  
 * This class is used to test the setters and getters of the Patient
 * class
 * 
 * 
 */

import static org.junit.Assert.*;
import org.junit.*;

import finalProject.healthCareHospital.Patient;


public class JTest {
	
	
	// Creates a new patient1 object 
		Patient patient1 =  new Patient("Misikir", "Mehari", "mskrmr84@gmail.com","12345","324-232-2342",null,
		        "1234 South Home Street","325","Denver","Colorado", "80012", "Single","Employed","ABC Inc.",
		        "James Brown","Denver","Uncle","7203464358","Aetna","W8545645","Non Emergency","General Checkup");

		
		
	// This methods tests the Patient name setters and getters
	@Test
	public void testPatientFirstName(){
			patient1.setFirstName("David");
			assertEquals(patient1.getFirstName(),"David");

	}
	
	@Test
	public void testPatientLastName(){
			patient1.setLastName("BOB");
			assertEquals(patient1.getLastName(),"BOB");

	}
	
	//This methods tests the Patient Information setters and getters
	public void testPatientemail(){
			patient1.setEmail("msd@email.com");
			assertEquals(patient1.getEmail(),"msd@email.com");
	}
		
	public void testPatientssn(){
		patient1.setSSN("345-53-2332");
		assertEquals(patient1.getSSN(),"345-53-2332");
}
	public void testPatientID(){
		patient1.setID("12345");
		assertEquals(patient1.getID(),"12345");
}
	public void testPatientadd(){
		patient1.setAddress("home street");
		assertEquals(patient1.getAddress(),"home street");
}
	public void testPatientaptNo(){
		patient1.setAptNo("345");
		assertEquals(patient1.getAptNo(),"345");
}
	public void testPatientcity(){
		patient1.setCity("Denver");
		assertEquals(patient1.getAptNo(),"Denver");
}
	public void testPatientstate(){
		patient1.setState("Colorado");
		assertEquals(patient1.getState(),"Colorado");
}
	public void testPatientzip(){
		patient1.setZipCode("23455");
		assertEquals(patient1.getState(),"23455");
}
	
	public void testPatientMaritalStatus(){
		patient1.setMaritalStatus("Single");
		assertEquals(patient1.getMaritalStatus(),"Single");
}
	
}				
