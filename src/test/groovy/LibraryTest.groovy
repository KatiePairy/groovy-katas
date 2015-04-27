/*
 * This Spock specification was auto generated by running 'gradle init --type groovy-library'
 * by 'jess' at '4/27/15 3:42 PM' with Gradle 2.3
 *
 * @author jess, @date 4/27/15 3:42 PM
 */

import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }
}