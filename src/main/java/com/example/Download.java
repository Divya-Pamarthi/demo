package com.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Download {
    public static void main(String[] args) throws IOException {

        URL fetchWebsite = new URL("https://theswissbay.ch/pdf/Gentoomen%20Library/Programming/Java/Introduction%20to%20Java%20IO.pdf");
        ReadableByteChannel readableByteChannel = Channels.newChannel(fetchWebsite.openStream());

        try (FileOutputStream fos = new FileOutputStream("C:\\CreditPortal\\IntroToJava.pdf")) {
            fos.getChannel().transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
        }
    }
}
