print "Enter a word: "
String pal = System.console().readLine()
int len = pal.length()

String backwards = ""

for(int a = len-1; a >= 0; a--){
    backwards = backwards + pal.charAt(a)
}
println backwards

if(backwards == pal){
    print "What you have there is a palindrome"
} else {
    print "No palindrome for you"
}