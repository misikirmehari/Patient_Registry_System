package finalProject.healthCareHospital;
/**
 * 
 * @author Misikir Mehari  
 * CS2050 - Patient Registry Application
 * Stack Interface
 * 05/04/2016
 * 
 *This interface is implemented by the stackData class to 
 *add items to the stack
 *
 *
 */
public interface PatientStack {
	  public void push(Object o);
	  public Object pop();
	  public Object peek();
	  public boolean isEmpty();
	  public int size();

}



