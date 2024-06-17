 import java.io.*;
public class ImgCodeSir{
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("MyImg.jpeg");
			FileOutputStream fos = new FileOutputStream("Temp.jpeg");
			
			int counter = 0;

			String secretMsg = "Hello my name is dhruv and you know what 'I am Batman'.";
			byte[] byteArray = secretMsg.getBytes();

            int temp = fis.read();
			while(temp>-1){
				counter++;
				if(counter==5229){
					fos.write(secretMsg.length());
				}
				if(counter>=5230 && counter<(5230+byteArray.length)){
					fos.write(byteArray[counter-5230]);
				}
				else{
					fos.write(temp);
					temp = fis.read();	
				}

				
			}

			fos.close();
			fis.close();

			System.out.println("New file created");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		

	}
} 
