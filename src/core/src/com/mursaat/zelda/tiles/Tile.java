package com.mursaat.zelda.tiles;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * @author Mursaat
 * Un simpe Tile orthogonal qui pourra être stocké dans une map puis affiché à l'écran
 */
public class Tile
{
    // Le chemin qui mène aux tiles dans les assets
    protected static final String PATH = "tiles/";
    // La taille du côté d'un tile
    public static final int TILE_SIZE = 16;

    // ID du Tile
    protected int id;
    // Le nom du tile à charger dans les assets
    protected String name;
    // La texture chargée
    protected Texture texture;

    public Tile(String name, int id)
    {
        this.name = name;
        this.id = id;
        this.texture = new Texture(Gdx.files.internal(PATH + this.name + ".png"));
    }

    // Retourne la texture
    public Texture getTexture()
    {
        return texture;
    }

    public void draw(SpriteBatch batch, float deltaTime, int xPos, int yPos)
    {
        batch.draw(getTexture(), xPos, yPos);
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
}
