package org.example.behavioral.ChainOfResponsibility;

/**
 * Created by Roledene on 3/23/2016.
 */
public class ChainOfResponsibility {

    public static void main(String[] args){
        Director bryan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();

        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE,500);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE,1000);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE,2000);
        bryan.handleRequest(request);

    }
}
