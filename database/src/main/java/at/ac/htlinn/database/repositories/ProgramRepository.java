package at.ac.htlinn.database.repositories;

import at.ac.htlinn.model.entities.Program;
import at.ac.htlinn.model.entities.TerrainObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Long> {
    Set<Program> findAllByUserID(long id);
}
