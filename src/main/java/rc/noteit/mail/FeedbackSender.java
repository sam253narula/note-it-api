package rc.noteit.mail;

import org.springframework.stereotype.Component;

@Component
public interface FeedbackSender {
    void sendFeedback(String from, String name, String feedback);
}
