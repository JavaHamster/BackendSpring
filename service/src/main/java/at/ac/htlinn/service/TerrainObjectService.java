package at.ac.htlinn.service;

import at.ac.htlinn.model.entities.TerrainObject;

import java.util.Set;

public interface TerrainObjectService {
    void compareAndUpdateDatabase(TerrainObject terrainObject);
}
