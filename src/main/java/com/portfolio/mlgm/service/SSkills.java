package com.portfolio.mlgm.service;

import com.portfolio.mlgm.entity.Skills;
import com.portfolio.mlgm.repository.RSkills;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Transactional
@Service
public class SSkills {
    @Autowired
    RSkills rskills;
    
 public List<Skills> list(){
        return rskills.findAll();
    }
    
    public Optional<Skills> getOne(int id){
        return rskills.findById(id);
    }
    
    public Optional<Skills> getByNombre(String nombre){
        return rskills.findByNombre(nombre);
    }
    
    public void save(Skills skill){
        rskills.save(skill);
    }
    
    public void delete(int id){
        rskills.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rskills.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rskills.existsByNombre(nombre);
    }   
    
    
    
}
