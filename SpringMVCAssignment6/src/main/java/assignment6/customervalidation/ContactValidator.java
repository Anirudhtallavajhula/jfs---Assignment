package assignment6.customervalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class ContactValidator implements ConstraintValidator<isValidContact,String> {

    public void initialize(isValidContact constraintAnnotation) {

    }

    public boolean isValid(String contact, ConstraintValidatorContext context) {
        if(contact.length()==10 && contact.matches("[0-9]+"))
            return true;
        return false;
    }
}
