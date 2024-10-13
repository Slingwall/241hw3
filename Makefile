CLASSPATH = .
TESTCLASSPATH = $(CLASSPATH):Test/:Test/junit4.jar
JFLAGS = -g -cp $(TESTCLASSPATH)
.SUFFIXES: .java .class
.java.class:
	javac $(JFLAGS) $*.java

TESTSRC = Test/TestRunner.java Test/NobleNameSorterTest.java

SRC = \
	Title.java \
	Generation.java \
	NobleName.java \
	NobleNameSorter.java

default: classes

classes: $(SRC:.java=.class)

clean:
	rm -f *.class Test/*.class

run: classes
	java -cp $(CLASSPATH) NobleNameSorter

test-build: classes Test/TestRunner.class Test/NobleNameSorterTest.class

test-full-names: test-build
	java -cp $(TESTCLASSPATH) TestRunner NobleNameSorterTest#testFullNames

test-titles-no-generation: test-build
	java -cp $(TESTCLASSPATH) TestRunner NobleNameSorterTest#testTitlesNoGeneration

test-same-title: test-build
	java -cp $(TESTCLASSPATH) TestRunner NobleNameSorterTest#testSameTitle

test-general: test-build
	java -cp $(TESTCLASSPATH) TestRunner NobleNameSorterTest#testGeneral

test: test-build
	java -cp $(TESTCLASSPATH) TestRunner NobleNameSorterTest
