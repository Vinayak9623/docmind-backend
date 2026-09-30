package com.vd.exception;

public class DocumentProcessingException extends RuntimeException{
    public DocumentProcessingException(String message){
        super(message);
    }

    public DocumentProcessingException(){
        super("Error in processing Document");
    }

    public DocumentProcessingException(String message, Throwable ex){
        super(message,ex);
    }
}
