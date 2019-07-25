#!/bin/sh
export  JAVA_HOME=/data/jdk
export  CLASSPATH=$CLASSPATH:$JAVA_HOME/lib:$JAVA_HOME/jre/lib
export  PATH=$JAVA_HOME/bin:$JAVA_HOME/jre/bin:$PATH:/usr/bin

cd /data/apps/ken-tool
nohup java -jar ken-tool.jar >/dev/null 2>&1 &
