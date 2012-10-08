print "Type whatever you want: "
String text = System.console().readLine()

print "Thank you, now please enter a letter for me to count: "
String letter = System.console().readLine()

int eCounter
for(a = 0; a != text.length(); a++){
    if(text.charAt(a)== letter){
	eCounter++
	}
}

print "There are " + eCounter 
print " " + letter
print "'s in the above text"