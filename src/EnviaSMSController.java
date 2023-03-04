import com.telesign.MessagingClient;
import com.telesign.RestClient;

public class EnviaSMSController {

    public void EnviaSMS(String celular){

        String customerId = "2BFD01EE-960C-4684-8FB1-A857D272720B";
        String apiKey = "6xi83fIKEjmIXNa3ckaXlzWCw5+PRAMQbZzgHPK6qVaySoXwAHxWGBaw5e9a1yGRcH/3M2nCWnUNMx3D+GV2mA==";
        String phoneNumber = celular;
        String message = "Seu cadastro foi feito com sucesso";
        String messageType = "ARN";

        try {
            MessagingClient messagingClient = new MessagingClient(customerId, apiKey);
            RestClient.TelesignResponse telesignResponse = messagingClient.message(phoneNumber, message, messageType, null);
            System.out.println("Your reference id is: "+telesignResponse.json.get("reference_id"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}