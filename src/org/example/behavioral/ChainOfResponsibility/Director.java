package org.example.behavioral.ChainOfResponsibility;

/**
 * Created by Roledene on 3/23/2016.
 */
public class Director extends Handler{

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.CONFERENCE){
            System.out.println("Director can approve conference");
        }else{
            successor.handleRequest(request);
        }
    }
}
