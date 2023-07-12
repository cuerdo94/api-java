package com.example.Apis.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Apis.models.UsuarioModel;
import com.example.Apis.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios() {

        return (ArrayList<UsuarioModel>) this.usuarioRepository.findAll();

    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario) {

        return this.usuarioRepository.save(usuario);

    }

    public ArrayList<UsuarioModel> obtenerUsuariosActivos(Boolean activo) {

        return this.usuarioRepository.findByActivo(activo);

    }

    public Optional<UsuarioModel> obtenerPorID(Long id) {
        return this.usuarioRepository.findById(id);
    }

    public boolean eliminarUsuario(Long id) {

        Boolean respuesta = false;
        try {
            this.usuarioRepository.deleteById(id);
            respuesta = true;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return respuesta;
    }
}
