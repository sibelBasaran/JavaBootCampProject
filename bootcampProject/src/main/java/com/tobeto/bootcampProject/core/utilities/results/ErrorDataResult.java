package com.tobeto.bootcampProject.core.utilities.results;

public class ErrorDataResult <T> extends DataResult<T>{

    public ErrorDataResult(T data,String message){
        //datayı gönder.success drumunu gonder,medsaji gonder
        super(data,false,message);
    }
    public ErrorDataResult(T data){
        super(data,false);
    }
    public ErrorDataResult(String message){
        super(null,false,message);

    }
    public ErrorDataResult(){
        super(null,false);
    }

}
