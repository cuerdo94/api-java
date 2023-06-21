package com.example.Apis.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Apis.models.UsuarioModel;
import com.example.Apis.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios() {

        return (ArrayList<UsuarioModel>) this.usuarioService.obtenerUsuarios();

    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel nuevoUsuario) {
        return this.usuarioService.guardarUsuario(nuevoUsuario);

    }

    @GetMapping("/activos")
    public ArrayList<UsuarioModel> obtenerUsuariosActivos() {

        return (ArrayList<UsuarioModel>) usuarioService.obtenerUsuariosActivos(true);

    }
}
