# 디자인 패턴 정리

> IDE : IntelliJ
>
> Java : java 11
>
> 각 패키지 안에 패키지명+Main으로 이루어진 클래스가 있습니다.
>
> Main함수에서 각 패키지에 있는 Main클래스의 객체를 생성해서 main()을 호출해 각 디자인 패턴을 실행 해 볼 수 있습니다.

### Singleton Pattern

Singleton 패턴은 어떠한 클래스(객체)가 유일하게 1개만 존재할 때 사용한다.

이를 주로 사용하는 곳은 서로 자원을 공유 할 때 사용하는데, 실물 세계에서는 프린터가 해당되며, 실제 프로그래밍에서는 TCP Socket 통신에서 서버와 연결된 connect 객체에 주로 사용한다.

예제

어떠한 서버와 통신하는 소켓이 있다고 가정했을 때, 이 소켓이 매번 새로 연결하는게 아니라 계속해서 연결한 상태의 소켓을 예로 든다.

> SocketClient.java
>
> ​	서버와 연결하는 Client 객체를 싱글톤으로 제공해주는 클래스
>
> AClazz.java
>
> ​	SocketClient.java로 부터 Client객체를 제공받아 사용하는 클래스
>
> BClazz.java
>
> ​	SocketClient.java로 부터 Client객체를 제공받아 사용하는 클래스



### Adapter pattern

Adapter는 실생활에서 100v를 220v로 변경해주거나, 그 반대로 해주는 흔히 돼지코 라고 불리는 변환기를 예로 들 수 있다.

호환성이 없는 기존 클래스의 인터페이스를 변환하여 재사용 할 수 있도록 한다.

SOLID중 개방폐쇄 원칙(OCP)를 따른다.

![image](https://user-images.githubusercontent.com/54675591/152748231-2acfe7bb-af7b-4c65-8cd9-6b28cb552cc9.png)

가운데 Adapter라는 클래스를 두고 변환 할 수 있게 한다.

```java
package com.company.design.adapter;

//220v를 110v로 변환해주는 Adapter 클래스 생성
public class SocketAdapter implements Electronic110V{
    private Electronic220V electronic220V;

    public SocketAdapter(Electronic220V electronic220V){
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerOn() {
        electronic220V.connect();
    }
}

```



