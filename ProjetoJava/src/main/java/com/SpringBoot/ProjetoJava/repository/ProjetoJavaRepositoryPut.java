package com.SpringBoot.ProjetoJava.repository;

import com.SpringBoot.ProjetoJava.entity.ProjetoJavaEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Repository
@Getter @Setter

public class ProjetoJavaRepositoryPut extends ProjetoJavaRepositoryArmazem {

    public void setMetodo ( long id, ProjetoJavaEntity entity ) {
        entity.setId ( id );
        NEW_ENTITY = EM.merge ( entity ); }
}
