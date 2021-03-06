
import java.io.IOException;
import java.net.*;

/**
 *
 * @author Anuj Garg
 */
public class receiving {

// Which port should we listen to
    static int port = 5000;
// Which address
    static String group = "225.4.5.6";

    public static void main(String[] args) throws IOException {
        // Create the socket and bind it to port 'port'.
        MulticastSocket s = new MulticastSocket(port);
// join the multicast group
        s.joinGroup(InetAddress.getByName(group));
// Now the socket is set up and we are ready to receive packets
// Create a DatagramPacket and do a receive
        byte buf[] = new byte[1024];
        DatagramPacket pack = new DatagramPacket(buf, buf.length);
	boolean gg=true;
while(gg)
{
        s.receive(pack);
// Finally, let us do something useful with the data we just received,
// like print it on stdout :-)
        System.out.println("Received data from: " + pack.getAddress().toString()
                + ":" + pack.getPort() + " with length: "
                + pack.getLength());
        System.out.write(pack.getData(), 0, pack.getLength());
        System.out.println();
}
// And when we have finished receiving data leave the multicast group and
// close the socket
        s.leaveGroup(InetAddress.getByName(group));
        s.close();
    }

}
