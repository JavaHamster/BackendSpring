package at.ac.htlinn.service;

import at.ac.htlinn.model.entities.Program;

public interface ProgramService {
    void compareAndUpdateDatabase(Program program);

    void saveOrUpdate(Program program);

    void delete(long programId);
}
