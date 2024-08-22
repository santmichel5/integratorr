package com.example.usuario_api.controller;

import com.example.usuario_api.model.Usuario;
import com.example.usuario_api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/batch")
    public List<Usuario> crearUsuarios(@RequestBody List<Usuario> usuarios) {
        return usuarioService.crearUsuarios(usuarios);
    }

    @GetMapping("/{id}")
    public Usuario obtenerUsuarioPorId(@PathVariable Long id){
        return usuarioService.obtenerUsuarioPorId(id);
    }

    @GetMapping
    public List<Usuario> obtenerTodosLosUsuarios(){
        return usuarioService.obtenerTodosLosUsuarios();
    }
    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable Long id,@RequestBody Usuario usuario){
        return usuarioService.actualizarUsuario(id,usuario);
    }
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id){
        usuarioService.eliminarUsuario(id);
    }

}
