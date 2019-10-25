package com.design.decorator.monkey;

import com.design.decorator.monkey.impl.Bird;
import com.design.decorator.monkey.impl.Fish;
import com.design.decorator.monkey.impl.Monkey;

public class Client {

    public static void main(String[] args) {
        TheGreatestSage sage = new Monkey();
        // 第一种写法
        TheGreatestSage bird = new Bird(sage);
        TheGreatestSage fish = new Fish(bird);
        // 第二种写法
        //TheGreatestSage fish = new Fish(new Bird(sage));
        bird.move();
        fish.move();
    }
}
