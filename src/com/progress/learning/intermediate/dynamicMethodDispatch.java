package com.progress.learning.intermediate;
class One{
    public void greet(){
        System.out.println("Java");
    }
    public void main(String[] args) {
        System.out.println("Java class 1");
    }
}

class Two extends One{
    public void greet(){
    }
    public void name(String[] args){
        System.out.println("Java class 2");
    }
}

public class dynamicMethodDispatch {
    public static void main(String[] args) {
        One Objection = new One();
        Objection.greet();
    }
}
