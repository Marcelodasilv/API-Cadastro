package com.SpringBoot.ProjetoJava.service;


import com.SpringBoot.ProjetoJava.repository.ProjetoJavaRepositoryPut;
import com.SpringBoot.ProjetoJava.repository.ProjetoJavaRepositoryPost;
import com.SpringBoot.ProjetoJava.repository.ProjetoJavaRepositoryGet;
import com.SpringBoot.ProjetoJava.repository.ProjetoJavaRepositoryDelete;
import org.springframework.beans.factory.annotation.Autowired;

public class ProjetoJavaServiceArmazem {

    public @Autowired ProjetoJavaRepositoryPut pjrput;
    public @Autowired ProjetoJavaRepositoryPost pjrpost;
    public @Autowired ProjetoJavaRepositoryGet pjrget;
    public @Autowired ProjetoJavaRepositoryDelete pjrdelete;

    String  status;
}
