#!/bin/sh
pid=`ps ax |grep -v grep |grep 'ken-tool.jar' |awk '{print $1}'`
if [[ $pid -gt 0 ]]; then
 kill -9 $pid
fi
