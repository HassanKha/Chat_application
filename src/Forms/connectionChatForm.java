package Forms;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class connectionChatForm implements Runnable {
	private Socket server ;
	private BufferedReader in ;
	private JPanel b ;
	private ChatForm cf;
	String h="";
	private int k1;
	public connectionChatForm(Socket Socket,ChatForm cf,int k1 ) throws IOException {
		
		server = Socket;
		in = new  BufferedReader(new InputStreamReader(server.getInputStream()));
		this.cf=cf;
		this.k1=k1;
		//out = new PrintWriter(server.getOutputStream() ,true);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	//	b.MakeForm();
		String k=null;
		System.out.println("connectionchatform");
		try {
		while(true) {
			k=in.readLine();
			//b.Update(k);
		//	if(k.equals("out")) {
		//		cf.dispose();
			//	break;
				
		//	}
		
		cf.addlabel(k);

		
			//Seth(k);
			System.out.println("server (connectionchatform) says : "+ k);
		}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	void Seth(String h) {
		this.h=h;
	}
	String h() {
		return this.h;
	}
}
