package com.gap.poet.db.services

import spock.lang.Specification

import static com.gap.poet.db.services.FizzBuzz.convert

class FizzBuzzTest extends Specification {

    def 'when input is 1, output is 1'() {
        expect:
        convert(1) == '1'
    }

    def 'when input is 2, output is 2' () {
        expect:
        convert(2) == '2'
    }

    def 'when input is 3, output is fizz' () {
        expect:
        convert(3) == 'fizz'
    }

    def 'when input is 5, output is buzz' () {
        expect:
        convert(5) == 'buzz'
    }

    def 'when input is divisible by 3, output is fizz'() {
        expect:
        convert(6) == 'fizz'
    }

    def 'when input is 10, output is buzz' () {
        expect:
        convert(10) == 'buzz'
    }

    def 'when input is 15, output is fizzbuzz' () {
        expect:
        convert(15) == 'fizzbuzz'
    }
}
