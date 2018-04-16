package at.refugeescode.mp13themagic8ball.logic;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class Magic8Ball {

    public List<String> makeMessages() {
        return Stream.of("It is certain",
                "It is decidedly so",
                "Without a doubt",
                "Yes definitely",
                "You may rely on it",
                "As I see it, yes",
                "Most likely",
                "Outlook good",
                "Yes",
                "Signs point to yes",
                "Reply hazy try again",
                "Ask again later",
                "Better not tell you now",
                "Cannot predict now",
                "Concentrate and ask again",
                "Don't count on it",
                "My reply is no",
                "My sources say no",
                "Outlook not so good",
                "Very doubtful")
                .collect(Collectors.toList());
    }

    public String getRandomMessage() {
        List<String> message = makeMessages();
        Collections.shuffle(message);
        String firstMessage = message.get(0);
        return firstMessage;
    }

}
