package com.company.design.singleton;

public class SocketClient {
    private static SocketClient socketClient = null;

    //기본 생성자를 private로 만든다.
    private SocketClient(){

    }

    /**
     * SocketClient의 객체를 반환해 주는 함수이다.
     * static으로 작성했기 때문에 외부에서 누구든지 호출할 수 있다.
     * static변수의 SocketClient가 null이면 새로 new 해서 리턴해주고
     * null이 아니면 static 변수를 리턴해준다.
     * @return SocketClient
     */
    public static SocketClient getInstance(){
        if(socketClient == null){
           socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect(){
        System.out.println("connect");
    }
}
