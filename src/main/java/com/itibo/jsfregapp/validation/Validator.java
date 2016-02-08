package com.itibo.jsfregapp.validation;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import java.io.Serializable;

/**
 * Created by union on 08.02.2016.
 */

@ManagedBean
@SessionScoped
public final class Validator implements Serializable {
    private static final long serialVersionUID = 1L;

    public static void firstNameValidation(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        if ("name".equals(o.toString())) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Not ok", null));
        }
    }

    public static void lastNameValidation(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        if ("last".equals(o.toString())) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Not ok", null));
        }
    }

    public static void birthValidation(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        if ("birth".equals(o.toString())) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Not ok", null));
        }
    }

    public static void emailValidation(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        if ("email".equals(o.toString())) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Not ok", null));
        }
    }
}
