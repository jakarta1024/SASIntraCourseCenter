package com.sas.brd.service;

import com.sas.brd.model.Role;

import java.util.List;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:dan@getrolling.com">Dan Kibler </a>
 */
public interface RoleManager extends GenericManager<Role, Long> {
    /**
     * {@inheritDoc}
     * @param role
     * @return 
     */
    List getRoles(Role role);

    /**
     * {@inheritDoc}
     * @param rolename
     * @return 
     */
    Role getRole(String rolename);

    /**
     * {@inheritDoc}
     * @param role
     * @return 
     */
    Role saveRole(Role role);

    /**
     * {@inheritDoc}
     * @param rolename
     */
    void removeRole(String rolename);
}
