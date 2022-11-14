package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music1 = context.getBean("rockMusic", Music.class);
//        MusicPlayer rockMusicPlayer = new MusicPlayer(music1);
//        rockMusicPlayer.playMusic();
//
//        Music music2 = context.getBean("classicalMusic", Music.class);
//        MusicPlayer claccicalMusicPlayer = new MusicPlayer(music2);
//        claccicalMusicPlayer.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusic2 == classicalMusic1);
        context.close();
    }
}
