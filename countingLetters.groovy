print "Type whatever you want: "
String text = System.console().readLine()

int eCounter
for(a = 0; a != text.length(); a++){
    if(text.charAt(a)== "e"){
	eCounter++
	}
}
print "There are " + eCounter
print " e's in the above text."