print "Please enter cost of item: "
String str = System.console().readLine()
double cost = Double.parseDouble(str)

print "Now enter money paid: "
str = System.console().readLine()
double paid = Double.parseDouble(str)

double change = paid - cost

println "Thank you, your change is: " + change

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
	if(divis != 0){
	 print "You have " +divis 
	 println " fifty pound notes"
	}
}
if(change/20 !=0){
	int divis = (change/20)
	change = change - (divis*20)
	if(divis != 0){
	print "You have " +divis 
	println " twenty pound notes"
	}
}
if(change/10 !=0){
	int divis = (change/10)
	change = change - (divis*10)
	if(divis != 0){
	print "You have " +divis 
	println " ten pound notes"
	}
}
if(change/5 !=0){
	int divis = (change/5)
	change = change - (divis*5)
	if(divis != 0){
	print "You have " +divis 
	println " five pound notes"
	}
}
if(change/2 !=0){
	int divis = (change/2)
	change = change - (divis*2)
	if(divis != 0){
	print "You have " +divis 
	println " two pound coins"
	}
}
if(change/1 !=0){
	int divis = (change/1)
	change = change - (divis*1)
	if(divis != 0){
	print "You have " +divis 
	println " one pound coins"
	}
}
if(change/0.50 !=0){
	int divis = (change/0.50)
	change = change - (divis*0.50)
	if(divis != 0){
	print "You have " +divis 
	println " fifty pence coins"
	}
}
if(change/0.2 !=0){
	int divis = (change/0.2)
	change = change - (divis*0.2)
	if(divis != 0){
	print "You have " +divis 
	println " twenty pence coins"
	}
}
if(change/0.1 !=0){
	int divis = (change/0.1)
	change = change - (divis*0.1)
	if(divis != 0){
	print "You have " +divis 
	println " ten pence coins"
	}
}
if(change/0.05 !=0){
	int divis = (change/0.05)
	change = change - (divis*0.05)
	if(divis != 0){
	print "You have " +divis 
	println " five pence coins"
	}
}
if(change/0.02 !=0){
	int divis = (change/0.02)
	change = change - (divis*0.02)
	if(divis != 0){
	print "You have " +divis 
	println " tuppence coins"
	}
}
if(change/0.01 !=0){
	int divis = (change/0.01)
	change = change - (divis*0.01)
	if(divis != 0){
	print "You have " +divis 
	println " pennies"
	}
}