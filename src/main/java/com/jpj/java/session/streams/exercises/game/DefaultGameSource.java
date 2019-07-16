package com.jpj.java.session.streams.exercises.game;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DefaultGameSource implements GameSource {

    @Override
    public Stream<Game> getGamesFromFile() throws IOException {
        Path path = Paths.get("games.csv");
        return Files.lines(path)
                .map(line -> line.split(","))
                .map(strings -> Game.builder()
                        .id(strings[0])
                        .name(strings[1])
                        .active(Boolean.parseBoolean(strings[2]))
                        .featured(Boolean.parseBoolean(strings[3]))
                        .hasFreeTrial(Boolean.parseBoolean(strings[4]))
                        .build());
    }

}
