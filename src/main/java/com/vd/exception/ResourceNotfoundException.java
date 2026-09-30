package com.vd.exception;

public class ResourceNotfoundException extends RuntimeException{

    public ResourceNotfoundException(String message){
        super(message);
    }

    public ResourceNotfoundException(){
        super("Resource you are looking not found");
    }

    public ResourceNotfoundException(String message,Throwable ex){
        super(message,ex);
    }
}
