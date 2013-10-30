/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sas.brd.sicc.model;

import com.sas.brd.model.BaseObject;
import java.io.Serializable;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author tzuhsien
 */
public class Course extends BaseObject implements Serializable, GrantedAuthority {

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAuthority() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
