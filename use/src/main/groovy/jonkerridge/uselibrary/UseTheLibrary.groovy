package jonkerridge.uselibrary

import jonkerridge.library.StringMethods

def sl = new StringMethods()
String s1, s2, palin
s1 = "Greetings"
s2 = "Lunch and Learn"
palin = "mur der fo raj a rof redrum"

String greeting = sl.addWithSpace(s1, s2)
println "\n$greeting to you all\n\n"

String nilap = sl.reverseString(palin)
println "The right way round is: \n$nilap"


