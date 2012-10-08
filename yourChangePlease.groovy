print "Please enter cost of item: "
String str = System.console().readLine()
double cost = Double.parseDouble(str)

print "Now enter money paid: "
str = System.console().readLine()
double paid = Double.parseDouble(str)

print "Thank you, your change is: "
double change = paid - cost
int note50
int note20
int note10
int note5
int coin2
int coin1
int coinPoint50
int coinPoint20
int coinPoint10
int coinPoint05
int coinPoint02
int coinPoint01

if(change/50 !=0){
	int divis = (change/50)
	change = change - (divis*50)
	print "You have " +divis " 50 pound notes"
}