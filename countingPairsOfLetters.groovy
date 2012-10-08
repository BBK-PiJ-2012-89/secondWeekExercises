print "Enter a pair of letters: "
String pair = System.console().readLine()

print "now please enter a long block of text: "
String text = System.console().readLine()

int pairCounter

for(a = 0; a != text.length(); a++){
   if(text.charAt(a) == pair.charAt(0) && text.charAt(a+1) == pair.charAt(1)){
      pairCounter++
	 }
}

print "The pair of letters " + pair
print " appears " +pairCounter
print " times in the text."