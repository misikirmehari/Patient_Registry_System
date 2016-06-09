package finalProject.healthCareHospital;
/** 
 * @author Misikir Mehari  
 * CS2050 - Patient Registry Application
 * StackData
 * 05/04/2016
 *  
 * This class implements the PatientStack interface and is used to 
 * add Observable<list> of patients on to the stack 
 * 
 * 
 * 
 */
import java.util.NoSuchElementException;

public class StackData implements PatientStack{
		
	    private Object[] array;
	    private int size = 0;

	    
	    public StackData(int capacity) {

	        array = new Object[capacity];

	    }

	    public void push(Object item) {

	        if (size == array.length) {

	            throw new IllegalStateException("Cannot add to full stack");

	        }

	        array[size++] = item;

	    }

	    public Object pop() {

	        if (size == 0) {

	            throw new NoSuchElementException("Cannot pop from empty stack");

	        }

	        Object result = array[size-1];

	        array[--size] = null;

	        return result;

	    }

	    public Object peek() {

	        if (size == 0) {

	            throw new NoSuchElementException("Cannot peek into empty stack");

	        }

	        return array[size - 1];

	    }

	    public boolean isEmpty() {

	        return size == 0;

	    }

	    public int size() {

	        return size;

	    }

	}




