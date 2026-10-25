package com.SpringBoot.ProjetoJava.repository;

import com.SpringBoot.ProjetoJava.entity.ProjetoJavaEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Repository
@Getter @Setter

public class ProjetoJavaRepositoryGet extends ProjetoJavaRepositoryArmazem {

    public ProjetoJavaEntity findMetodo (long id ) {
        return CL = EM.find ( ProjetoJavaEntity.class, id ); }
}
