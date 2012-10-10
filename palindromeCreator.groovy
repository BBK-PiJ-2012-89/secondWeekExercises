print "Enter a sentence: "
String pal = System.console().readLine()
int len = pal.length()

String backwards = ""

for(int a = len-1; a >= 0; a--){
    backwards = backwards + pal.charAt(a)
}
print pal
println backwards