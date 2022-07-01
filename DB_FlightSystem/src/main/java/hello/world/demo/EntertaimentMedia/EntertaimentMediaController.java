package hello.world.demo.EntertaimentMedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "media")
public class EntertaimentMediaController {
    EntertaimentMediaService entertaimentMediaService;
@Autowired
    public EntertaimentMediaController(EntertaimentMediaService entertaimentMediaService) {
        this.entertaimentMediaService = entertaimentMediaService;
    }
    @GetMapping
    public List<EntertaimentMedia> getMedia(){
    return entertaimentMediaService.getMedia();
    }
    @GetMapping(path = "{id}")
    public Optional<EntertaimentMedia> getMedia(@PathVariable("id")Long id){
    return entertaimentMediaService.getMedia(id);
    }
    @PostMapping
    public void addMedia(@RequestBody EntertaimentMedia entertaimentMedia){
       entertaimentMediaService.addMedia(entertaimentMedia);
    }
}
