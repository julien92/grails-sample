package myapp

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PersonSpec extends Specification implements DomainUnitTest<Person> {

     void "test domain constraints"() {
        when:
        Person domain = new Person()
        //TODO: Set domain props here

        domain.name = "Fred"
        domain.age = 30
        domain.lastVisit = new Date()
        domain.save()

        def p = Person.get(1)
         p.name = "Bob"
         p.save()

         def bob = Person.get(1)

        then:
        domain.validate()
     }
}
