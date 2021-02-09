package ch8;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import helper.SNP;

public class SerialObj {
	static List<SNP> listOfGenomeData = new ArrayList<>();
	
	public static void main(String[] args) {
		read();
		System.out.println(listOfGenomeData.size());
		writeXml();
		readXml();
		writeJson();
	}
	private static void readXml() {
		List<SNP> listOfGenomeDataFromXml = new ArrayList<>();
		
		try(  FileInputStream fis = new FileInputStream("settings.xml");
			    XMLDecoder decoder = new XMLDecoder(fis);){
			
			listOfGenomeDataFromXml = (List<SNP>)decoder.readObject();
			System.out.println(listOfGenomeDataFromXml.get(2));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void writeJson() {
		// TODO Auto-generated method stub
		
	}
	private static void writeXml() {
		
		try (FileOutputStream fos= new FileOutputStream("settings.xml");
				XMLEncoder encoder = new XMLEncoder(fos);){
			
			
			for(SNP snp:listOfGenomeData) {
				encoder.writeObject(snp);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    
		
	}
	static void read() {
	
	
	Path genes = Paths.get("E:\\gdocks", "Downloads","ManuSporny-genome.txt");


	
	try(Stream<String> stream = Files.lines(genes)){
		stream
		.filter( lines -> lines.startsWith("#") == false )
		.forEach(
			line ->{
				String[] arr = line.split("\t");
				SNP snp = new SNP(arr[0], arr[1], Long.parseLong(arr[2]), arr[3]);
				listOfGenomeData.add(snp);
				
		});
		
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();

	}
}
}
