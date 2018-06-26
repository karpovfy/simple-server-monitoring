package fssp03;


import java.net.HttpURLConnection;
import java.net.URL;

public  class MyRunnable implements  Runnable{
    private final String url;
    private final String name;
    //private final int port=8080;
    MyRunnable(String url,String name)
    {
        this.url=url;
        this.name=name;
    }

    @Override
    public void run() {


        String result = "";
        int code = 200;
        try
        {
            URL siteURL = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) siteURL.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(2000);

            connection.connect();
            code = connection.getResponseCode();
            if (code == 200)
            {

                result = "Работает";

            }
            else
            if(code==404)
            {

                result = "Выключен";

            }


        }
        catch(Exception e )
        {

            result = "Не работает";
        }



        System.out.println(name+"\t" + "cтатус\t"+code+"\t" + result);

    }

}
