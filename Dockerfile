FROM openjdk

# Install Maven
RUN yum install wget -y && \
    wget http://apache.mirror.iweb.ca/maven/maven-3/3.6.1/binaries/apache-maven-3.6.1-bin.tar.gz && \
    tar -xvf apache-maven-3.6.1-bin.tar.gz && \
    ln -s /apache-maven-3.6.1/bin/mvn /usr/local/bin/mvn

WORKDIR /notify

CMD ["bash"]