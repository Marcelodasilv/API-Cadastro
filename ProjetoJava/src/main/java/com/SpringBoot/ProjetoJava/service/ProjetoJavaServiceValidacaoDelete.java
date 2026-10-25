package com.SpringBoot.ProjetoJava.service;

import org.springframework.stereotype.Service;

@Service
public class ProjetoJavaServiceValidacaoDelete extends ProjetoJavaServiceArmazem {

    public void deleteService ( long id ) {
        pjrdelete.deleteMetodo ( id ); }
}
