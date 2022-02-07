package com.company.design.singleton;

public class AClazz {
    private SocketClient socketClient;

    public AClazz(){
        //this.socketClient = new SocketClient(); 이거가 불가능한 구문
        this.socketClient = socketClient.getInstance();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
