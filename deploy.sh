#!/bin/bash --login
PID=$(sudo netstat -tnlp | grep 8080 |  awk '{print $7}' | grep '[0-9]\+' -o)
if [ "$PID" = "" ];then
    echo "port 8080 is free"
else
    echo "port 8080 is used and kill $PID"
    sudo kill -9 $PID
fi
echo "start server"
nohup java -jar ~/ci-demo-0.0.1-SNAPSHOT.jar >log.txt &