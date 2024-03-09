package com.tobeto.bootcampProject.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T>{
    //her ihtimale göre constructor türleri (cons.overloading)
    public SuccessDataResult(T data, String message){
        super(data,true,message);
    }
    public SuccessDataResult(T data){
        super(data,true);
    }
    public SuccessDataResult(String message){
        super(null,true,message);
    }
    public SuccessDataResult(){
        super(null,true);
    }
}
