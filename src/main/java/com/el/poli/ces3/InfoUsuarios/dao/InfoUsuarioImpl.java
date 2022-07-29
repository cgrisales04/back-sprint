package com.el.poli.ces3.InfoUsuarios.dao;

import com.el.poli.ces3.InfoUsuarios.model.InfoUsuarios;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class InfoUsuarioImpl implements InfoUsuariosDAO{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public InfoUsuarios createInfoUsuario(InfoUsuarios info_usuario){
        return entityManager.merge(info_usuario);
    }

    @Override
    public InfoUsuarios updateInfoUsuario( int id, InfoUsuarios info_usuario){
        info_usuario.setId_usuario(id);
        return entityManager.merge(info_usuario);
    }

    @Override
    public InfoUsuarios deleteInfoUsuario(int id){
        InfoUsuarios info_usuario = entityManager.find(InfoUsuarios.class, id);
        entityManager.remove(info_usuario);
        return info_usuario;
    }
}
