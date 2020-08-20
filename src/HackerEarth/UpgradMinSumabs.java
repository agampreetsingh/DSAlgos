package HackerEarth;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.net.*;
import com.google.gson.*;


public class UpgradMinSumabs {
	class ResponseClass {
        Parse parse;
    }
    class Parse{
        String title;
        Long pageId;
        String text;
    }
    
    static int getTopicCount(String topic) throws Exception {
        StringBuilder response = new StringBuilder();
        String urlString="https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=json&page="+topic;
        URL url= new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        while((line=reader.readLine())!=null){
            response.append(line);
        }
        reader.close();
        Gson gson = new Gson();
        ResponseClass jsonResponse = gson.fromJson(response.toString(), ResponseClass.class);
        return countOccurance(jsonResponse.parse.text, topic);
    }

    public static int countOccurance(String text, String topic){
        
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {
            lastIndex = text.indexOf(topic, lastIndex);

            if (lastIndex != -1)
             {

                count++;
                lastIndex += topic.length();
             }
        }
    return count;
    }
	
	
	
	public static void main(String args[]) {
		
	}
	
	public static long solve(int[] arr,int index) {
		if(index==arr.length-1) {
			return Math.abs(arr[index]-arr[index-1]);
		}
		long rsum=solve(arr,index+1);
		return Math.min(Math.abs(arr[index]-arr[index-1])+rsum, Math.abs(arr[index-1]-arr[index+1])+rsum);
	}

}
/*2
5
1 5 3 2 10
6
6 12 7 8 10 5
*/