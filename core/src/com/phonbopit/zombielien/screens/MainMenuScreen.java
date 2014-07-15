package com.phonbopit.zombielien.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.phonbopit.zombielien.Zombielien;

/**
 * Skeleton for main menu screen
 */
public class MainMenuScreen implements Screen {

    final Zombielien game;
    OrthographicCamera camera;

    public MainMenuScreen(final Zombielien game) {
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
    }

    /**
     * Waiting for handler input from user ex. Press a button Start. <br />
     * When press start setScreen to GameScreen.
     */
    private void handlerInput() {
        // TODO: Check button start, sound, option, high score.
    }

    @Override
    public void render(float delta) {

        // #3498DB
        Gdx.gl.glClearColor(0x34 / 255.0f, 0x98 / 255.0f, 0xd8 / 255.0f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();

        // Render here.

        game.batch.end();

        handlerInput();
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
