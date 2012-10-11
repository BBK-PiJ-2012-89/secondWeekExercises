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
    double decimal
	if(binaryNumx.charAt(0) == "1"){
		    decimal = decimal + 1
        }
    for(int a = 0; a < binaryNumx.length();a++){
    	if(binaryNumx.charAt(a) == "1"){
		    decimal = decimal + 1*2*a
		    println decimal
		}
	}
    return decimal
}

double returnDecimal = binary2decimal(binaryNum)
//double returnBinary = decimal2binary(int
print returnDecimal