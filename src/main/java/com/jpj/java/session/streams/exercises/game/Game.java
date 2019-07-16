package com.jpj.java.session.streams.exercises.game;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Game {

    String id;

    String name;

    Boolean active;

    Boolean featured;

    Boolean hasFreeTrial;

}
