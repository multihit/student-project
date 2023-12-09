package validator;

import edu.javacourse.studentorder.domain.CityRegisterCheckerResponse;
import edu.javacourse.studentorder.domain.Person;
import exception.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterChecker {
        public CityRegisterCheckerResponse checkPerson(Person person)
        throws CityRegisterException {
            return  null;
        }
}
