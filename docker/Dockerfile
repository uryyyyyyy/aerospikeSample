FROM centos:7
MAINTAINER uryyyyyyy <koki305@gmail.com>
RUN yum update -y
RUN yum clean all
RUN yum install tcl gcc wget make vim net-tools -y

RUN yum install -y openssl initscripts
RUN wget -O aerospike.tgz 'http://aerospike.com/download/server/3.7.2/artifact/el6'
RUN tar -xvf aerospike.tgz
WORKDIR aerospike-server-community-3.7.2-el6
RUN ./asinstall

CMD [ "/bin/bash" ]
