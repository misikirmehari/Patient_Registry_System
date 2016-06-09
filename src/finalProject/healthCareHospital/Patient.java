

package finalProject.healthCareHospital;
/**
 * 
 * @author Misikir Mehari  
 * CS2050 - Patient Registry Application
 * Patient
 * 05/04/2016
 * 
 *Represents a Patient class and all of its associated values.
 *
 */
 

import java.time.LocalDate;



public class Patient {
	        
			// Patient Information
			private String firstName;
	        private String lastName;
	        private String email;
	        private String ID;
	        private String SSN;
	        private LocalDate Birthdate;
	        private String Address;
	        private String aptNo;
	        private String city;
	        private String state;
	        private String zipCode;
	        private String maritalStatus;
	        private String PatientType;
	        	                
	        //Patient Employment status
	        private String employementStatus;
	        private String employer;
	        
	        // Emergency contact 
	        private String emergencyContact;
	        private String addressEmergencyContact;
	        private String relatedEmercgenyContact;     //relation of emergency contact to patient
	        private String phoneNoEmergencyContact;
	        
	        
	        //Insurance Information
	        private String primaryInsurance;
	        private String primaryInsuranceNo;
	        
	        //Visitation Information
	        private String visitReason;
	       
	        
	               
	        
	        // Empty constructor
	    //    public Patient(){
	        	
	    //    }
	        /**
	    	 * Constructor for a patient, takes in all possible Patient-related values
	    	 * @param fName
	    	 * @param lName
	    	 * @param email
	    	 * @param id
	    	 * @param ssn
	    	 * @param birthDate
	    	 * @param Address
	    	 * @param aptNo
	    	 * @param city
	    	 * @param state
	    	 * @param zipCode
	    	 * @param maritalStatus
	    	 * @param employmentStatus
	    	 * @param employer
	    	 * @param emergencyContact
	    	 * @param addressEmergencyContact
	    	 * @param relatedEmergencyContact
	    	 * @param phoneNoEmergencyContact
	    	 * @param primaryInsurance
	    	 * @param primaryInsuranceNo
	    	 * @param secondaryInsurance
	    	 * @param secondaryinsuranceNo
	    	 * @param PatientType
	    	 */
	        
	        // This constructor creates a patient after using the parameters provided by the user 
	        public Patient(String fName, String lName, String email,String id,String ssn,LocalDate birthDate,
	        		        String Address,String aptNo, String city,String state, String zipCode, String maritalStatus,
	        		        String employementStatus,String employer,String emergencyContact,String addressEmergencyContact,
	        		        String relatedEmercgenyContact,String phoneNoEmergencyContact,String primaryInsurance, 
	        		        String primaryInsuranceNo,String PatientType, String visitReason) {
	            
	        	
	        	
	        	this.firstName = new String(fName);
	            this.lastName = new String(lName);
	            this.email = new String(email);
	            this.ID = id;
	            this.SSN = ssn;
	            this.Birthdate = birthDate;
	            this.Address= Address;
		        this.aptNo=aptNo;
		        this.city=city;
		        this.state=state;
		        this.zipCode=zipCode;
		        this.maritalStatus=maritalStatus;
		        this.employementStatus=employementStatus;
		        this.employer=employer;
		        this.emergencyContact= emergencyContact;
		        this.addressEmergencyContact=addressEmergencyContact;
		        this.relatedEmercgenyContact=relatedEmercgenyContact;     //relation of emergency contact to patient
		        this.phoneNoEmergencyContact=phoneNoEmergencyContact;
		        this.primaryInsurance=primaryInsurance;
		        this.primaryInsuranceNo=primaryInsuranceNo;
		        this.PatientType = PatientType;
		        this.visitReason = visitReason;
		        	
	        }
	 
	        
	        
	        /*
	    	 * Getters and Setters for all data members
	    	 * return desired data member
	    	 */	    	
	        	        
	   
	        public String getFirstName() {
	            return this.firstName;
	        }
	 
	        public void setFirstName(String fName) {
	            this.firstName=fName;
	        }
	 
	        public String getLastName() {
	            return this.lastName;
	        }
	 
	        public void setLastName(String lName) {
	        this.lastName = lName;
	        }

			public String getEmail() {
				return this.email;
			}
	 
	        public void setEmail(String email) {
	        	this.email=email;
	        }

			public String getID() {
				
				return ID+"";
			}

			public void setID(String iD) {
				ID = iD;
			}
			public String getSSN() {
				return SSN;
			}

			public void setSSN(String sSN) {
				SSN = sSN;
			}
		 
	       
			public LocalDate getBirthdate() {
				return Birthdate;
			}

			public void setBirthdate(LocalDate birthdate) {
				Birthdate = birthdate;
			}
			
			public String getAddress() {
				return Address;
			}

			public void setAddress(String address) {
				Address = address;
			}

			public String getAptNo() {
				return aptNo;
			}

			public void setAptNo(String aptNo) {
				this.aptNo = aptNo;
			}

			public String getCity() {
				return city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getState() {
				return state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getZipCode() {
				return zipCode;
			}

			public void setZipCode(String zipCode) {
				this.zipCode = zipCode;
			}

			public String getMaritalStatus() {
				return maritalStatus;
			}

			public void setMaritalStatus(String maritalStatus) {
				this.maritalStatus = maritalStatus;
			}

			public String getEmployementStatus() {
				return employementStatus;
			}

			public void setEmployementStatus(String employementStatus) {
				this.employementStatus = employementStatus;
			}

			public String getEmployer() {
				return employer;
			}

			public void setEmployer(String employer) {
				this.employer = employer;
			}

			public String getEmergencyContact() {
				return emergencyContact;
			}

			public void setEmergencyContact(String emergencyContact) {
				this.emergencyContact = emergencyContact;
			}

			public String getAddressEmergencyContact() {
				return addressEmergencyContact;
			}

			public void setAddressEmergencyContact(String addressEmergencyContact) {
				this.addressEmergencyContact = addressEmergencyContact;
			}

			public String getRelatedEmercgenyContact() {
				return relatedEmercgenyContact;
			}

			public void setRelatedEmercgenyContact(String relatedEmercgenyContact) {
				this.relatedEmercgenyContact = relatedEmercgenyContact;
			}

			public String getPhoneNoEmergencyContact() {
				return phoneNoEmergencyContact;
			}

			public void setPhoneNoEmergencyContact(String phoneNoEmergencyContact) {
				this.phoneNoEmergencyContact = phoneNoEmergencyContact;
			}

			public String getPrimaryInsurance() {
				return primaryInsurance;
			}

			public void setPrimaryInsurance(String primaryInsurance) {
				this.primaryInsurance = primaryInsurance;
			}

			public String getPrimaryInsuranceNo() {
				return primaryInsuranceNo;
			}

			public void setPrimaryInsuranceNo(String primaryInsuranceNo) {
				this.primaryInsuranceNo = primaryInsuranceNo;
			}
			public String getVisitReason() {
				return visitReason;
			}

			public void setVisitReason(String visitReason) {
				this.visitReason = visitReason;
			}

			public String getPatientType() {
				return PatientType;
			}



			public void setPatientType(String patienttype) {
				this.PatientType = patienttype;
			}



 @Override
			public String toString() {
					return 	"First Name: " + firstName + " LastName: " + lastName + "\n Email: " + email + 
							"Patient ID: " + ID + "\n SSN: "+SSN+"\n Address: "+Address+ "Apt.#: "+aptNo+
							"\n City:"+city+"State: "+state+"Zip:"+zipCode+"\nMarital Status: " + maritalStatus+
							"\n Employment Status: "+employementStatus+"Employer: "+employer+ "\nEmergency Contact: "
							+emergencyContact+"Relationship to Patient: "+relatedEmercgenyContact+" \nPhone Number: "
							+phoneNoEmergencyContact+"\n\nPrimary Insurance: "+primaryInsurance+"Policy # :"
							+primaryInsuranceNo+"\nReason for visit: "+visitReason +"\nPatient Type:"+PatientType;
									
				}





 


}





