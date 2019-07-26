# Notify Client Reference App for Java

This an example application that uses the Gov.UK Notify Java client.

## Setup

1. Start Docker
1. Clone this repo and move into it
1. Add an API key and recipient email address
    1. Go to `/notify/notify-client-reference-java/src/main/cds/App.java`
    1. Change `[ADD API KEY HERE]` to a valid API key for the Notify service
    1. Change `[ADD EMAIL RECIPIENT ADDRESS HERE]` to someone's email address
1. Build the Docker image: `docker build -t notifyjava .`

## Run the App

(Assumes Setup instructions have been run)

1. Run bash within the Docker image: `docker run -it --rm -v <path where this repo was cloned>:/notify notifyjava`
1. Build the application: `mvn package -s settings.xml`
1. Run the application: `mvn exec:java -s settings`
