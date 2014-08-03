package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Quiz)
class QuizSpec extends Specification {

    def setup() {
		mockForConstraintsTests(Quiz)
    }

    def cleanup() {
    }

    void "test quiz name is required"() {
		given: 'new Quiz instance'
		def q = new Quiz()

		when: 'save instance'
		q.save()

		println "Id: ${q.id}"

		then: 'instance id auto generated'
		q.errors['name'] == 'nullable'
			

    }
    void "test quiz name is max 10 digits"() {
		given: 'new Quiz instance'
		def q = new Quiz(name: 'this is a very long name')

		when: 'save instance'
		q.save()

		println "Id: ${q.id}"

		then: 'instance id auto generated'
		q.errors['name'] == 'maxSize'
			

    }
}
