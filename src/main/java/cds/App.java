package cds;

import java.util.HashMap;
import java.util.Map;
import uk.gov.service.notify.NotificationClient;
import uk.gov.service.notify.SendEmailResponse;


public class App {

    public static void main(String[] args) {

        try{
            NotificationClient client = new NotificationClient("livekey-e609f6b0-0390-45b0-aaae-f4cc92c713e4-e35e2a45-17a8-4d9c-a78f-cd0e125b345e", "https://api.notification.cdssandbox.xyz");

            Map<String, Object> personalization = new HashMap<>();
            personalization.put("first_name", "Jeff");
            personalization.put("click_here", "https://digital.canada.ca");

            SendEmailResponse response = client.sendEmail(
                "[ADD API KEY HERE]",
                "[ADD EMAIL RECIPIENT ADDRESS HERE]",
                personalization,
                "dafjkljklad"
            );

            System.out.println("[LOG] SENT EMAIL WITH SUBJ: " + response.getSubject());

        }
        catch(Exception e) {
            System.err.println("[LOG] ERROR: " + e.toString());
        }

    }
}


