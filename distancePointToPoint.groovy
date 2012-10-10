class Point{
    double x
	double y
}

Point point1 = new Point()
Point point2 = new Point()
Point point3 = new Point()

print "Enter the point 1 X coordinates: "
String coor = System.console().readLine()
print "Now enter the point 1 Y coordinates: "
String coor2 = System.console().readLine()

point1(Double.parseDouble(coor),Double.parseDouble(coor2))

print "Enter the point 2 X coordinates: "
String coor = System.console().readLine()
print "Now enter the point 2 Y coordinates: "
String coor2 = System.console().readLine()

point2(Double.parseDouble(coor),Double.parseDouble(coor2))

print "Enter the point 3 X coordinates: "
String coor = System.console().readLine()
print "Now enter the point 3 Y coordinates: "
String coor2 = System.console().readLine()

point1(Double.parseDouble(coor),Double.parseDouble(coor2))