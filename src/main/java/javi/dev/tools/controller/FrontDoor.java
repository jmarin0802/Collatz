package javi.dev.tools.controller;

import javi.dev.tools.model.Mensaje;
import javi.dev.tools.service.ContenidoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carta")
@Slf4j
public class FrontDoor {

    private ContenidoService contenidoService;

    public FrontDoor(ContenidoService contenidoService) {
        this.contenidoService = contenidoService;
    }

    @GetMapping("/mensaje")
    public ResponseEntity<?> getContenido(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        log.info("Datos del usuario: {}",auth.getPrincipal());
        log.info("Datos de los Permisos: {}",auth.getAuthorities());
        log.info("Esta autenticado {}",auth.isAuthenticated());

        return ResponseEntity.ok(contenidoService.getContenido());
    }

    @GetMapping("/admin")
    public ResponseEntity<?> getContenidoAdmin(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        log.info("Datos del usuario: {}",auth.getPrincipal());
        log.info("Datos de los Permisos: {}",auth.getAuthorities());
        log.info("Esta autenticado {}",auth.isAuthenticated());

        return ResponseEntity.ok(contenidoService.getContenidoAdmin());
    }

    @GetMapping("/publico")
    public ResponseEntity<?> getContenidoPublico(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        log.info("Datos del usuario: {}",auth.getPrincipal());
        log.info("Datos de los Permisos: {}",auth.getAuthorities());
        log.info("Esta autenticado {}",auth.isAuthenticated());

        return ResponseEntity.ok(contenidoService.getContenidoPublico());
    }
}
