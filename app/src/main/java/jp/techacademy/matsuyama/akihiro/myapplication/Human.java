package jp.techacademy.matsuyama.akihiro.myapplication;

import android.util.Log;

/**
 * Created by Akihiro on 2017/07/24.
 */

public class Human extends Animal implements Thinkable {
    String hobby;
    Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }
    @Override
    public void say(){
        Log.d("javatest", "私の名前は" + this.name + "です。年は" + this.age + "です。");
    }
    @Override
    public void think(){
        Log.d("javatest", "「私は" + this.hobby + "について考える」");
    }
}
