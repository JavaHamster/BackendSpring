package at.ac.htlinn.service.impl;

import at.ac.htlinn.database.repositories.TerrainObjectRepository;
import at.ac.htlinn.model.entities.TerrainObject;
import at.ac.htlinn.service.TerrainObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TerrainObjectServiceImpl implements TerrainObjectService {
    @Autowired
    TerrainObjectRepository terrainObjectRepository;

    @Override
    public void compareAndUpdateDatabase(TerrainObject terrainObject) {
        terrainObject.setHashValue(terrainObject.hashCode());
        Set<TerrainObject> userTerrains = terrainObjectRepository.findAllByUserID(terrainObject.getUserID());

        if (!userTerrains.isEmpty()) {
            userTerrains.forEach(t -> {
                if (t.getHashValue() == terrainObject.getHashValue()) {
                    t = terrainObject;
                    terrainObjectRepository.save(t);
                }
            });
        }else{
            terrainObjectRepository.save(terrainObject);
        }
    }
}
