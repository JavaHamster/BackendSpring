package at.ac.htlinn.api;

import at.ac.htlinn.service.TerrainObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/terrainObject")
public class TerrainObjectController {
    @Autowired
    TerrainObjectService terrainObjectService;

}
