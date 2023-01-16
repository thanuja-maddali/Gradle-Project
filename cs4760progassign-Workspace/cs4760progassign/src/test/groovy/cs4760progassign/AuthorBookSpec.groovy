package cs4760progassign

import grails.testing.gorm.DataTest
import spock.lang.Specification

class AuthorBookSpec extends Specification implements DataTest {
    void setupSpec(){
        mockDomains Author, Book
    }

}