package com.SpringBoot.ProjetoJava.service;

import com.SpringBoot.ProjetoJava.entity.ProjetoJavaEntity;
import org.springframework.stereotype.Service;

@Service
public class ProjetoJavaServiceValidacaoGet extends ProjetoJavaServiceArmazem {

    public ProjetoJavaEntity getService (long id ) {
        return pjrget.findMetodo ( id ); }
}
