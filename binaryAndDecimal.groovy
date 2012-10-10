boolean b2d = false
boolean d2b = false

print "Would you like to convert a binary number to decimal?(b2d) or a decimal number to binary(d2b): "
String str = System.console().readLine()
while(b2d==false && d2b==false){
    if(str == "b2d"){
        b2d = true
    } else if(str == "d2b"){
        d2b = true
    } else {
        println "You have entered an invalid statement, Please try again"
		str = null
        str = System.console().readLine()
    }
}

String binaryNum

if(b2d == true){
    print "Please enter a binary number: "
binaryNum = System.console().readLine()
}

double binary2decimal(String binaryNumx){
    double decimal = 0
    for(a = binaryNumx.length()-1; a>= 0; a--){
	    if(binaryNumx.charAt(a) == 1){
	    decimal = decimal + (2*a*a)
		a--
	    } else if(binaryNumx.charAt(a) == 0){
    	a--
	    }
	}
    return decimal
}
double returnDecimal = binary2decimal(binaryNum)
//double returnBinary = decimal2binary(int
print returnDecimal