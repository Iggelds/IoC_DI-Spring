package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
//    private Music music;
    private List<Music> musicList = new ArrayList<Music>();

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //IoC
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public  MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }
    public MusicPlayer () {

    }

//    public void setMusic(Music music) {
//        this.music = music;
//    }
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (Music music: musicList) {
            System.out.println("Plaing: " + music.getSong());
        }
    }
}
