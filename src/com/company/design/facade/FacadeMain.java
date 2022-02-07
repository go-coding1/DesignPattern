package com.company.design.facade;

public class FacadeMain {
    public void main(){
        /*
        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
        ftpClient.connect();
        ftpClient.moveDiretory();
        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.write();
        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconnect();
        ftpClient.disConnect();
        */
        //위의 상황대로 하면 너무 비효율 적이고 각 Client에 의존성을 가지고 있음

        SftpClient sftpClient = new SftpClient("www.foo.co.kr",22,"/home/etc","text.tmp");
        sftpClient.connect();

        sftpClient.write();

        sftpClient.read();

        sftpClient.dicConnect();
    }
}
