import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String argv[]) throws Exception 
	{ 
		String clientSentence;
		String sentence2 = null ;
		String capitalizedSentence; 
		BufferedReader inFromUser2 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Server Started...");
			ServerSocket welcomeSocket = new ServerSocket(5200); 
			Socket connectionSocket = welcomeSocket.accept(); 
			System.out.println("Client Accepted");
			BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			DataOutputStream  outToClient = new DataOutputStream(connectionSocket.getOutputStream()); 
while(true){
			clientSentence = inFromClient.readLine(); 
		System.out.println("FROM CLIENT :" + clientSentence);
		String Senetnce2= inFromClient.readLine();
		outToClient.writeBytes(sentence2 + "\n"); 
			}
	}
}