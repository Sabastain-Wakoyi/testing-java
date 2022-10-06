import java.net.http.HttpRequest;

public class RESTAPI {
    public static void main(String[] args) throws Exception{

        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://api.assemblyai.com/v2/transcript"))
                .header("Authorization", Constant.API_Key)

    }
}
