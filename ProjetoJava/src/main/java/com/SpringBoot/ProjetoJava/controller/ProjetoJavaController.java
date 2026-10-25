package com.SpringBoot.ProjetoJava.controller;

import com.SpringBoot.ProjetoJava.entity.ProjetoJavaEntity;
import com.SpringBoot.ProjetoJava.service.ProjetoJavaServiceValidacaoPut;
import com.SpringBoot.ProjetoJava.service.ProjetoJavaServiceValidacaoPost;
import com.SpringBoot.ProjetoJava.service.ProjetoJavaServiceValidacaoGet;
import com.SpringBoot.ProjetoJava.service.ProjetoJavaServiceValidacaoDelete;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping ( "/menu" )

public class ProjetoJavaController {


    @Autowired private ProjetoJavaServiceValidacaoPut pjsvput;
    @Autowired private ProjetoJavaServiceValidacaoPost pjsvpost;
    @Autowired private ProjetoJavaServiceValidacaoGet pjsvget;
    @Autowired private ProjetoJavaServiceValidacaoDelete pjsvdelete;


    @GetMapping ( value = "/get/{id}" )
    public ProjetoJavaEntity get ( @PathVariable Long id ) {
        return pjsvget.getService ( id ); }


    @Transactional
    @PostMapping ( value = "/post" )
    public String post ( @Valid @RequestBody ProjetoJavaEntity entity ) {
        return pjsvpost.validacaoPost ( entity ); }


    @Transactional
    @PutMapping ( value = "/put/{id}" )
    public String put ( @PathVariable long id,
                                  @Valid @RequestBody ProjetoJavaEntity entity ) {
        return pjsvput.validacaoPut ( entity, id ); }


    @Transactional
    @DeleteMapping ( value = "/delete/{id}" )
    public void delete ( @PathVariable long id ) {
        pjsvdelete.deleteService ( id ); }
}
