package com.jpj.java.session.streams.exercises.game;

import java.io.IOException;
import java.util.stream.Stream;

public interface GameSource {

    Stream<Game> getGamesFromFile() throws IOException;

}
