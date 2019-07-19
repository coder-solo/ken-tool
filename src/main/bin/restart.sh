#!/bin/sh
export JAVA_HOME=/data/jdk
export CLASSPATH=$CLASSPATH:$JAVA_HOME/lib:$JAVA_HOME/jre/lib
export PATH=$JAVA_HOME/bin:$JAVA_HOME/jre/bin:$PATH:/usr/bin

kill -9 `ps ax |grep -v grep |grep 'ken-tool.jar' |awk '{print $1}'`
cd /data/apps/ken-tool
nohup java -Xms1024M -Xmx1024M -jar ken-tool.jar >/dev/null 2>&1 &
