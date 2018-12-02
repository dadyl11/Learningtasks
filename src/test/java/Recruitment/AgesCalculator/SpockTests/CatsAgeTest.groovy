package Recruitment.AgesCalculator.SpockTests

import Recruitment.AgesCalculator.CatsAge
import spock.lang.Specification


class CatsAgeTest extends Specification {

    //  @Shared def interpolateService = new InterpolateService()

    private CatsAge catsAge = new CatsAge();


    def "ConvertHumanYearsToAnimalYears"() {
        when: "The convertHumanYearsToAnimalYears is ran"
        def result = catsAge.convertHumanYearsToAnimalYears(humanYears)
        then: "result should be as #animalYears"
        result == animalYears
        where:
        humanYears || animalYears
        1          || 15
        2          || 23
        3          || 27
        4          || 31
        155        || 635
    }

    def "ConvertAnimalYearsToHumanYears"() {
    }
}
