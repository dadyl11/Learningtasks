package recruitment.agesCalculator.SpockTests

import recruitment.agesCalculator.Cat
import spock.lang.Specification

class CatTest extends Specification {

    private Cat catsAge = new Cat();

    def "Should convert human years to animal years"() {
        when: "The 'convertHumanYearsToAnimalYears' is ran"
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

    def "Should convert animal years to human years"() {
        when: "The 'convertAnimalYearsToHumanYears' is ran"
        def result = catsAge.convertAnimalYearsToHumanYears(animalYears)
        then: "result should be as #humanYears"
        result == humanYears
        where:
        animalYears || humanYears
        1           || 0.5
        8           || 0.5
        15          || 1
        17          || 1.5
        23          || 2
        25          || 2.5
        27          || 3
        49          || 8.5
        55          || 10
    }

    def "Should get an illegal argument exception when put animal years number as zero or negative value"() {
        given:
        def humanYears = 0

        when:
        catsAge.convertAnimalYearsToHumanYears(humanYears)

        then:
        IllegalArgumentException e = thrown()
        e.message == "years number cannot be less or equal to zero"
    }

    def "Should get an illegal argument exception when put human years number as zero or negative value"() {
        given:
        def humanYears = -2

        when:
        catsAge.convertHumanYearsToAnimalYears(humanYears)

        then:
        IllegalArgumentException e = thrown()
        e.message == "years number cannot be less or equal to zero"
    }
}
