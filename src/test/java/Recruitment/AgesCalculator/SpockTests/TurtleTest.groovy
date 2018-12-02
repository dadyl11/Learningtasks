package Recruitment.AgesCalculator.SpockTests

import Recruitment.AgesCalculator.Turtle
import spock.lang.Specification

class TurtleTest extends Specification {

    private Turtle turtle = new Turtle();

    def "Should convert human years to turtle years"() {
        when: "The 'convertHumanYearsToAnimalYears' is ran"
        def result = turtle.convertHumanYearsToAnimalYears(humanYears)
        then: "result should be as #turtleYears"
        result == turtleYears
        where:
        humanYears || turtleYears
        1          || 15
        2          || 17
        3          || 18
        4          || 19
        155        || 170
    }

    def "Should convert turtle years to human years"() {
        when: "The 'convertAnimalYearsToHumanYears' is ran"
        def result = turtle.convertAnimalYearsToHumanYears(turtleYears)
        then: "result should be as #humanYears"
        result == humanYears
        where:
        turtleYears || humanYears
        1           || 0.5
        8           || 0.5
        15          || 1
        16          || 1.5
        17          || 2
        18          || 3
        20          || 5
        55          || 40
    }

    def "Should get an illegal argument exception when put animal years number as zero or negative value"() {
        given:
        def humanYears = 0

        when:
        turtle.convertAnimalYearsToHumanYears(humanYears)

        then:
        // thrown(IllegalArgumentException)
        IllegalArgumentException e = thrown()
        e.message == "years number cannot be less or equal to zero"
    }

    def "Should get an illegal argument exception when put human years number as zero or negative value"() {
        given:
        def humanYears = -2

        when:
        turtle.convertHumanYearsToAnimalYears(humanYears)

        then:
        // thrown(IllegalArgumentException)
        IllegalArgumentException e = thrown()
        e.message == "years number cannot be less or equal to zero"
    }
}
