package at.ac.htlinn.database.repositories;

import at.ac.htlinn.model.entities.TerrainObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface TerrainObjectRepository extends JpaRepository<TerrainObject, Long> {
    Set<TerrainObject> findAllByUserID(long id);
}
