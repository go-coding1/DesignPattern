package com.company.design.adapter;

public class AdapterMain {
    public void main(){
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);
    }
    //콘센트는 110v 짜리 콘센트만 연결할 수 있게 ehla
    public void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
