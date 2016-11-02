package com.gap.poet.db.services

class FizzBuzz {

    static String convert (int number) {
        if (number % 3 == 0 && number % 5 == 0)
            return 'fizzbuzz'
        if (number % 5 == 0)
            return 'buzz'
        if (number % 3 == 0 )
            return 'fizz'
        number.toString ()
    }

}

