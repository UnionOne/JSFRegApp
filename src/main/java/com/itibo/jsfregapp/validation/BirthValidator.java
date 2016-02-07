package com.itibo.jsfregapp.validation;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Created by union on 07.02.2016.
 */
@FacesValidator("birthValidator")
public class BirthValidator implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        if ("birth".equals(o.toString())) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "All ok", null));
        }
    }
}
