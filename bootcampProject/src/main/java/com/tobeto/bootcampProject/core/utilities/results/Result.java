package com.tobeto.bootcampProject.core.utilities.results;

public class Result {
    private boolean success; //200 true
    private String message; // eklendi.
    //sadece işlemin başarılı olup olmadığını kontrol eder.
    public Result(boolean success) {
        this.success = success;
    }
    //burada mesaj da görüntülenir.
    public Result(boolean success,String message){
        this(success);
        this.message =message;

    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }





}
