package br.com.mmsilveira.template.controller;

import org.jboss.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@ManagedBean
@ViewScoped
public class LoginBean implements Serializable {

    private static Logger LOG = Logger.getLogger(LoginBean.class);

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
