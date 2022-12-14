
package com.proyectoIntegrador.portfolioLAM.Controller;

import com.proyectoIntegrador.portfolioLAM.Dto.dtoSkill;
import com.proyectoIntegrador.portfolioLAM.Entity.Skill;
import com.proyectoIntegrador.portfolioLAM.Security.Controller.Mensaje;
import com.proyectoIntegrador.portfolioLAM.Service.SSkill;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/skill")
@CrossOrigin(origins = "https://portfoliolumarka.web.app/")
public class CSkill {

    @Autowired
    SSkill sSkill;

    @GetMapping("/lista")
    public ResponseEntity<List<Skill>> list() {
        List<Skill> list = sSkill.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Skill> getById(@PathVariable("id") int id) {
        if (!sSkill.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe la ID!"), HttpStatus.BAD_REQUEST);
        }

        Skill skill = sSkill.getOne(id).get();
        return new ResponseEntity(skill, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sSkill.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe la ID!"), HttpStatus.NOT_FOUND);
        }
        sSkill.delete(id);
        return new ResponseEntity(new Mensaje("Skill eliminada!"), HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoSkill dtoskill) {
        if (StringUtils.isBlank(dtoskill.getImg())) {
            return new ResponseEntity(new Mensaje("El link es obligatorio!"), HttpStatus.BAD_REQUEST);
        }

        Skill skill = new Skill(
                dtoskill.getImg(), dtoskill.getProgreso()
        );
        sSkill.save(skill);
        return new ResponseEntity(new Mensaje("Skill creada!"), HttpStatus.OK);

    }
    //@PreAuthorize("hasRole('ADMIN', 'USER')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoSkill dtoskill) {
        if (!sSkill.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe la ID!"), HttpStatus.NOT_FOUND);
        }
        
        if (StringUtils.isBlank(dtoskill.getImg())) {
            return new ResponseEntity(new Mensaje("El link no puede estar vacio!"), HttpStatus.BAD_REQUEST);
        }

        Skill skill = sSkill.getOne(id).get();

        skill.setImg(dtoskill.getImg());
        skill.setProgreso(dtoskill.getProgreso());

        sSkill.save(skill);

        return new ResponseEntity(new Mensaje("Skill actualizada!"), HttpStatus.OK);
    }
}

