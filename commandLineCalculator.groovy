print "Enter an equation for me to solve: "
String equation = System.console().readLine()

for(int a = 0; a <= equation.length; a++){
    if(equation.charAt(a)!=1 && equation.charAt(a)!=2 && equation.charAt(a)!=3 && equation.charAt(a)!=4 && equation.charAt(a)!=5 && equation.charAt(a)!=6 && equation.charAt(a)!=7 && equation.charAt(a)!=8 && equation.charAt(a)!=9 && equation.charAt(a)!=0){
	    int numHolder = a
	    int firstNum = Integer.parseInt(equation.substring(0,numHolder))
	}
	int secondNum = Integer.parseInt(equation.substring(numHolder+2,equation.length()-1)
}
	if(equation.charAt(numHolder+1)== "*"){
	    print firstNum*secondNum
    } else if(equation.charAt(numHolder+1)== "/"){
	    print firstNum/secondNum
    } else if(equation.charAt(numHolder+1)== "+"){
	    print firstNum+secondNum
	} else if(equation.charAt(numHolder+1)== "-") {
	    print firstNum-secondNum
	} else {
	    print "Invalid equation entered"
	}
}