print "Please enter total amount borrowed: "
String str = System.console().readLine()
double amountBorrowed = Double.parseDouble(str)

print "Please enter total years left on your mortgage: "
str = System.console().readLine()
double yearsLeft = Double.parseDouble(str)

print "Please enter interest rate: "
str = System.console().readLine()
double interestRate = Double.parseDouble(str)

double totalMoney(double amountBorrowedX, double interestRateX){
    double x = (interestRateX/100)+1
    int y = amountBorrowedX*x 
    return y
}
double a = totalMoney(amountBorrowed, interestRate)

double yearlyCost(double totalMoneyX, double yearsLeftX){
    int x = totalMoneyX/yearsLeftX
    return x
}
double b = yearlyCost(a , yearsLeft)

double interestPayOff(double amountBorrowedX, double yearlyCostX, double aX){
    int x = aX - amountBorrowedX
	int y = x/yearlyCostX
    return y
} 
double c = interestPayOff(amountBorrowed, b, a)

println "Your amount to be paid is: " + a
println "Your yearly cost is " + b
println "The number of years before your interest is paid off is: " + c