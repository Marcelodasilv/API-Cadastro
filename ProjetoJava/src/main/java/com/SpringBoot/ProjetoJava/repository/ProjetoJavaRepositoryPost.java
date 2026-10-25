package com.SpringBoot.ProjetoJava.repository;

import com.SpringBoot.ProjetoJava.entity.ProjetoJavaEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Repository
@Getter @Setter

public class ProjetoJavaRepositoryPost extends ProjetoJavaRepositoryArmazem {

    public void persistenceMetodo ( ProjetoJavaEntity entity ) {
        EM.persist ( entity ); }
}
