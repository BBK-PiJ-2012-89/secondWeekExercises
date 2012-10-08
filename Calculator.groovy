print "Please enter the first number to be calculated: "
String str = System.console().readLine()
double firstNum = Double.parseDouble(str)

print "Please enter the next number to be calculated: "
String str2 = System.console().readLine()
double secondNum = Double.parseDouble(str2) 

print "Thank you, now please enter the type of calculation you would like to perform(Mult, Div, Add, Subt): "
String str3 = System.console().readLine()

double thirdNum

if(str3 == "Mult"){
 thirdNum (firstNum * secondNum)
 print "Thank you, the answer is: " + thirdNum
} else if(str3 == "Div"){
 thirdNum = firstNum/secondNum
 print "Thank you, the answer is: " + thirdNum
} else if(str3 == "Add"){
 thirdNum = firstNum+secondNum
 print "Thank you, the answer is: " + thirdNum
} else if(str == "Subt"){
 thirdNum = firstNum-secondNum
 print "Thank you, the answer is: " + thirdNum
}
