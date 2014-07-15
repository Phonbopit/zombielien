package com.phonbopit.zombielien;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.phonbopit.zombielien.screens.MainMenuScreen;

public class Zombielien extends com.badlogic.gdx.Game {
	public SpriteBatch batch;

	@Override
	public void create () {
		batch = new SpriteBatch();
        setScreen(new MainMenuScreen(this));
	}

	@Override
	public void render () {
	    super.render();
	}

}
