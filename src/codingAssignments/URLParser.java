package codingAssignments;

import java.util.ArrayList;
import java.util.List;

public class URLParser {
    public static void main(String[] args) {
        System.out.println("Yes!No".substring("Yes!No".indexOf('!')));
        List<String> tokens = new ArrayList<>();
        tokens.add("xyz");
        tokens.add("123");
        List<String> request = new ArrayList<>();
        request.add("GET");
        request.add("https://aalafj.com/?token=xyz&name=rolex&id=a1");
        List<List<String>> input = new ArrayList<>();
        input.add(request);
        List<String> request1 = new ArrayList<>();
        request1.add("POST");
        request1.add("https://alfjalf.com/?token=23424&name=rolex&id=a1");
        input.add(request1);
        System.out.println(getResponses(tokens, input));
    }

    public static List<String> getResponses(List<String> valid_auth_tokens, List<List<String>> requests){
        List<String> result = new ArrayList<>();
        for (List<String> request : requests) {
            boolean isValid = false;
            String url = request.get(1), resultString = "INVALID";
            String params =  url.substring(url.indexOf('?')+1);
            String[] paramsList = params.split("&");
            String token = paramsList[0].substring(paramsList[0].indexOf('=')+1);
            for (String inputToken: valid_auth_tokens) {
                if(token.equals(inputToken)){
                    isValid = true;
                    break;
                }
            }

            if(isValid){
                resultString = "VALID";
                for (int i = 1; i < paramsList.length ; i++) {
                    String key = paramsList[i].substring(0,paramsList[i].indexOf('='));
                    String value = paramsList[i].substring(paramsList[i].indexOf('=')+1);
                    resultString+=(","+key+","+value);
                }
            }
            result.add(resultString);
        }
        return result;
    }
}
