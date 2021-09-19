import java.util.*;
import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.SpotifyHttpManager;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.credentials.AuthorizationCodeCredentials;
import com.wrapper.spotify.requests.authorization.authorization_code.AuthorizationCodeRequest;
import org.apache.hc.core5.http.ParseException;

public class Index {
    public static void main(String[] arg) {
        SpotifyApi spotifyApi = new SpotifyApi.Builder()
                .setAccessToken("[your account token goes here]")
                .build();

        System.out.println("Hello world!");
    }
}
