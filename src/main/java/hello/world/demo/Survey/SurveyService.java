package hello.world.demo.Survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyService {
    SurveyRepository surveyRepository;
@Autowired
    public SurveyService(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    public List<Survey> getSurvey() {
   return surveyRepository.findAll();
    }

    public void addSurvey(Survey survey) {
    surveyRepository.save(survey);
    }
}
