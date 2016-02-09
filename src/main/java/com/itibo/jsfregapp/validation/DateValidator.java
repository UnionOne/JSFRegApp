package com.itibo.jsfregapp.validation;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by union on 09.02.2016.
 */

@FacesValidator("date")
public class DateValidator implements Validator {
    private static final String DATE_PATTERN = "^([012][1-9]|10|20|30|31)/(01|03|05|07|08|10|12)/((1[6-9]|[2-9][0-9])[0-9]{2})|([012][1-9]|10|20|30)/(04|06|09|11)/((1[6-9]|[2-9][0-9])[0-9]{2})|29/02/((1[6-9]|[2-9][0-9])(04|08|[13579][26]|[2468][480])|(16|[2468][048]|[3579][26])00)|(0[1-9]|1[0-9]|2[0-8])/02/((1[6-9]|[2-9][0-9])[0-9]{2})$";

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        Pattern pattern = Pattern.compile(DATE_PATTERN);
        Matcher matcher = pattern.matcher(o.toString());
        if (!matcher.matches()) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Date is not ok", null));
        }
    }
}
