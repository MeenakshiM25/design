cd src
start rmiregistry -J-Djava.rmi.useLocalHostName=true -J-Djava.rmi.server.hostname=127.0.0.1 
java com.mkyong.rmiserver.ServerOperation