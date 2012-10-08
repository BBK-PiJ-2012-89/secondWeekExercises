String letterHolder
int letterCounter
boolean sameLetter = false
int startCount = 0

print "Enter a block of text: "
String text = System.console().readLine()

while(!sameLetter){
    print "Which letter would you like me to count? "
        String letter = System.console().readLine()
        letterHolder = letterHolder + letter   
        for(int a = 0; a != text.length(); a++){
           if(text.charAt(a) == letter){
             letterCounter++
	    }
    }
	
	print "There are " + letterCounter
    println " in your text"
    letterCounter = 0	
	if(letterHolder.length() != 1){
	    for(int e = 0; e!= letterHolder.length()-1; e++){
	        if(letterHolder.charAt(e) == letter){
	            sameLetter = true
	        }
        }     
    } 
}
if(sameLetter){
    println " Repeat character. Exiting Program."
}