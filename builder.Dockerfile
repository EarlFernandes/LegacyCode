# starting with a maven + Java 18 image, add headless chrome
FROM maven:3.8.7-openjdk-18-slim
    MAINTAINER Joel Gallant <joelmgallant@gmail.com>

# https://github.com/puppeteer/puppeteer/blob/main/docs/troubleshooting.md#running-puppeteer-in-docker
# stolen from `swarmio-hive` builder.Dockerfile
RUN apt-get update \
    && apt-get install -y wget gnupg \
    && wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - \
    && sh -c 'echo "deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google.list' \
    && apt-get update \
    && apt-get install -y google-chrome-stable libxss1 \
      --no-install-recommends \
    && rm -rf /var/lib/apt/lists/*

# environment setup
ENV TEST_HOME=/jmeter-test

#  set up working folder for the tests
COPY . $TEST_HOME
WORKDIR $TEST_HOME

# install dependencies
RUN mvn clean install
