package ma.waddad.demojpav2.service;

import ma.waddad.demojpav2.dao.entities.Owner;

import java.util.List;

public interface OwnerManager {
    public Owner addOwner(Owner owner);
    public Owner updateOwner(Owner owner);
    public boolean deleteOwner(Owner owner);
    public List<Owner> getAllOwners();


}
