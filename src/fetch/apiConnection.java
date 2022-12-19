package fetch;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class apiConnection {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://api.covid19api.com/summary");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		int responseConnection = connection.getResponseCode();
		System.out.println(responseConnection);

	}
}
