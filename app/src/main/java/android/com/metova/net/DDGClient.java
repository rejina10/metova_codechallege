package android.com.metova.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by rejina on 11/2/2015.
 */
public class DDGClient {

    public static final String DDG_POST_URL = "http://api.duckduckgo.com/";
    public static final String DDG_QUERY_PARAM = "?q=";
    public static final String DDG_JSON_PARAM = "&format=json";
    public static final String CHAR_ENCODING = "US-ASCII";

    public static Reader getData(String searchString) {

        if(searchString == null || searchString.isEmpty()) {
            //log.trace("Arguments were null or empty");
            return null;
        }

        String encodedSearchString = urlEncodeString(searchString);

        if(encodedSearchString == null || encodedSearchString.isEmpty()) {
            //log.trace("EncodedSearchString was null or empty");
            return null;
        }

        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(DDG_POST_URL);
        urlBuilder.append(DDG_QUERY_PARAM);
        urlBuilder.append(encodedSearchString);
        urlBuilder.append(DDG_JSON_PARAM);

        String uri = urlBuilder.toString();

        BufferedReader reader = null;


        try {
            URL url = new URL(uri);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            StringBuilder sb = new StringBuilder();
            reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

            /*String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);

            }*/

            return reader;

        } catch (Exception ex) {
            ex.getMessage();
            ex.printStackTrace();
            return null;
        } finally {
            /*if (reader != null) {
                try {
                    //reader.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    return null;

                }

            }*/
        }

    }

    private static String urlEncodeString(String toEncode) {

        if(toEncode == null || toEncode.isEmpty()) {
            // log.trace("Arguments were null or empty");
            return null;
        }

        String retValue = null;

        try {
            retValue = URLEncoder.encode(toEncode, CHAR_ENCODING);
        } catch (UnsupportedEncodingException e) {
            //log.error("Unable to UrlEncode string " + toEncode, e);

            System.out.println("Unable to UrlEncode string" + e.getMessage());
        }

        return retValue;
    }

}
