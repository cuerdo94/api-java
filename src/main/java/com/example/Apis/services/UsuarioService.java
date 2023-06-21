package com.example.Apis.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Apis.models.UsuarioModel;
import com.example.Apis.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios() {

        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();

    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario) {

        return usuarioRepository.save(usuario);

    }

    public ArrayList<UsuarioModel> obtenerUsuariosActivos(Boolean activo) {

        return (ArrayList<UsuarioModel>) usuarioRepository.findByActivo(activo);

    }

}
