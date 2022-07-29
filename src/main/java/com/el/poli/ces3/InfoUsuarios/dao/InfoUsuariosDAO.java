package com.el.poli.ces3.InfoUsuarios.dao;

import com.el.poli.ces3.InfoUsuarios.model.InfoUsuarios;

import java.util.List;

public interface InfoUsuariosDAO {

    InfoUsuarios createInfoUsuario(InfoUsuarios info_usuario);
    InfoUsuarios updateInfoUsuario(int id, InfoUsuarios info_usuario);

    InfoUsuarios deleteInfoUsuario(int id);
}
