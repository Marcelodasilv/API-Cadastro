package com.SpringBoot.ProjetoJava.repository;

import com.SpringBoot.ProjetoJava.entity.ProjetoJavaEntity;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;

public class ProjetoJavaRepositoryArmazem {

    @Autowired EntityManager EM;

    public ProjetoJavaEntity NEW_ENTITY;
    public ProjetoJavaEntity CL;
}
