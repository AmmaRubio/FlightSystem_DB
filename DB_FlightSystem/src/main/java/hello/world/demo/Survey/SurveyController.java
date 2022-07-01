package hello.world.demo.Survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "survey")
public class SurveyController {

    private final SurveyService surveyService;
    @Autowired
    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }
    @GetMapping
    public List<Survey> getSurvey(){ // GET request for all entities
      return  surveyService.getSurvey();
    }
    @PostMapping
    public void addSurvey(@RequestBody Survey survey){
        surveyService.addSurvey(survey);
    }
}
