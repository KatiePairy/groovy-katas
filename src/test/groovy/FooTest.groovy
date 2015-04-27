import spock.lang.Specification

class FooTest extends Specification{
    def "getGreeting returns 'Hello World!'"() {
        setup:
        Foo myFoo = new Foo()
        when:
        def fooGreeting = myFoo.getGreeting()
        then:
        fooGreeting == "Hello World!"
    }
}
