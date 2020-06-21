package com.myking520.doraemon.codegeneration.infrastructure.mapper;

import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MapperObject {
    @Autowired
    MapperFacade mapperFacade;
   public <S, D> D map(S sourceObject, Class<D> destinationClass){
        return mapperFacade.map(sourceObject,destinationClass);
    }
}
