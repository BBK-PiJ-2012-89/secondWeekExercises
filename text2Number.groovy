print "Enter a number:  "
String num = System.console().readLine()
String intNum = ""

for(int a = 0; a < num.length(); a++){
    if(num.charAt(a) == ","){
	    a++
    }else if(num.charAt(a) == "."){
	    a++
	}else{ 
	intNum = intNum + num.charAt(a)
	}
}

int finalNum = Integer.parseInt(intNum)/2

print finalNum