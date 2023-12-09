package validator;

import edu.javacourse.studentorder.domain.CityRegisterCheckerResponse;
import edu.javacourse.studentorder.domain.Person;
import exception.CityRegisterException;

public interface CityRegisterChecker {
    CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException;
}
