package com.design.extrinsic_iterator;

import com.design.Aggregate;
import com.design.Iterator;

public class Client {

    private void operation(){
        Object[] objArray = {"One","Two","Three","Four","Five","Six"};
        //创建聚合对象
        Aggregate agg = new ConcreteAggregate(objArray);
        //循环输出聚合对象中的值
        Iterator it = agg.createIterator();
        while(!it.isDone()){
            System.out.println(it.currentItem());
            it.next();
        }
    }
    public static void main(String[] args) {

        Client client = new Client();
        client.operation();
    }

}
