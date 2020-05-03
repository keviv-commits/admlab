import java.io.*; import java.net.*;
 
class UDPClient
{
public static DatagramSocketclientsocket; public static DatagramPacketdp;
public static BufferedReader dis; public static InetAddressia;
public static byte buf[] = new byte[1024]; public static intcport = 789, sport = 790; public static void main(String[] a) throws IOException
{
clientsocket = new DatagramSocket(cport); dp = new DatagramPacket(buf, buf.length);
 
dis = new BufferedReader(new InputStreamReader(System.in)); ia = InetAddress.getLocalHost();
 
System.out.println("Client is Running... Type 'STOP'to Quit");
 
while(true)
