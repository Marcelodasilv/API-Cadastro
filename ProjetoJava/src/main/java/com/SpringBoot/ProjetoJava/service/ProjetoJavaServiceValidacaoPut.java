package com.SpringBoot.ProjetoJava.service;

import com.SpringBoot.ProjetoJava.entity.ProjetoJavaEntity;
import com.SpringBoot.ProjetoJava.exception.RegraNegocioException;
import org.springframework.stereotype.Service;

@Service
public class ProjetoJavaServiceValidacaoPut extends ProjetoJavaServiceArmazem {

    public String validacaoPut (ProjetoJavaEntity entity, long id) {
        boolean[] p = {false, false, false, false, false};

            for (int a = 0; a < entity.getSenha().length(); a++) {
                char caracter = entity.getSenha().charAt(a);

                if (caracter >= 'a' && caracter <= 'z') { p[0] = true; } //Letra Minuscula
                else if (caracter >= 'A' && caracter <= 'Z') { p[1] = true; } //Letra Maiuscula
                else if (caracter >= '0' && caracter <= '9') { p[2] = true; } //Número
                else { p[3] = true; } } //Símbolo

            if ( !p[0] || !p[1] ||
                    !p[2] || !p[3] ) { throw new RegraNegocioException ("Erro na senha e/ou no email."); }
            else { status = "ok";
                pjrput.setMetodo(id, entity); }

        return status; }
}
