package coreservlets;
import org.apache.struts.action.*;
public class RegistrationFormBean extends ActionForm {
private String firstName, lastName, emailAddress;
public String getFirstName() {
return(firstName);
}
public void setFirstName(String firstName) {
this.firstName = firstName;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}

}