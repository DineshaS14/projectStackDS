#!/bin/bash
# to activate this script type chmod +x run.sh
# then type ./run.sh to run this.
set -x

javac -d bin src/stackDS/code/Node.java

javac -cp bin -d bin src/stackDS/code/Stack.java

javac -cp bin -d bin src/stackDS/tester/StackTester.java

java -cp bin stackDS.tester.StackTester
