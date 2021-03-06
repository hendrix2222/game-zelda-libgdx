package com.mursaat.zelda.structures;

import java.util.HashMap;

/**
 * Created by Aurelien on 14/01/2016.
 */
public class Structures
{
    private static int currentId = 0;

    public static StructureHouse red_house;
    public static StructureTree tree;

    private static HashMap<Integer, Structure> structures = new HashMap<Integer, Structure>();

    public static void registerStructures()
    {
        red_house = new StructureHouse("red_house", currentId++);
        tree = new StructureTree("tree", currentId++);

        structures.put(red_house.id, red_house);
        structures.put(tree.id, tree);
    }

    public static Structure getStructure(int id)
    {
        return structures.get(id);
    }
}
