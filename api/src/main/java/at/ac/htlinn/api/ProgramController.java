package at.ac.htlinn.api;

import at.ac.htlinn.model.entities.Program;
import at.ac.htlinn.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/program")
public class ProgramController {
    @Autowired
    ProgramService programService;

    @PreAuthorize("hasAuthority('USER')")
    @PostMapping(path = "saveOrUpdate")
    public void saveProgram(@RequestBody Program program){programService.saveOrUpdate(program);}

    @PreAuthorize("hasAuthority('USER')")
    @DeleteMapping(path = "delete/{program_id}")
    public void deleteProgram(@PathVariable("program_id") long programId){programService.delete(programId);}


}
