package org.example.behavioral.ChainOfResponsibility;

/**
 * Created by Roledene on 3/23/2016.
 */
public class Request {
    private RequestType requestType;
    private double amount;

    public Request(RequestType requestType, double amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public double getAmount() {
        return amount;
    }
}
