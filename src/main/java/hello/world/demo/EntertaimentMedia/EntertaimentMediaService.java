package hello.world.demo.EntertaimentMedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class EntertaimentMediaService {
    EntertaimentMediaRepository entertaimentMediaRepository;
@Autowired
    public EntertaimentMediaService(EntertaimentMediaRepository entertaimentMediaRepository) {
        this.entertaimentMediaRepository = entertaimentMediaRepository;
    }
    public List<EntertaimentMedia> getMedia(){
    return entertaimentMediaRepository.findAll();
    }
    public Optional<EntertaimentMedia> getMedia(Long id){
    return entertaimentMediaRepository.findById(id);
    }
    public void addMedia(EntertaimentMedia media){
    entertaimentMediaRepository.save(media);
    }
}
