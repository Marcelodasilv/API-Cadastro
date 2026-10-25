package com.SpringBoot.ProjetoJava.repository;

import com.SpringBoot.ProjetoJava.entity.ProjetoJavaEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Repository
@Getter @Setter

public class ProjetoJavaRepositoryDelete extends ProjetoJavaRepositoryArmazem {

    public void deleteMetodo ( long id ) {
        var cl = EM.find ( ProjetoJavaEntity.class, id );
        EM.remove ( cl ); }
}
