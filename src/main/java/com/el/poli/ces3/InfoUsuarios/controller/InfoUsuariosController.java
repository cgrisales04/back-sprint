package com.el.poli.ces3.InfoUsuarios.controller;

import com.el.poli.ces3.InfoUsuarios.dao.InfoUsuariosDAO;
import com.el.poli.ces3.InfoUsuarios.model.InfoUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InfoUsuariosController {
    @Autowired
    private InfoUsuariosDAO info_usuario_dao;

    @RequestMapping(value = "test")
    public String test(){
        return "Hola Spring";
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<InfoUsuarios>getInfoUsuarios(){
        return info_usuario_dao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public InfoUsuarios getInfoUsuario(@PathVariable("id") int id){
        return info_usuario_dao.getInfoUsuario(id);
    }
    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public InfoUsuarios createInfoUsuario(@RequestBody InfoUsuarios e){
        return info_usuario_dao.createInfoUsuario(e);
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.PUT)
    public InfoUsuarios updateInfoUsuario(@PathVariable("id") int id, @RequestBody InfoUsuarios e){
        return info_usuario_dao.updateInfoUsuario(id, e);
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public InfoUsuarios deleteInfoUsuario(@PathVariable("id") int id){
        return info_usuario_dao.deleteInfoUsuario(id);
    }
}
