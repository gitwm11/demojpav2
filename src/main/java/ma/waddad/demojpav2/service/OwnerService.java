package ma.waddad.demojpav2.service;

import jakarta.transaction.Transactional;
import ma.waddad.demojpav2.dao.entities.Owner;
import ma.waddad.demojpav2.dao.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class OwnerService implements OwnerManager{

    @Autowired
    private OwnerRepository ownerRepository;
    @Override
    public Owner addOwner(Owner owner) {
        try {
            return ownerRepository.save(owner);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            return null;
        }

    }

    @Override
    public Owner updateOwner(Owner owner) {
        try {
            return ownerRepository.save(owner);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            return null;
        }

    }

    @Override
    public boolean deleteOwner(Owner owner) {
        try {
            ownerRepository.delete(owner);

        }catch (Exception exception){
            System.out.println(exception.getMessage());
            return false;
        }
        return false;
    }

    @Override
    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }
}
