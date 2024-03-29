package com.design.command;

import com.design.Command;

/**
 * 具体命令角色类
 */
public class ConcreteCommand implements Command {
    //持有相应的接收者对象
    private Receiver receiver = null;
    /**
     * 构造方法
     */
    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.action();
    }
}
