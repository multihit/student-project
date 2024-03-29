package validator;

import edu.javacourse.studentorder.domain.AnswerCityRegister;
import edu.javacourse.studentorder.domain.CityRegisterCheckerResponse;
import edu.javacourse.studentorder.domain.StudentOrder;
import exception.CityRegisterException;

public class CityRegisterValidator {
    public String hostName;
    protected int port;
    private String login;
    String password;
    private FakeCityRegisterChecker personChecker;
    public CityRegisterValidator(){
        personChecker = new FakeCityRegisterChecker();
    }

     public AnswerCityRegister checkCityRegister(StudentOrder so) {
        try {
            CityRegisterCheckerResponse hans = personChecker.checkPerson(so.getHusbant());
            CityRegisterCheckerResponse wans =  personChecker.checkPerson(so.getWife());
            CityRegisterCheckerResponse cans =  personChecker.checkPerson(so.getChild());
        } catch (CityRegisterException ex){
            ex.printStackTrace();
        }

        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}
