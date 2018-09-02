package com.qiaohan.Enum;

public class SwitchEnum {

    static Signal color=Signal.Red;

    public static void change(){
        switch(color){
            case Red:
                System.out.println("red");
                break;
            case Yellow:
                System.out.println("yellow");
                break;
        }
    }

    public static void main(String[] args) {
        change();
    }
}

enum Signal{
    Red,Yellow
}
