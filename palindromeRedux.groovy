print "Enter a word: "
String pal = System.console().readLine()
int len = pal.length()

String pal2 = ""
String backwards = ""

for(int a = len-1; a >= 0; a--){
    if(Character.isLetter(pal.charAt(a)) == true){
        backwards = backwards + Character.toLowerCase(pal.charAt(a))
	}
}
println backwards

for(int a = 0; a < pal.length(); a++){
    if(Character.isLetter(pal.charAt(a)) == true){
	    pal2 = pal2 + Character.toLowerCase(pal.charAt(a)) 
	}
}
println pal2

if(backwards == pal2){
    print "What you have there is a relaxed palindrome"
} else {
    print "No relaxed palindrome for you"
}