package org.example;

import org.springframework.context.annotation.*;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic () {
        return new ClassicalMusic();
    }

    @Bean
    @Scope
    public RockMusic rockMusic () {
        return new RockMusic();
    }

    @Bean
    @Scope
    public RapMusic rapMusic () {
        return new RapMusic();
    }

    @Bean
    List<Music> musicList() {
        return Arrays.asList(classicalMusic(), rockMusic(), rapMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
