package fssp03;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main{
    private static final int MYTHREADS = 33;

    public static void main(String[] args) throws MalformedURLException  {
        ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);
        ArrayList<Server> servers = new ArrayList<Server>();
        Server s1=new Server("03001  ","http://10.3.0.1:8080/pksp-server/tsa");
        Server s2=new Server("03002  ","http://10.3.0.2:8080/pksp-server/tsa");
        Server s3=new Server("03003  ","http://10.3.0.3:8080/pksp-server/tsa");
        Server s4=new Server("03004  ","http://10.3.0.4:8080/pksp-server/tsa");
        Server s5=new Server("03005  ","http://10.3.0.5:8080/pksp-server/tsa");
        Server s6=new Server("03006  ","http://10.3.0.6:8080/pksp-server/tsa");
        Server s7=new Server("03007  ","http://10.3.0.7:8080/pksp-server/tsa");
        Server s8=new Server("03008  ","http://10.3.0.8:8080/pksp-server/tsa");
        Server s9=new Server("03009  ","http://10.3.0.9:8080/pksp-server/tsa");
        Server s10=new Server("03010 ","http://10.3.0.10:8080/pksp-server/tsa");
        Server s11=new Server("03011 ","http://10.3.0.11:8080/pksp-server/tsa");
        Server s12=new Server("03012 ","http://10.3.0.12:8080/pksp-server/tsa");
        Server s13=new Server("03013 ","http://10.3.0.13:8080/pksp-server/tsa");
        Server s14=new Server("03014 ","http://10.3.0.14:8080/pksp-server/tsa");
        Server s15=new Server("03015 ","http://10.3.0.15:8080/pksp-server/tsa");
        Server s16=new Server("03016 ","http://10.3.0.16:8080/pksp-server/tsa");
        Server s17=new Server("03017 ","http://10.3.0.17:8080/pksp-server/tsa");
        Server s18=new Server("03018 ","http://10.3.0.18:8080/pksp-server/tsa");
        Server s19=new Server("03019 ","http://10.3.0.19:8080/pksp-server/tsa");
        Server s20=new Server("03020 ","http://10.3.0.20:8080/pksp-server/tsa");
        Server s21=new Server("03021 ","http://10.3.0.21:8080/pksp-server/tsa");
        Server s22=new Server("03022 ","http://10.3.0.22:8080/pksp-server/tsa");
        Server s23=new Server("03023 ","http://10.3.0.23:8080/pksp-server/tsa");
        Server s24=new Server("03024 ","http://10.3.0.24:8080/pksp-server/tsa");
        Server s25=new Server("03025 ","http://10.3.0.25:8080/pksp-server/tsa");
        Server s26=new Server("03026  ","http://10.3.0.26:8080/pksp-server/tsa");
        Server s27=new Server("03027","http://10.3.0.27:8080/pksp-server/tsa");
        Server s28=new Server("03028","http://10.3.0.28:8080/pksp-server/tsa");
        Server s29=new Server("03029","http://10.3.0.29:8080/pksp-server/tsa");
        Server s30=new Server("03030  ","http://10.3.0.30:8080/pksp-server/tsa");
        Server s31=new Server("03031  ","http://10.3.0.31:8080/pksp-server/tsa");
        Server s32=new Server("RBD  ","http://10.3.0.32:8080/pksp-server/tsa");

        servers.add(s32);
        servers.add(0,s1);
        servers.add(1,s2);
        servers.add(2,s3);
        servers.add(3,s4);
        servers.add(4,s5);
        servers.add(5,s6);
        servers.add(6,s7);
        servers.add(7,s8);
        servers.add(8,s9);
        servers.add(9,s10);
        servers.add(10,s11);
        servers.add(11,s12);
        servers.add(12,s13);
        servers.add(13,s14);
        servers.add(14,s15);
        servers.add(15,s16);
        servers.add(16,s17);
        servers.add(17,s18);
        servers.add(18,s19);
        servers.add(19,s20);
        servers.add(20,s21);
        servers.add(21,s22);
        servers.add(22,s23);
        servers.add(23,s24);
        servers.add(24,s25);
        servers.add(25,s26);
        servers.add(26,s27);
        servers.add(27,s28);
        servers.add(28,s29);
        servers.add(29,s30);
        servers.add(30,s31);

        // Collections.sort(servers);


        System.out.println("=================================");
        System.out.println("Сервис меток времени");
        System.out.println("=================================");
        for(int i=0;i<servers.size();i++)
        {

            URL url=new URL(servers.get(i).ipAddress);
            String name=servers.get(i).serverName;

            Runnable worker=new MyRunnable(url.toString(),name);
            executor.execute(worker);

        }
        executor.shutdown();
        while (!executor.isTerminated()) {

        }
        System.out.println("Завершено");

    }

}
