package org.example.behavioral.ChainOfResponsibility;

/**
 * Created by Roledene on 3/23/2016.
 */
public class CEO extends Handler{
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve anything they want");
    }
}
