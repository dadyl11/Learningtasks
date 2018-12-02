package Recruitment.AgesCalculator.SpockTests

import Recruitment.AgesCalculator.Dog
import spock.lang.Specification

class DogTest extends Specification {

    private Dog dog = new Dog();

    def "Should convert human years to dog years"() {
        when: "The 'convertHumanYearsToAnimalYears' is ran"
        def result = dog.convertHumanYearsToAnimalYears(humanYears)
        then: "result should be as #animalYears"
        result == animalYears
        where:
        humanYears || animalYears
        1          || 15
        2          || 24
        3          || 29
        4          || 34
        155        || 789
    }

    def "Should convert dog years to human years"() {
        when: "The 'convertAnimalYearsToHumanYears' is ran"
        def result = dog.convertAnimalYearsToHumanYears(dogYears)
        then: "result should be as #humanYears"
        result == humanYears
        where:
        dogYears || humanYears
        2        || 0.5
        8        || 0.5
        15       || 1
        18       || 1.5
        24       || 2
        27       || 2.5
        29       || 3
        31       || 3.5
        49       || 7
        55       || 8
    }

    def "Should get an illegal argument exception when put animal years number as zero or negative value"() {
        given:
        def humanYears = 0

        when:
        dog.convertAnimalYearsToHumanYears(humanYears)

        then:
        IllegalArgumentException e = thrown()
        e.message == "years number cannot be less or equal to zero"
    }

    def "Should get an illegal argument exception when put human years number as zero or negative value"() {
        given:
        def humanYears = -2

        when:
        dog.convertHumanYearsToAnimalYears(humanYears)

        then:
        IllegalArgumentException e = thrown()
        e.message == "years number cannot be less or equal to zero"
    }
}
