package com.phonbopit.zombielien.screens;

import com.badlogic.gdx.Screen;
import com.phonbopit.zombielien.Zombielien;

/**
 * Main Game Screen
 */
public class GameScreen implements Screen {

    Zombielien game;

    public GameScreen(Zombielien game) {
        this.game = game;
    }

    private void updateWorld(float delta) {

    }


    @Override
    public void render(float delta) {

        updateWorld(delta);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}

