package com.design.macro;

import com.design.Command;
import com.design.audioplayer.AudioPlayer;
import com.design.audioplayer.PlayCommand;
import com.design.audioplayer.RewindCommand;
import com.design.audioplayer.StopCommand;

public class Julia {
    public static void main(String[]args){
        //创建接收者对象
        AudioPlayer audioPlayer = new AudioPlayer();
        //创建命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        MacroCommand marco = new MacroAudioCommand();

        marco.add(playCommand);
        marco.add(rewindCommand);
        marco.add(stopCommand);
        marco.execute();
    }
}
